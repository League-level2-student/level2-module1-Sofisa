package league_invaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x, y;
	int width;
	int height;
	boolean up, down, left, right;
	boolean isAlive;
	Rectangle collisionBox = new Rectangle(x, y, width, height);
	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		 collisionBox.setBounds(x, y, width, height);
	}

	void draw(Graphics g) {

	}
	
}
