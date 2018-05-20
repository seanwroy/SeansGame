package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House12 extends Tile {
	
	public House12(int id) {
		super(Assets.house12, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
