package dev.study.seansgame.entities.statics;

import dev.study.seansgame.Handler;
import dev.study.seansgame.entities.Entity;

public abstract class StaticEntity extends Entity {
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

}
