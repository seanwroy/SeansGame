package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House19 extends Tile {
	
	public House19(int id) {
		super(Assets.house19, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
