package dev.apcsproj.tilegame.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

import dev.apcsproj.tilegame.Handler;
import dev.apcsproj.tilegame.entities.creatures.Player;

public class EntityManager 
{
	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	private Comparator<Entity> renderSorter = new Comparator<Entity>(){
		@Override
		public int compare(Entity a, Entity b)
		{
			if(a.getYPos() * 32 + a.getHeight() < b.getYPos() * 32 + b.getHeight())
				return -1;
			return 1;
		}
	};
	public EntityManager(Handler handler, Player player)
	{
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
		addEntity(player);
	}
	public void tick()
	{
		for(int i = 0; i < entities.size(); i++)
		{
			Entity e = entities.get(i);
			e.tick();
		}
		entities.sort(renderSorter);
	}
	public void render(Graphics g)
	{
		for(Entity e : entities)
		{
			e.render(g);
		}
	}
	public void addEntity(Entity e)
	{
		entities.add(e);
	}
	public Player getPlayer()
	{
		return player;
	}
	public void setPlayer(Player player) 
	{
		this.player = player;
	}
	public Handler getHandler() {
		return handler;
	}
	public ArrayList<Entity> getEntities() 
	{
		return entities;
	}
	
}
