package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House11 extends Tile {
	
	public House11(int id) {
		super(Assets.house11, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
