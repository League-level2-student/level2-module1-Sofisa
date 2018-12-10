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
		y+=1;
	}
	
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(x, y, width, height);
	}
	
	
	ArrayList <Alien> aliens = new ArrayList<>();
}
