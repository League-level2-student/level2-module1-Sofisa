package intro_to_array_lists;

import java.awt.Color;
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

	GamePanel() {
		// object = new GameObject(10,10,10,10);

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

	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvadersMegaRecipe.WIDTH, LeagueInvadersMegaRecipe.HEIGHT);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvadersMegaRecipe.WIDTH, LeagueInvadersMegaRecipe.HEIGHT);

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvadersMegaRecipe.WIDTH, LeagueInvadersMegaRecipe.HEIGHT);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keytyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			// object.up= true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			// object.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// object.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			// object.left = true;
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
			// object.up= false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			// object.down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// object.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			// object.left = false;
		}
	}

}
