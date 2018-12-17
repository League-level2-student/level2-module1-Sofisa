package league_invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time = new Timer(1000 / 60, this);
	// GameObject object;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font enterFont;
	Font spaceFont;
	Rocketship rocket = new Rocketship(250, 700, 50, 50);
	ObjectManager object = new ObjectManager(rocket);
	GamePanel() {
		// object = new GameObject(10,10,10,10);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		enterFont = new Font("Arial", Font.PLAIN, 30);
		spaceFont = new Font("Arial", Font.PLAIN, 30);
	}
	@Override

	public void paintComponent(Graphics g) {
		// g.fillRect(10, 10, 100, 100);
		// object.draw(g);
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// object.update();
		repaint();
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
	}

	void startGame() {
		// TODO Auto-generated method stub
		time.start();
	}

	void updateEndState() {

	}

	void updateMenuState() {
	}

	void updateGameState() {
		object.update();
		object.manageEnemies();
	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvadersMegaRecipe.WIDTH, LeagueInvadersMegaRecipe.HEIGHT);
		g.setFont(titleFont);
		g.setColor(new Color(255, 255, 0));
		g.drawString("LEAGUE INVADERS", 20, 200);
		g.setFont(enterFont);
		g.setColor(new Color(255, 255, 0));
		g.drawString("press ENTER to start", 100, 350);
		g.drawString("Press SPACE for instructions", 70, 550);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvadersMegaRecipe.WIDTH, LeagueInvadersMegaRecipe.HEIGHT);
		object.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvadersMegaRecipe.WIDTH, LeagueInvadersMegaRecipe.HEIGHT);
		g.setFont(titleFont);
		g.setColor(new Color(255, 255, 0));
		g.drawString("LEAGUE INVADERS", 20, 200);
		g.setFont(enterFont);
		g.setColor(new Color(255, 255, 0));
		g.drawString("press ENTER to start", 100, 350);
		g.drawString("Press SPACE for instructions", 70, 550);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keytyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_SPACE)  {
			object.addProjectile(new Projectile(rocket.x, rocket.y, 10, 10));
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.up= true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {

				currentState = MENU_STATE;
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyreleased");
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.up= false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.left = false;
		}
	}

}
