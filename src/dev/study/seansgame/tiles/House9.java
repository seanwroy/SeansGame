package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House9 extends Tile {
	
	public House9(int id) {
		super(Assets.house9, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
