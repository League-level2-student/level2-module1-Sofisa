package league_invaders;

import java.awt.Graphics;

public class GameObject {
	int x,y;
	int width;
	int height;
	boolean up,down, left, right;

	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
	
	}

	void draw(Graphics g) {

	}
}