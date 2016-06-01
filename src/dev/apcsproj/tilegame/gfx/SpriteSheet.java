package dev.apcsproj.tilegame.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet 
{
	private BufferedImage mySheet;
	
	/*
	 * constructor
	 */
	public SpriteSheet(BufferedImage sheet)
	{
		mySheet = sheet;
	}
	
	/*
	 * Tool for cropping smaller images so we don't have to load a crap ton of images
	 */
	public BufferedImage crop(int x, int y, int width, int height)
	{
		return mySheet.getSubimage(x, y, width, height);
	}
}
