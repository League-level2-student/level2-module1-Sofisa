package league_invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed = 10;

	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);

		// TODO Auto-generated constructor stub
	}

	void update() {
        collisionBox.setBounds(x, y, width, height);
        super.update();
		y -= speed;
		if (y<0) {
		isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x+20, y, width, height);
	}
	
	

}
