package dev.apcsproj.tilegame.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.apcsproj.tilegame.Handler;

public abstract class Entity 
{
	protected Handler handler;
	protected int xPos, yPos;
	protected int width, height;
	protected int id;
	
	public Entity(Handler handler, int x, int y, int width, int height)
	{
		this.handler = handler;
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void tick();
	public abstract void render(Graphics graphics);
	public abstract Entity makeCopy();
	
	public boolean checkEntityCollisions()
	{
		return false;
	}
	public void getCollisionBounds()
	{
		System.out.println("get col bounds");
	}
	public float getXPos()
	{
		return xPos;
	}
	public void setXPos(int x)
	{
		xPos = x;
	}
	public float getYPos()
	{
		return yPos;
	}
	public void setYPos(int y)
	{
		yPos = y;
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
}
