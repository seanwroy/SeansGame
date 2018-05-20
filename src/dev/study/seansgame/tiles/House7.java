package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House7 extends Tile {
	
	public House7(int id) {
		super(Assets.house7, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
