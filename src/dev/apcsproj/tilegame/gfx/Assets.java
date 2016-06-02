package nh.rpggame.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Assets {
	
	//SUBJECT TO CHANGE
	private static final int width = 16;
	private static final int height = 16;
	private static final int widthChar = 50;
	private static final int heightChar = 50;
	private static final int widthFont = 25;
	private static final int heightFont = 25;
	
	//TO BE FILLED
	//private static BufferedImage lots and loooots;
	/*
	 * ADD ME THOSE SPRITES!!!!
	 * and make the accessors and modifiers
	 * 
	 */
	public static BufferedImage player,dirt,grass,rock,tree, path, grassPatch, black, white, 
	door, cave, caveWall, tombstone, capA, capB, capC, capD, capE, capF, capG, capH, capI, capJ, capK, 
	capL, capM, capN, capO, capP, capQ, capR, capS, capT, capU, capV, capW, capX, capY, capZ, 
	a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, zero, one, two, three, four, five, six, seven, eight, nine, exclamation, 
	question, period, comma;
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
		black = tiles.crop(width * 3, height * 5, width, height);
		white = tiles.crop(width * 2, height * 5, width, height);
		door = tiles.crop(0, height * 5, width + 6, height * 2);
		cave = tiles.crop(width * 4, height * 2, width * 4, height * 4);
		caveWall = tiles.crop(width * 4, height * 4, width, height);
		tombstone = tiles.crop(width * 2, height * 3, width * 2, height * 2);
		
		capA = fonts.crop(0, 0, widthFont, heightFont);
		capB = fonts.crop(widthFont, 0, widthFont, heightFont);
		capC = fonts.crop(widthFont * 2, 0, widthFont, heightFont);
		capD = fonts.crop(widthFont * 3, 0, widthFont, heightFont);
		capE = fonts.crop(widthFont * 4, 0, widthFont, heightFont);
		capF = fonts.crop(widthFont * 5, 0, widthFont, heightFont);
		capG = fonts.crop(widthFont * 6, 0, widthFont, heightFont);
		capH = fonts.crop(widthFont * 7, 0, widthFont, heightFont);
		capI = fonts.crop(widthFont * 8, 0, widthFont, heightFont);
		capJ = fonts.crop(widthFont * 9, 0, widthFont, heightFont);
		capK = fonts.crop(widthFont * 10, 0, widthFont, heightFont);
		capL = fonts.crop(widthFont * 11, 0, widthFont, heightFont);
		capM = fonts.crop(widthFont * 12, 0, widthFont, heightFont);
		capN = fonts.crop(widthFont * 13, 0, widthFont, heightFont);
		capO = fonts.crop(widthFont * 14, 0, widthFont, heightFont);
		capP = fonts.crop(widthFont * 15, 0, widthFont, heightFont);
		capQ = fonts.crop(0, heightFont, widthFont, heightFont);
		capR = fonts.crop(widthFont, heightFont, widthFont, heightFont);
		capS = fonts.crop(widthFont * 2, heightFont, widthFont, heightFont);
		capT = fonts.crop(widthFont * 3, heightFont, widthFont, heightFont);
		capU = fonts.crop(widthFont * 4, heightFont, widthFont, heightFont);
		capV = fonts.crop(widthFont * 5, heightFont, widthFont, heightFont);
		capW = fonts.crop(widthFont * 6, heightFont, widthFont, heightFont);
		capX = fonts.crop(widthFont * 7, heightFont, widthFont, heightFont);
		capY = fonts.crop(widthFont * 8, heightFont, widthFont, heightFont);
		capZ = fonts.crop(widthFont * 9, heightFont, widthFont, heightFont);
		a = fonts.crop(widthFont * 10, heightFont, widthFont, heightFont);
		b = fonts.crop(widthFont * 11, heightFont, widthFont, heightFont);
		c = fonts.crop(widthFont * 12, heightFont, widthFont, heightFont);
		d = fonts.crop(widthFont * 13, heightFont, widthFont, heightFont);
		e = fonts.crop(widthFont * 14, heightFont, widthFont, heightFont);
		f = fonts.crop(widthFont * 15, heightFont, widthFont, heightFont);
		g = fonts.crop(0, heightFont * 2, widthFont, heightFont);
		h = fonts.crop(widthFont, heightFont * 2, widthFont, heightFont);
		i = fonts.crop(widthFont * 2, heightFont * 2, widthFont, heightFont);
		j = fonts.crop(widthFont * 3, heightFont * 2, widthFont, heightFont);
		k = fonts.crop(widthFont * 4, heightFont * 2, widthFont, heightFont);
		l = fonts.crop(widthFont * 5, heightFont * 2, widthFont, heightFont);
		m = fonts.crop(widthFont * 6, heightFont * 2, widthFont, heightFont);
		n = fonts.crop(widthFont * 7, heightFont * 2, widthFont, heightFont);
		o = fonts.crop(widthFont * 8, heightFont * 2, widthFont, heightFont);
		p = fonts.crop(widthFont * 9, heightFont * 2, widthFont, heightFont);
		q = fonts.crop(widthFont * 10, heightFont * 2, widthFont, heightFont);
		r = fonts.crop(widthFont * 11, heightFont * 2, widthFont, heightFont);
		s = fonts.crop(widthFont * 12, heightFont * 2, widthFont, heightFont);
		t = fonts.crop(widthFont * 13, heightFont * 2, widthFont, heightFont);
		u = fonts.crop(widthFont * 14, heightFont * 2, widthFont, heightFont);
		v = fonts.crop(widthFont * 15, heightFont * 2, widthFont, heightFont);
		w = fonts.crop(0, heightFont * 3, widthFont, heightFont);
		x = fonts.crop(widthFont, heightFont * 3, widthFont, heightFont);
		y = fonts.crop(widthFont * 2, heightFont * 3, widthFont, heightFont);
		z = fonts.crop(widthFont * 3, heightFont * 3, widthFont, heightFont);
		zero = fonts.crop(widthFont * 4, heightFont * 3, widthFont, heightFont);
		one = fonts.crop(widthFont * 5, heightFont * 3, widthFont, heightFont);
		two = fonts.crop(widthFont * 6, heightFont * 3, widthFont, heightFont);
		three = fonts.crop(widthFont * 7, heightFont * 3, widthFont, heightFont);
		four = fonts.crop(widthFont * 8, heightFont * 3, widthFont, heightFont);
		five = fonts.crop(widthFont * 9, heightFont * 3, widthFont, heightFont);
		six = fonts.crop(widthFont * 10, heightFont * 3, widthFont, heightFont);
		seven = fonts.crop(widthFont * 11 , heightFont * 3, widthFont, heightFont);
		eight = fonts.crop(widthFont * 12, heightFont * 3, widthFont, heightFont);
		nine = fonts.crop(widthFont * 13, heightFont * 3, widthFont, heightFont);
		exclamation = fonts.crop(widthFont * 14, heightFont * 3, widthFont, heightFont);
		question = fonts.crop(widthFont * 15, heightFont * 3, widthFont, heightFont);
		comma = fonts.crop(0, heightFont * 4, widthFont, heightFont);
		period = fonts.crop(widthFont, heightFont * 4, widthFont, heightFont);
		
		
		
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
