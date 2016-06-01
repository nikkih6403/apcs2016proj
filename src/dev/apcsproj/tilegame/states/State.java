package dev.apcsproj.tilegame.states;

import java.awt.Graphics;

import dev.apcsproj.tilegame.Handler;

public abstract class State 
{
	//CLASS
	
	protected Handler handler;
	
	public State(Handler handler)
	{
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics graphics);

}
