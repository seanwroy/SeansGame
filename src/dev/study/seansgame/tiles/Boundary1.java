package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class Boundary1 extends Tile {

	public Boundary1(int id) {
		super(Assets.boundary1, id);

	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	

}
