package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House18 extends Tile {
	
	public House18(int id) {
		super(Assets.house18, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
