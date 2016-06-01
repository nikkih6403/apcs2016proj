package dev.apcsproj.tilegame.states;

import java.awt.Graphics;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.worlds.World;

public class GameState extends State
{
	private World world;
	
	public GameState(Handler handler)
	{
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
	}
	
	public void tick()
	{
		world.tick();
	}
	
	public void render(Graphics graphics) 
	{
		world.render(graphics);	
	}
	
}
