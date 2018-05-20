package dev.study.seansgame.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import dev.study.seansgame.Game;
import dev.study.seansgame.Handler;
import dev.study.seansgame.entities.Entity;
import dev.study.seansgame.gfx.Animation;
import dev.study.seansgame.gfx.Assets;

public class Player extends Creature {
	
	//Animations
	private Animation animDown, animUp, animRight, animLeft, animStill, animAttack;
	//Attack timer
	private long lastAttackTimer, attackCooldown = 1200, attackTimer = attackCooldown;
	private boolean attacking = false;
	private float xHit;
	private float yHit;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 16;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 32;
		
		//Animations
		animDown = new Animation(180, Assets.player_down);
		animUp = new Animation(180, Assets.player_up);
		animRight = new Animation(180, Assets.player_right);
		animLeft = new Animation(180, Assets.player_left);
		animStill = new Animation(180, Assets.player_still);
		animAttack = new Animation(120, Assets.attack);
	}

	@Override
	public void tick() {
		//Animations
		animAttack.tick();
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();
		animStill.tick();
		
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
		//Attack
		checkAttacks();
	}
	
	private void checkAttacks() {
		attackTimer += System.currentTimeMillis() - lastAttackTimer;
		lastAttackTimer = System.currentTimeMillis();
		if(attackTimer < attackCooldown)
			return;
		
			
		Rectangle cb = getCollisionBounds(0, 0);
		Rectangle ar = new Rectangle();
		int arSize = 40;
		ar.width = arSize;
		ar.height = arSize;	
		
		if(handler.getKeyManager().aUp) {
			ar.x = cb.x + cb.width / 2 - arSize / 2;
			ar.y = cb.y - arSize;
			attacking = true;
			xHit = ar.x;
			yHit = ar.y;
		}
		else if(handler.getKeyManager().aDown) {
			ar.x = cb.x + cb.width / 2 - arSize / 2;
			ar.y = cb.y + cb.height;
			attacking = true;
			xHit = ar.x;
			yHit = ar.y;
		}
		else if(handler.getKeyManager().aLeft) {
			ar.x = cb.x - arSize;
			ar.y = cb.y + cb.height / 2 - arSize / 2;
			attacking = true;
			xHit = ar.x;
			yHit = ar.y;
		}
		else if(handler.getKeyManager().aRight) {
			ar.x = cb.x + cb.width;
			ar.y = cb.y + cb.height / 2 - arSize / 2;
			attacking = true;
			xHit = ar.x;
			yHit = ar.y;
		}else {
			attacking = false;
			return;
		}
		
		attackTimer = 0;
		
		for(Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if(e.equals(this))
				continue;
			if(e.getCollisionBounds(0, 0).intersects(ar)) {
				e.hurt(1);
				return;
			}
		}
	}
	
	public void die(){
		System.out.println("You've died.");
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		if (attacking) {
			  g.drawImage(animAttack.getCurrentFrame(), (int) (xHit - handler.getGameCamera().getxOffset()),
			  (int) (yHit - handler.getGameCamera().getyOffset()), null);
			  }
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(xMove < 0) {
			return animLeft.getCurrentFrame();
		} else if(xMove > 0) {
			return animRight.getCurrentFrame();
		} else if(yMove < 0) {
			return animUp.getCurrentFrame();
		} else if((xMove == 0) && (yMove == 0)) {
			return animStill.getCurrentFrame();
		} else {
			return animDown.getCurrentFrame();
		}
	}

}
