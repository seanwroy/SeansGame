package dev.study.seansgame.tiles;

import dev.study.seansgame.gfx.Assets;

public class WaterTile extends Tile {
	
	public WaterTile(int id) {
		super(Assets.water, id);
	}

	@Override
	public boolean isSolid() {
		return true;
	}
	
}
