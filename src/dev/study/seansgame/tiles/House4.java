package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House4 extends Tile {
	
	public House4(int id) {
		super(Assets.house4, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
