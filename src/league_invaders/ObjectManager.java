package league_invaders;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket;
	ObjectManager(Rocketship rocket){
		this.rocket = rocket;
	}
	
	void update() {
		rocket.update();
		
	}
	
	void draw(Graphics g) {
		rocket.draw(g);
	}
	
	ArrayList <Projectile> projectiles = new ArrayList<>();
	
	void addProjectile(Projectile p) {
		projectiles.add(p);
	}
	
}
