package dev.study.seansgame.worlds;

import java.awt.Graphics;

import dev.study.seansgame.Game;
import dev.study.seansgame.Handler;
import dev.study.seansgame.entities.EntityManager;
import dev.study.seansgame.entities.creatures.Player;
import dev.study.seansgame.entities.statics.FullTree;
import dev.study.seansgame.entities.statics.Rock1;
import dev.study.seansgame.entities.statics.Rock2;
import dev.study.seansgame.entities.statics.Rock3;
import dev.study.seansgame.entities.statics.Rock4;
import dev.study.seansgame.entities.statics.Rock5;
import dev.study.seansgame.entities.statics.Rock6;
import dev.study.seansgame.entities.statics.Stump1;
import dev.study.seansgame.entities.statics.Stump2;
import dev.study.seansgame.entities.statics.Tree;
import dev.study.seansgame.tiles.Tile;
import dev.study.seansgame.utils.Utils;

public class World {
	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	//Entities
	private EntityManager entityManager;
	
	public World(Handler handler, String path) {
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		entityManager.addEntity(new Tree(handler, 120, 150));
		entityManager.addEntity(new Tree(handler, 320, 620));
		entityManager.addEntity(new Tree(handler, 520, 50));
		entityManager.addEntity(new Tree(handler, 250, 100));
		entityManager.addEntity(new Rock1(handler, 80, 800));
		entityManager.addEntity(new Rock6(handler, 120, 820));
		entityManager.addEntity(new Stump1(handler, 940, 450));
		entityManager.addEntity(new Stump2(handler, 360, 250));
		entityManager.addEntity(new Rock5(handler, 900, 100));		
		entityManager.addEntity(new Rock4(handler, 760, 600));
		entityManager.addEntity(new Rock3(handler, 600, 740));
		entityManager.addEntity(new Stump1(handler, 620, 520));
		entityManager.addEntity(new Stump2(handler, 1000, 500));
		entityManager.addEntity(new Rock1(handler, 270, 750));
		entityManager.addEntity(new Rock2(handler, 930, 600));
		entityManager.addEntity(new Stump1(handler, 1100, 250));
		entityManager.addEntity(new Rock1(handler, 920, 770));
		entityManager.addEntity(new Rock4(handler, 1050, 300));
		entityManager.addEntity(new Rock5(handler, 1000, 230));
		entityManager.addEntity(new Rock3(handler, 840, 330));
		entityManager.addEntity(new Stump2(handler, 100, 670));
		entityManager.addEntity(new FullTree(handler, 470, 160));
		entityManager.addEntity(new FullTree(handler, 270, 760));
		entityManager.addEntity(new FullTree(handler, 700, 460));
		
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void tick() {
		entityManager.tick();

	}
	
	public void render(Graphics g) {
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(width, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart; y < yEnd; y++) {
			for(int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), 
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
				
				
			}
		}
		//Entities
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y) {
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.dirtTile;
		return t;
	}
	
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
