package dev.apcsproj.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets 
{
	//SUBJECT TO CHANGE
	private static final int width = 32;
	private static final int height = 32;
	
	//TO BE FILLED
	//private static BufferedImage lots and loooots;
	/*
	 * ADD ME THOSE SPRITES!!!!
	 * and make the accessors and modifiers
	 * 
	 */
	
	public static void init()
	{
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		//Insert all of the sheet instances here!
		//Ex Format: player_down = new BufferedImage[2];
		// player_down[0] = sheet.crop(width * 4, 0, width, height);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// honestly it's gonna be HUGE...
	}

	public BufferedImage getDunegonFloor1() 
	{
		return DungeonFloor1;
	}
}
