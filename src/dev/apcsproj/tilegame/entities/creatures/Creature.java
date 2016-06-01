package dev.apcsproj.tilegame.entities.creatures;

import java.awt.Graphics;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.Entity;

public class Creature extends Entity
{
	public static final int DEFAULT_CREATURE_WIDTH = 64;
	public static final int DEFAULT_CREATURE_HEIGHT = 64;
	protected int hp;
	protected int str;
	protected int def;
	protected int spd;
	
	public Creature(Handler handler, int x, int y, int width, int height)
	{
		super(handler, x, y, width, height);
		
	}

	@Override
	public void tick() 
	{
		
	}

	@Override
	public void render(Graphics graphics) 
	{
		
	}

	@Override
	public Entity makeCopy() 
	{
		return null;
	}
}
