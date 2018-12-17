package league_invaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;

	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
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

	ArrayList<Alien> aliens = new ArrayList<>();

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
		Alien a = aliens.get(i);
		if (a.isAlive==false) {
			aliens.remove(i);
		}

		}
	}

	ArrayList<Projectile> projectiles = new ArrayList<>();

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
