package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House2 extends Tile {
	
	public House2(int id) {
		super(Assets.house2, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
