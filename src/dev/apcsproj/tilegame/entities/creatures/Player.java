package dev.apcsproj.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.creatures.player_moves.PlayerMove;
import dev.apcsproj.tilegame.gfx.Animation;

public class Player extends Creature 
{
	private int maxMp;
	private int mp;
	private boolean moving;
	private boolean textToScreen;
	private boolean faceUp, faceDown, faceRight, faceLeft;
	private BufferedImage upImage, downImage, rightImage, leftImage;
	private Animation animDown, animUp, animLeft, animRight;
	private int xOffset, yOffset;
	
	public Player(Handler handler, int x, int y, int width, int height, int mapId, int battleId, int mp) 
	{
		super(handler, x, y, width, height, mapId, battleId);
		maxMp = mp;
		this.mp = mp;
		moving = false;
		textToScreen = false;
		xOffset = 0;
		yOffset = 0;
		resetFace();
		
		//animDown = new Animation(500, Assets.player_down);
		//animUp = new Animation(500, Assets.player_up);
		//animLeft = new Animation(500, Assets.player_left);
		//animRight = new Animation(500, Assets.player_right);
	
	}
	
	private void getInput()
	{
		if(!moving && !textToScreen)
		{
			if(handler.getKeymanager().isDown())
			{
				resetFace();
				faceDown = true;
				walkDown();
			}
				
			else if(handler.getKeymanager().isLeft())
			{
				resetFace();
				faceLeft = true;
				walkLeft();
			}
			else if(handler.getKeymanager().isRight())
			{
				resetFace();
				faceRight = true;
				walkRight();
			}
			else if(handler.getKeymanager().isUp())
			{
				resetFace();
				faceUp = true;
				walkUp();
			}
			else if(handler.getKeymanager().isInteract())
			{
				handler.getEntityManager().checkInteract();
			}
		}
		else 
			if(textToScreen && !moving && handler.getKeymanager().isInteract())
			{
				handler.getEntityManager().clickText();
			}
	}
	private void resetFace()
	{
		faceUp = false;
		faceDown = false;
		faceRight = false;
		faceLeft = false;
	}
	private void walkUp()
	{
		if(yOffset == 0)
		{
			moving = true;
			yOffset--;
		}
		else if(yOffset == 15)
		{
			yOffset = 0;
			moving = false;
			yPos--;
		}
		else
			yOffset--;
	}
	private void walkDown()
	{
		if(yOffset == 0)
		{
			moving = true;
			yOffset++;
		}
		else if(yOffset == 15)
		{
			yOffset = 0;
			moving = false;
			yPos++;
		}
		else
			yOffset++;
	}
	private void walkLeft()
	{
		if(xOffset == 0)
		{
			moving = true;
			xOffset--;
		}
		else if(xOffset == 15)
		{
			xOffset = 0;
			moving = false;
			xPos--;
		}
		else
			xOffset--;
	}
	private void walkRight()
	{
		if(xOffset == 0)
		{
			moving = true;
			xOffset++;
		}
		else if(xOffset == 15)
		{
			xOffset = 0;
			moving = false;
			xPos++;
		}
		else
			xOffset++;
	}
	public void tick()
	{
		if(moving)
		{
			if(faceDown)
				animDown.tick();
			else
				animDown.resetFrames();
			
			if(faceRight)
				animRight.tick();
			else
				animRight.resetFrames();
			
			if(faceLeft)
				animLeft.tick();
			else
				animLeft.resetFrames();
			
			if(faceUp)
				animUp.tick();
			else
				animUp.resetFrames();
		}
		else
		{
			animDown.resetFrames();
			animRight.resetFrames();
			animLeft.resetFrames();
			animUp.resetFrames();
		}
		getInput();
	}
	
	public void render(Graphics g)
	{
		g.drawImage(getCurrentAnimationFrame(), (xPos * 16) + (xOffset), (yPos * 16) + (yOffset), width, height, null);
	}
	
	private BufferedImage getCurrentAnimationFrame()
	{
		if(moving)
		{
			if(faceDown)
				return animDown.getCurrentFrame();
			else if (faceLeft)
				return animLeft.getCurrentFrame();
			else if (faceRight)
				return animRight.getCurrentFrame();
			else if (faceUp)
				return animUp.getCurrentFrame();
			else
				return animDown.getCurrentFrame();
		}
		else
		{
			if(faceDown)
				return downImage;
			else if(faceLeft)
				return leftImage;
			else if(faceRight)
				return rightImage;
			else if(faceUp)
				return upImage;
			else 
				return downImage;
		}
	}
	public void addAttack(PlayerMove move)
	{
		int x = 0;
		while(x < 4 && attacks[x] != null)
		{
			x++;
		}
		if(x < 4)
		{
			attacks[x] = move;
		}
		else
			System.out.println("Attacks are full");
	}
	
	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

	public boolean isFaceDown() {
		return faceDown;
	}

	public boolean isFaceRight() {
		return faceRight;
	}

	public boolean isFaceLeft() {
		return faceLeft;
	}
	
	public void setTextToScreen(boolean a)
	{
		textToScreen = a;
	}
}
