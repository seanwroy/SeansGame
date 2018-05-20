package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House5 extends Tile {
	
	public House5(int id) {
		super(Assets.house5, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
