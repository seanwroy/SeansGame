package dev.study.seansgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	private static final int width = 32, height = 32;
	
	public static BufferedImage dirt, dirt2, dirty, grass, stone, tree, water, wall, rock1, rock2, rock3, 
								rock4, rock5, rock6, stump1, stump2, fulltree, house1, house2,
								house3, house4, house5, house6, house7, house8, house9, house10,
								house11, house12, house13, house14, house15, house16, house17,
								house18, house19, house20, boundary1, boundary2, boundary3, stone2;
	public static BufferedImage[] player_down, player_up, player_left, player_right, player_still;
	public static BufferedImage[] enemy_down, enemy_up, enemy_left, enemy_right, enemy_still;
	public static BufferedImage[] btn_start;
	public static BufferedImage[] attack;
	
	public static void init() {
		spriteSheet sheet = new spriteSheet(ImageLoader.loadImage("/textures/charactertileset.png"));
		
		btn_start = new BufferedImage[2];
		btn_start[0] = sheet.crop(0, 64, width * 2, height); 
		btn_start[1] = sheet.crop(0, 96, width * 2, height); 
		
		attack = new BufferedImage[7];
		attack[0] = sheet.crop(0, 160, width, height);
		attack[1] = sheet.crop(32, 160, width, height);
		attack[2] = sheet.crop(64, 160, width, height);
		attack[3] = sheet.crop(96, 160, width, height);
		attack[4] = sheet.crop(128, 160, width, height);
		attack[5] = sheet.crop(160, 160, width, height);
		attack[6] = sheet.crop(192, 160, width, height);
		
		player_down = new BufferedImage[4];
		player_up = new BufferedImage[4];
		player_left = new BufferedImage[4];
		player_right = new BufferedImage[4];
		player_still = new BufferedImage[1];
		
		player_down[0] = sheet.crop(width * 4, 0, width, height); 
		player_down[1] = sheet.crop(width * 5, 0, width, height);
		player_down[2] = sheet.crop(width * 6, 0, width, height); 
		player_down[3] = sheet.crop(width * 7, 0, width, height);				
		player_right[0] = sheet.crop(width * 8, 0, width, height); 
		player_right[1] = sheet.crop(width * 9, 0, width, height);
		player_right[2] = sheet.crop(width * 10, 0, width, height); 
		player_right[3] = sheet.crop(width * 11, 0, width, height);
		player_left[0] = sheet.crop(width * 4, 32, width, height); 
		player_left[1] = sheet.crop(width * 5, 32, width, height);
		player_left[2] = sheet.crop(width * 6, 32, width, height); 
		player_left[3] = sheet.crop(width * 7, 32, width, height);
		player_up[0] = sheet.crop(width * 8, 32, width, height); 
		player_up[1] = sheet.crop(width * 9, 32, width, height);
		player_up[2] = sheet.crop(width * 10, 32, width, height); 
		player_up[3] = sheet.crop(width * 11, 32, width, height);
		player_still[0] = sheet.crop(width * 4, 0, width, height);
		
//		enemy_down[0] = sheet.crop(width * 4, 192, width, height); 
//		enemy_down[1] = sheet.crop(width * 5, 192, width, height);
//		enemy_down[2] = sheet.crop(width * 6, 192, width, height); 			
//		enemy_right[0] = sheet.crop(width * 7, 192, width, height); 
//		enemy_right[1] = sheet.crop(width * 8, 192, width, height);
//		enemy_right[2] = sheet.crop(width * 9, 192, width, height);
//		enemy_left[0] = sheet.crop(width * 4, 192, width, height); 
//		enemy_left[1] = sheet.crop(width * 5, 192, width, height);
//		enemy_left[2] = sheet.crop(width * 6, 192, width, height);
//		enemy_up[0] = sheet.crop(width * 7, 224, width, height); 
//		enemy_up[1] = sheet.crop(width * 8, 224, width, height);
//		enemy_up[2] = sheet.crop(width * 9, 224, width, height);
//		enemy_still[0] = sheet.crop(width * 4, 192, width, height);
		
		house1 = sheet.crop(width * 7, 64, width, height);
		house2 = sheet.crop(width * 8, 64, width, height);
		house3 = sheet.crop(width * 9, 64, width, height);
		house4 = sheet.crop(width * 10, 64, width, height);
		house5 = sheet.crop(width * 7, 96, width, height);
		house6 = sheet.crop(width * 8, 96, width, height);
		house7 = sheet.crop(width * 9, 96, width, height);
		house8 = sheet.crop(width * 10, 96, width, height);
		house9 = sheet.crop(width * 7, 128, width, height);
		house10 = sheet.crop(width * 8, 128, width, height);
		house11 = sheet.crop(width * 9, 128, width, height);
		house12 = sheet.crop(width * 10, 128, width, height);
		house13 = sheet.crop(width * 7, 160, width, height);
		house14 = sheet.crop(width * 8, 160, width, height);
		house15 = sheet.crop(width * 9, 160, width, height);
		house16 = sheet.crop(width * 10, 160, width, height);
		house17 = sheet.crop(0, 128, width, height);
		house18 = sheet.crop(32, 128, width, height);
		house19 = sheet.crop(64, 128, width, height);
		house20 = sheet.crop(96, 128, width, height);
		
		boundary1 = sheet.crop(128, 128, width, height);
		boundary2 = sheet.crop(160, 128, width, height);
		boundary3 = sheet.crop(192, 128, width, height);
		
		
		dirt = sheet.crop(width, 0, width, height);
		dirt2 = sheet.crop(width, 0, width, height);
		dirty = sheet.crop(160, 96, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		stone2 = sheet.crop(width * 3, 0, width, height);
		tree = sheet.crop(0, height, width, height);
		water = sheet.crop(32, height, width, height);
		wall = sheet.crop(64, height, width, height);
		rock1 = sheet.crop(64, 64, width, height);
		rock2 = sheet.crop(96, 64, width, height);
		rock3 = sheet.crop(128, 64, width, height);
		rock4 = sheet.crop(160, 64, width, height);
		rock5 = sheet.crop(192, 64, width, height);
		rock6 = sheet.crop(128, 96, width, height);
		stump1 = sheet.crop(64, 96, width, height);
		stump2 = sheet.crop(96, 96, width, height);
		fulltree = sheet.crop(width * 12, 0, width * 2, height * 3);
	}

}
