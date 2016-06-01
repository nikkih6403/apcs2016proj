package dev.apcsproj.tilegame.entities.creatures;

import dev.apcsproj.tilegame.Handler;

public class Enemy extends Creature
{
	public Enemy(Handler handler, int x, int y, int width, int height)
	{
		super(handler, x, width, height, height);
		
	}
	
	public void setStats(int[] stats)
	{
		
	}

	public Enemy createEnemy(int[] stats) 
	{
		return null;
	}
}
