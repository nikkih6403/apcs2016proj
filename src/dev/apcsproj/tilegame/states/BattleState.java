package dev.apcsproj.tilegame.states;

import java.awt.Graphics;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.battles.Battle;

public class BattleState extends State
{
	private Battle battle;
	
	public BattleState(Handler handler)
	{
		super(handler);
		battle = new Battle(handler);
	}

	@Override
	public void tick() 
	{
		battle.tick();
	}

	@Override
	public void render(Graphics graphics) 
	{
		battle.render(graphics);
	}

	public Battle getBattle()
	{
		return battle;
	}

	public void setBattle(Battle battle) 
	{
		this.battle = battle;
	}
}
