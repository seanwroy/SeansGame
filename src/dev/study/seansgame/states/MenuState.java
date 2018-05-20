package dev.study.seansgame.states;

import java.awt.Color;
import java.awt.Graphics;
import dev.study.seansgame.Game;
import dev.study.seansgame.Handler;
import dev.study.seansgame.gfx.Assets;
import dev.study.seansgame.ui.ClickListener;
import dev.study.seansgame.ui.UIImageButton;
import dev.study.seansgame.ui.UIManager;

public class MenuState extends State {
	private UIManager uiManager;
	
	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.btn_start, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}	
		}));
	}
	
	public void tick() {
		uiManager.tick();
	}
	
	public void render(Graphics g) {
		uiManager.render(g);
	}

}
