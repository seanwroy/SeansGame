package dev.study.seansgame;

import dev.study.seansgame.display.Display;

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("Sean's Game", 1024, 768);
		game.start();
	}
//640, 360
}