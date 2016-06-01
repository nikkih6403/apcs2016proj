package dev.apcsproj.tilegame.worlds;

import java.awt.Graphics;

import dev.apcsproj.tilegame.entities.Entity;
import dev.apcsproj.tilegame.tiles.Tile;

public class Space 
{
	private Tile tile;
	private Entity entity;
	private int xMap;
	private int yMap;
	
	public Space(Tile tile, int x, int y)
	{
		this.tile = tile;
		entity = null;
		xMap = x;
		yMap = y;
	}
	
	public void tick()
	{
		if(entity != null)
			entity.tick();
	}
	
	public void render(Graphics g)
	{
		tile.render(g, xMap * 64, yMap * 64);
		if(entity != null)
			entity.render(g);
	}
	
	public void setEntity(Entity e)
	{
		entity = e;
	}
}
