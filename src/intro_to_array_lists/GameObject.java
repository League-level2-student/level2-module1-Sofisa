package intro_to_array_lists;

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
		if (up) {
			y--;
		}
		if (down) {
			y++;
		}
		if (right) {
			x++;
		}
		if (left) {
			x--;
		}
	}

	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
}
