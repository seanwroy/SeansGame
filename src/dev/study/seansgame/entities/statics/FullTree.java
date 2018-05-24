package dev.study.seansgame.entities.statics;

import java.awt.Graphics;

import dev.study.seansgame.Handler;
import dev.study.seansgame.gfx.Assets;
import dev.study.seansgame.items.Item;
import dev.study.seansgame.tiles.Tile;


public class FullTree extends StaticEntity {
	public FullTree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 3);
		
		bounds.x = 3;
		bounds.y = (int) (height / 3f);
		bounds.width = width - 24;
		bounds.height = (int) (height - height / 2.2f);
	}


	@Override
	public void tick() {

		
	}
	
	@Override
	public void die() {
		handler.getWorld().getItemManager().addItem(Item.woodItem.createNew((int) x, (int) y));
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.fulltree, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}