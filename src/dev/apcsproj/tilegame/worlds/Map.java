package dev.apcsproj.tilegame.worlds;

import chn.util.*;
import dev.apcsproj.tilegame.Coordinate;
import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.Item;
import dev.apcsproj.tilegame.entities.creatures.Enemy;
import dev.apcsproj.tilegame.entities.creatures.NPC;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Map
{
	private Space space[][];
	private int width;
	private int height;
	private Handler handler;
	private int worldX;
	private int worldY;
	
	public Map(Handler handler, FileInput inFile, int x, int y)
	{
		this.handler = handler;
		worldX = x;
		worldY = y;
		loadTiles(inFile);
	}
	
	private void loadTiles(FileInput inFile)
	{
		width = inFile.readInt();
		height = inFile.readInt();
		int type;
		for(int x = 0; x < width; x++)
			for(int y = 0; y < height; y++)
			{
				space[x][y] = new Space(handler.getTile(inFile.readInt()), x, y);
			}
		
		type = inFile.readInt();
		while(type != -1)
		{
			//coordinates
			int x = inFile.readInt();
			int y = inFile.readInt();
			int id = inFile.readInt();
			switch(type)
			{
				case 1: //Enemy
					int[] stats = new int[8];
					for(int z = 0; z < 8; z++)
						stats[z] = inFile.readInt();
					space[x][y].setEntity(fillEnemy(id, stats));
					break;
				case 2: //Item
					space[x][y].setEntity(fillItem(id));
					break;
				case 3: //NPC
					space[x][y].setEntity(fillNPC(id));
					break;
				case 4: //Portal 
					space[x][y].setEntity(fillPortal(new Coordinate(inFile.readInt(), inFile.readInt()), new Coordinate(inFile.readInt(), inFile.readInt()), inFile.readInt()))
					break;
				case 5: //Breakable/Unlockable
					space[x][y].setEntity(fillBarrier(inFile.readInt(), inFile.readInt(), inFile.readInt()));
					break;
				default:
					System.out.println("invalid type during read");
					break;
			}
			type = inFile.readInt();
		}
	}
	private Enemy fillEnemy(int id, int[] stats)
	{
		return handler.getEnemy(id, stats);
	}
	private Item fillItem(int id)
	{
		return (Item)handler.getItem(id);
	}
	private NPC fillNPC(int id)
	{
		return (NPC)handler.getNPC(id);
	}
	private Portal fillPortal(Coordinate targetMapLocation, Coordinate targetGridLocation, int isOpen)
	{
		return new Portal(targetMapLocation, targetGridLoction, isOpen);
	}
	private Barrier fillBarrier(int strNeeded, int dexNeeded, int needsKey)
	{
		return new Barrier(strNeeded, dexNeeded, needsKey);
	}
	public void tick()
	{
		for(int x = 0; x < width; x++)
			for(int y = 0; y < height; y++)
				space[x][y].tick();
	}
	public void render(Graphics g)
	{
		for(int x = 0; x < width; x++)
			for(int y = 0; y < height; y++)
				space[x][y].render(g);
	}
	public int getWorldX()
	{
		return worldX;
	}
	public int getWorldY()
	{
		return worldY;
	}
}
