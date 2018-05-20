package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House8 extends Tile {

	public House8(int id) {
		super(Assets.house8, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
