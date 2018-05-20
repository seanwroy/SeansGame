package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House13 extends Tile {
	
	public House13(int id) {
		super(Assets.house13, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
