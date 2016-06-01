package dev.apcsproj.tilegame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener
{
	private boolean[] keys;
	private boolean up, down, left, right, start, interact;
	
	public KeyManager()
	{
		keys = new boolean[256];
	}

	public void tick()
	{
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
		start = keys[KeyEvent.VK_P];
		interact = keys[KeyEvent.VK_SPACE];
	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		keys[e.getKeyCode()] = true;
	}
	
	@Override
	public void keyReleased(KeyEvent e) 
	{
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}
	public boolean isUp() 
	{
		return up;
	}

	public boolean isDown() 
	{
		return down;
	}

	public boolean isLeft()
	{
		return left;
	}

	public boolean isRight()
	{
		return right;
	}

	public boolean isStart()
	{
		return start;
	}

	public boolean isInteract() 
	{
		return interact;
	}


}
