package dev.apcsproj.tilegame.worlds;

import java.awt.Graphics;
import chn.util.*;

import dev.apcsproj.tilegame.worlds.Map;
import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.EntityManager;

public class World 
{
	private Handler handler;
	private Map[][] world;
	private int width, height;
	private int 
	
	public World(Handler handler, String path)
	{
		this.handler = handler;
		loadWorld(path);
	}
	public void tick()
	{
		
	}
	
	public void render(Graphics graphics)
	{
		
	}
	public void loadWorld(String path)
	{
		FileInput inFile = new FileInput(path);
		
		width = inFile.readInt();
		height = inFile.readInt();
		world = new Map[width][height];
		int[][] tempMapHolder = new int[width][height];
		for(int x = 0; x < width; x++)
			for(int y = 0; y < height; y++)
			{
				if(inFile.readInt() == 1)
				{
					tempMapHolder[x][y] = 1;
				}
			}
		for(int x = 0; x < width; x++)
			for(int y = 0; y < height; y++)
			{
				if(tempMapHolder[x][y] == 1)
					world[x][y] = (new Map(handler, inFile, x, y));
			}
	}
}
