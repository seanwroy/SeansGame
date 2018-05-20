package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class Boundary3 extends Tile {

	public Boundary3(int id) {
		super(Assets.boundary3, id);

	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	

}
