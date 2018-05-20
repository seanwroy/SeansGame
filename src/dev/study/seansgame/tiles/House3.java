package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House3 extends Tile {
	
	public House3(int id) {
		super(Assets.house3, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
