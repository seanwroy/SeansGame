package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class DirtTile2 extends Tile {

	public DirtTile2(int id) {
		super(Assets.dirt, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
