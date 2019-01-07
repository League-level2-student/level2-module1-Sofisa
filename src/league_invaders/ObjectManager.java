package league_invaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	int score = 0;
	Rocketship rocket;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	ArrayList<Alien> aliens = new ArrayList<>();
	ArrayList<Projectile> projectiles = new ArrayList<>();

	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}
	
	int getScore() {
		return score;
		
	}
	
	void setScore(int s) {
		score = s;
	}
	

	void checkCollision() {
		for(Alien bob : aliens){

	        if(rocket.collisionBox.intersects(bob.collisionBox)){

	                rocket.isAlive = false;
	        }
	        
	        for(Projectile p : projectiles) {
	        	if(p.collisionBox.intersects(bob.collisionBox)){
	                p.isAlive = false;
	                bob.isAlive = false;
	        }
	        

	        }
	        }
	}

	void update() {
		rocket.update();
		for (Alien bob : aliens) {
			bob.update();
		}
		for (Projectile p : projectiles) {
			p.update();
		}
	}

	void addAlien(Alien bob) {
		aliens.add(bob);

	}

	
	void draw(Graphics g) {
		rocket.draw(g);
		for (Projectile p : projectiles) {
			p.draw(g);
		}
		for (Alien bob : aliens) {
			bob.draw(g);
		}
	}

	void purgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			Alien bob = aliens.get(i);
			if (bob.isAlive == false) {
				aliens.remove(i);
				score ++;
			}

		}
	}

	

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvadersMegaRecipe.WIDTH), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

}
