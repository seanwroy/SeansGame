package dev.study.seansgame.states;

import java.awt.Graphics;
import dev.study.seansgame.Game;
import dev.study.seansgame.Handler;
import dev.study.seansgame.entities.creatures.Player;
import dev.study.seansgame.entities.statics.Tree;
import dev.study.seansgame.gfx.Assets;
import dev.study.seansgame.tiles.Tile;
import dev.study.seansgame.worlds.World;

public class GameState extends State {
	private World world;

	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
	}

	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}

}
