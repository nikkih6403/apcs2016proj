package nh.rpggame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	//SUBJECT TO CHANGE
	private static final int width = 16;
	private static final int height = 16;
	private static final int widthChar = 50;
	private static final int heightChar = 50;
	private static final int widthFont = 20;
	private static final int heightFont = 20;
	
	//TO BE FILLED
	//private static BufferedImage lots and loooots;
	/*
	 * ADD ME THOSE SPRITES!!!!
	 * and make the accessors and modifiers
	 * 
	 */
	public static BufferedImage player,dirt,grass,rock,tree, path, grassPatch, capA, capB, capC, capD, capE, 
	capF, capG, capH, capI, capJ, capK, capL, capM, capN, capO, capP, capQ, capR, capS, 
	capT, capU, capV, capW, capX, capY, capZ, a, b, c, d, e, f, g, h, i, j, k, l, m, n,
	o, p, q, r, s, t, u, v, w, x, y, z, exclamation, question, period, comma;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	
	public static void init()
	{
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/new character sprite.png"));
		SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImage("/textures/tile sprite.png"));
		SpriteSheet fonts = new SpriteSheet(ImageLoader.loadImage("/textures/fonts.png"));
		//Insert all of the sheet instances here!
		//Ex Format: player_down = new BufferedImage[2];
		// player_down[0] = sheet.crop(width * 4, 0, width, height);
		
		player_down = new BufferedImage[3];
		player_up = new BufferedImage[3];
		player_left = new BufferedImage[3];
		player_right = new BufferedImage[3];
		
		player_down[0] = sheet.crop(widthChar * 7, heightChar * 2, widthChar, heightChar);
		player_down[1] = sheet.crop(0, heightChar * 3, widthChar, heightChar);
		player_down[2] = sheet.crop(widthChar, heightChar  * 3, widthChar, heightChar);
		player_up[0] = sheet.crop(widthChar * 5, heightChar * 3, widthChar, heightChar);
		player_up[1] = sheet.crop(widthChar * 6, heightChar * 3, widthChar, heightChar);
		player_up[2] = sheet.crop(widthChar * 7, heightChar * 3, widthChar, heightChar);
		player_left[0] = sheet.crop(widthChar * 2, heightChar * 3, widthChar, heightChar);
		player_left[1] = sheet.crop(widthChar * 3, heightChar * 3, widthChar, heightChar);
		player_left[2] = sheet.crop(widthChar * 4, heightChar * 3, widthChar, heightChar);
		player_right[0] = sheet.crop(widthChar * 3, heightChar * 2, widthChar, heightChar);
		player_right[1] = sheet.crop(widthChar * 4, heightChar * 2, widthChar, heightChar);
		player_right[2] = sheet.crop(widthChar * 5, heightChar * 2, widthChar, heightChar);
		
		player = sheet.crop(widthChar * 7, heightChar * 2, widthChar, heightChar);
		grass = tiles.crop(width * 2, height * 2,width,height);
		dirt = tiles.crop(width * 3, height * 2, width, height);
		rock = tiles.crop(width * 7, 0, width, height);
		path = tiles.crop(width * 7, height, width, height);
		tree = tiles.crop(width* 2, 0 , width * 2, height * 2);
		grassPatch = tiles.crop(0, height, width * 2, height * 2);
		
		capA = fonts.crop(0, 0, widthFont, heightFont);
		capB = fonts.crop(0, heightFont, widthFont, heightFont);
		/*capC = fonts.crop(0, 0, widthFont, heightFont);
		capD = fonts.crop(0, 0, widthFont, heightFont);
		capE = fonts.crop(0, 0, widthFont, heightFont);
		capF = fonts.crop(0, 0, widthFont, heightFont);
		capG = fonts.crop(0, 0, widthFont, heightFont);
		capH = fonts.crop(0, 0, widthFont, heightFont);
		capI = fonts.crop(0, 0, widthFont, heightFont);
		capJ = fonts.crop(0, 0, widthFont, heightFont);
		capK = fonts.crop(0, 0, widthFont, heightFont);
		capL = fonts.crop(0, 0, widthFont, heightFont);
		capM = fonts.crop(0, 0, widthFont, heightFont);
		capN = fonts.crop(0, 0, widthFont, heightFont);
		capO = fonts.crop(0, 0, widthFont, heightFont);
		capP = fonts.crop(0, 0, widthFont, heightFont);
		capQ = fonts.crop(0, 0, widthFont, heightFont);
		capR = fonts.crop(0, 0, widthFont, heightFont);
		capS = fonts.crop(0, 0, widthFont, heightFont);
		capT = fonts.crop(0, 0, widthFont, heightFont);
		capU = fonts.crop(0, 0, widthFont, heightFont);
		capV = fonts.crop(0, 0, widthFont, heightFont);
		capW = fonts.crop(0, 0, widthFont, heightFont);
		capX = fonts.crop(0, 0, widthFont, heightFont);
		capY = fonts.crop(0, 0, widthFont, heightFont);
		capZ = fonts.crop(0, 0, widthFont, heightFont);*/
		
		
		
		// honestly it's gonna be HUGE...
	}

	public BufferedImage getGrass() 
	{
		return grass;
	}
	
	public BufferedImage getDirt()
	{
		return dirt;
	}
	
	public BufferedImage getRock()
	{
		return rock;
	}
}
