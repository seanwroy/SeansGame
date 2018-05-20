package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class House1 extends Tile {
	
	public House1(int id) {
		super(Assets.house1, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
