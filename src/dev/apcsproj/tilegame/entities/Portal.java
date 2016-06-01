package dev.apcsproj.tilegame.entities;

import java.awt.Graphics;

import dev.apcsproj.tilegame.Coordinate;

public class Portal extends Entity
{

	private Coordinate targetMapLocation;
	private Coordinate targetGridLocation;
	private int isOpen;
	
	public Portal(Coordinate targetMapLocation, Coordinate targetGridLocation, int isOpen)
	{
		this.targetMapLocation = targetMapLocation;
		this.targetGridLocation = targetGridLocation;
		this.isOpen = isOpen;
	}

	@Override
	public void tick() 
	{
		
	}

	@Override
	public void render(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entity makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}
}
