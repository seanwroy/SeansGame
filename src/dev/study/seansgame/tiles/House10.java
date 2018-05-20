package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House10 extends Tile {
	
	public House10(int id) {
		super(Assets.house10, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
