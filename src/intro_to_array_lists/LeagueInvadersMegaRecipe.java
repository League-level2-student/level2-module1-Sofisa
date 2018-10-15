package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvadersMegaRecipe {
	public static void main(String[] args) {
		LeagueInvadersMegaRecipe recipe = new LeagueInvadersMegaRecipe();
		recipe.setup();

	}

	JFrame frame;
	GamePanel game;

	private void setup() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		final int width = 500;
		game = new GamePanel();
		final int height = 800;
		frame.add(game);
		frame.getContentPane();
		frame.setPreferredSize(new Dimension(width, height));
		frame.pack();
		
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		game.startGame();
	}
}
