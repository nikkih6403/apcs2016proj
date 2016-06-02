package dev.apcsproj.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets 
{
	//SUBJECT TO CHANGE
	private static final int width = 32;
	private static final int height = 32;
	private static final int widthChar = 50;
	private static final int heightChar = 50;
	
	//TO BE FILLED
	//private static BufferedImage lots and loooots;
	/*
	 * ADD ME THOSE SPRITES!!!!
	 * and make the accessors and modifiers
	 * 
	 */
	public static BufferedImage player,dirt,grass,stone;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	
	public static void init()
	{
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/new character sprite.png"));
		SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImae("/textures/tile sprite.png"));
		//Insert all of the sheet instances here!
		//Ex Format: player_down = new BufferedImage[2];
		// player_down[0] = sheet.crop(width * 4, 0, width, height);
		
		player_down = new BufferedImage[2];
		player_up = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_right = new BufferedImage[2];
		
		player_down[0] = sheet.crop(widthChar * 2, heightChar, widthChar, heightChar);
		player_down[1] = sheet.crop(widthChar * 3, heightChar, widthChar, heightChar);
		player_up[0] = sheet.crop(widthChar, heightChar, widthChar, heightChar);
		player_up[1] = sheet.crop(widthChar, heightChar, widthChar, heightChar);
		player_right[0] = sheet.crop(widthChar, heightChar, widthChar, heightChar);
		player_right[1] = sheet.crop(widthChar, heightChar, widthChar, heightChar);
		player_left[0] = sheet.crop(widthChar, heightChar, widthChar, heightChar);
		player_left[1] = sheet.crop(widthChar, heightChar, widthChar, heightChar);
		
		player = sheet.crop(0, 0, widthChar, heightChar);
		grass = sheet.crop(width * 2, height * 2,width,height);
		dirt = tiles.crop(width * 3, height * 2, width, height);
		stone = tiles.crop(width * 7, height, width, height);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// honestly it's gonna be HUGE...
	}

	public BufferedImage getDunegonFloor1() 
	{
		return DungeonFloor1;
	}
}
