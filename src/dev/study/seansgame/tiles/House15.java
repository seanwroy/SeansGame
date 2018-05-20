package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House15 extends Tile {
	
	public House15(int id) {
		super(Assets.house15, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
