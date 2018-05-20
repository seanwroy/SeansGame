package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class Boundary2 extends Tile {

	public Boundary2(int id) {
		super(Assets.boundary2, id);

	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	

}
