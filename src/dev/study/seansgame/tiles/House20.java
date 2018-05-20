package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House20 extends Tile {
	
	public House20(int id) {
		super(Assets.house20, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
