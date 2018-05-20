package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House17 extends Tile {
	
	public House17(int id) {
		super(Assets.house17, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
