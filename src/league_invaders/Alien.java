package league_invaders;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Alien extends GameObject{

	
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	void update(){
		super.update();
        collisionBox.setBounds(x, y, width, height);
		y+=1;
	}
	
	void draw(Graphics g) {
		 g.drawImage(GamePanel.alienImg, x, y, width, height, null);



	}
	
	
}
