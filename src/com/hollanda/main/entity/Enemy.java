package com.hollanda.main.entity;

import java.awt.image.BufferedImage;

import com.hollanda.main.graficos.Spritesheet;

public class Enemy extends Entity{
	
	public static Spritesheet itensSpritesheet = new Spritesheet("/itens.png");
	public static BufferedImage BANDIT = itensSpritesheet.getSprite(48, 0, 16, 16);
	

	public Enemy(int x, int y, int width, int height) {
		super(x, y, width, height, BANDIT);
	}

}
