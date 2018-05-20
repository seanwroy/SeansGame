package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class RockTile2 extends Tile {

	public RockTile2(int id) {
		super(Assets.stone, id);

	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
