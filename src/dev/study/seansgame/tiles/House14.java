package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House14 extends Tile {
	
	public House14(int id) {
		super(Assets.house14, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
