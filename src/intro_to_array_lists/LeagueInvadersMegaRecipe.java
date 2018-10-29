package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvadersMegaRecipe {
	public static void main(String[] args) {
		LeagueInvadersMegaRecipe recipe = new LeagueInvadersMegaRecipe();
		recipe.setup();

	}

	static final int HEIGHT = 800;
	static final int WIDTH = 500;
	JFrame frame;
	GamePanel game;

	private void setup() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		game = new GamePanel();
		frame.add(game);
		frame.addKeyListener(game);
		frame.getContentPane();
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();

		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		game.startGame();
	}
}
