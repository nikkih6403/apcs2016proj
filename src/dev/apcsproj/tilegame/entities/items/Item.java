package dev.apcsproj.tilegame.entities;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.Entity;

public abstract class Item extends Entity
{
	private int count;
	private boolean visible;
	public Item(Handler handler, int x, int y, int width, int height, boolean visible)
	{
		super(handler,x, y, width, height);
		this.visible = visible;
		
	}
}
