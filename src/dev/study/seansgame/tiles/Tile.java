package dev.study.seansgame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile rockTile = new RockTile(2);
	public static Tile treeTile = new TreeTile(3);
	public static Tile waterTile = new WaterTile(4);
	public static Tile wallTile = new WallTile(5);
	public static Tile House1 = new House1(6);
	public static Tile House2 = new House2(7);
	public static Tile House3 = new House3(8);
	public static Tile House4 = new House4(9);
	public static Tile House5 = new House5(10);
	public static Tile House6 = new House6(11);
	public static Tile House7 = new House7(12);
	public static Tile House8 = new House8(13);
	public static Tile House9 = new House9(14);
	public static Tile House10 = new House10(15);
	public static Tile House11 = new House11(16);
	public static Tile House12 = new House12(17);
	public static Tile House13 = new House13(18);
	public static Tile House14 = new House14(19);
	public static Tile House15 = new House15(20);
	public static Tile House16 = new House16(21);
	public static Tile House17 = new House17(22);
	public static Tile House18 = new House18(23);
	public static Tile House19 = new House19(24);
	public static Tile House20 = new House20(25);
	public static Tile Boundary1 = new Boundary1(26);
	public static Tile Boundary2 = new Boundary2(27);
	public static Tile Boundary3 = new Boundary3(28);
	public static Tile stone2 = new RockTile2(29);
	public static Tile dirtTile2 = new DirtTile2(30);
	public static Tile dirtyTile = new DirtyTile(31);
	
	//CLASS
	
	public static final int TILEWIDTH = 64, 
							TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}

}
