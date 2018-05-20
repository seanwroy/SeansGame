package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House16 extends Tile {
	
	public House16(int id) {
		super(Assets.house16, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
