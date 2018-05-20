package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House6 extends Tile {
	
	public House6(int id) {
		super(Assets.house6, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
