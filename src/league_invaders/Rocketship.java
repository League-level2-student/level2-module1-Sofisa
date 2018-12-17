package league_invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
int speed;
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}

	void update() {
		super.update();
		if (up) {
			y -= speed;
		}
		if (down) {
			y+= speed;
		}
		if (right) {
			x+= speed;
		}
		if (left) {
			x-= speed;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
