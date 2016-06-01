package dev.apcsproj.tilegame;

import java.awt.image.BufferedImage;

import dev.apcsproj.tilegame.entities.Entity;
import dev.apcsproj.tilegame.entities.NPCS.NPC;
import dev.apcsproj.tilegame.entities.creatures.Enemy;
import dev.apcsproj.tilegame.input.KeyManager;
import dev.apcsproj.tilegame.tiles.Tile;
import dev.apcsproj.tilegame.worlds.World;

public class Handler 
{
	private Game game;
	//Every kind of tile inserted here
	private static Tile[] tiles = new Tile[256];
	
	//enemies, barriers, item
	private static BufferedImage[] textures = new BufferedImage[500];
	
	//Holds referrences to each NPC
	private static NPC[] NPCs = new NPC[5];
	
	
	public Handler(Game game)
	{
		this.game = game;
	}
	public KeyManager getKeymanager()
	{
		return game.getKeyManager();
	}
	public void addTile(Tile tile)
	{
		tiles[tile.getId()] = tile;
	}
	public void addTexture(BufferedImage texture, int id)
	{
		textures[id] = texture;
	}
	public void addNPC(NPC npc)
	{
		NPCs[npc.getId()] = npc;
	}
	public Tile getTile(int id)
	{
		return tiles[id];
	}
	public BufferedImage getTexture(int id)
	{
		return textures[id];
	}
	public NPC getNPC(int id)
	{
		return NPCs[id];
	}
	public Enemy getEnemy(int id, int[] stats)
	{
		return ((Enemy)entities[id]).createEnemy(stats);
	}
	public Entity getEntity(int id)
	{
		return entities[id].makeCopy();
	}
	public Game getGame()
	{
		return game;
	}
	
}
