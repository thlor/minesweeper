package minesweeper;

import javax.swing.SwingUtilities;

public class Main {

	/**
	 * @param args
	 */

	static Game game;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				game = new Game();
				game.createAndShowGUI();
			}
		});
	}
}