package dev.apcsproj.tilegame.battles;

import java.awt.Graphics;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.creatures.Enemy;
import dev.apcsproj.tilegame.entities.creatures.Player;

public class Battle 
{
	private boolean isBattling;
	private Handler handler;
	private BattleManager battleManager;
	private Player player;
	private Enemy enemy;
	public Battle(Handler handler)
	{
		this.handler = handler;
		battleManager = new BattleManager();
	}
	
	public void startBattle(Player player, Enemy enemy)
	{
		this.player = player;
		this.enemy = enemy;
		battleManager.link(this.player, this.enemy);
		
	}
	public void tick()
	{
		battleManager.tick();
	}
	
	public void render(Graphics g)
	{
		
	}
}
