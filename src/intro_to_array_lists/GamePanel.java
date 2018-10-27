package intro_to_array_lists;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time = new Timer(1000 / 60, this);
	GameObject object;
	GamePanel () {
		object = new GameObject(10,10,10,10);
	}

	@Override

	public void paintComponent(Graphics g) {
		//g.fillRect(10, 10, 100, 100);
		object.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		object.update();
		repaint();
	}

	void startGame() {
		// TODO Auto-generated method stub
		time.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keytyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if (e.getKeyCode()== KeyEvent.VK_UP) {
			object.up= true;
		}
		 if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			 object.down = true;
		 }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyreleased");
		if (e.getKeyCode()== KeyEvent.VK_UP) {
			object.up= false;
		}
	}

}
