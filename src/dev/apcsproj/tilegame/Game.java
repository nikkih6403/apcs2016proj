package dev.apcsproj.tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.apcsproj.tilegame.display.Display;
import dev.apcsproj.tilegame.gfx.Assets;
import dev.apcsproj.tilegame.input.KeyManager;
import dev.apcsproj.tilegame.states.BattleState;
import dev.apcsproj.tilegame.states.GameState;
import dev.apcsproj.tilegame.states.MenuState;
import dev.apcsproj.tilegame.states.State;

public class Game implements Runnable
{
	private Display display;
	private int myWidth;
	private int myHeight;
	public String gameTitle;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bufferStrategy;
	private Graphics graphics;

	//States
	private State currentState;
	
	private State gameState;
	private State menuState;
	private State battleState;
	
	
	//Input
	private KeyManager keyManager;
	
	//Handler
	private Handler handler;
	/*
	 * Constructor for the game! Parameters are self-explanatory
	 */
	public Game(String title, int width, int height)
	{
		myWidth = width;
		myHeight = height;
		gameTitle = title;
		keyManager = new KeyManager();
	}
	
	/*
	 * initialize ... like EVERYTHING with this for the game
	 */
	private void init()
	{
		display = new Display(gameTitle, myWidth, myHeight);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		handler = new Handler(this);
		
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		battleState = new BattleState(handler);
		setState(menuState);
	}
	
	/*
	 * "tick" of the tick & render cycle
	 */
	private void tick()
	{
		
	}
	
	/*
	 * "render" of the tick & render cycle
	 */
	private void render()
	{
		bufferStrategy = display.getCanvas().getBufferStrategy();
		if(bufferStrategy == null)
		{
			display.getCanvas().createBufferStrategy(3);
		}
		else
		{
			graphics = bufferStrategy.getDrawGraphics();
			//Clear Screen
			graphics.clearRect(0, 0, myWidth, myHeight);
			//Then draw
			if(State.getState() != null)
				State.getState().render(graphics);
			
			
			//End Drawing
			bufferStrategy.show();
			graphics.dispose();
		}
	}
	
	/*
	 * Method that runs the game. Used in the Launcher class
	 */
	public void run()
	{
		init();
		
		//Make the game follow time
		int fps = 60;
		double timePerTick = 1000000000 / fps; //1 bil because nano seconds
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running)
		{
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1)
			{
				tick();
				render();
				ticks++;
				delta --;
			}
			
			if(timer >= 1000000000)
			{
				ticks = 0;
				timer = 0;
			}
		}
		stop();
	}
	
	public void setState(State state)
	{
		currentState = state;
	}
	
	public State getState()
	{
		return currentState;
	}
	
	public int getMyWidth() {
		return myWidth;
	}

	public int getMyHeight() {
		return myHeight;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public State getGameState() {
		return gameState;
	}

	public synchronized void start()
	{
		if(!running)
		{
			running = true;
			thread = new Thread(this);
			thread.start();
		}
	}
	
	public synchronized void stop()
	{
		if(running)
		{
			running = false;
			try 
			{
				thread.join();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
	}

	public KeyManager getKeyManager() 
	{
		return keyManager;
	}
	
	
}
