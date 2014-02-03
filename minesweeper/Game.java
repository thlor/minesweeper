package minesweeper;

import javax.swing.JFrame;

	class Game {

		static final int GRID_WIDTH = 9;
		static final int GRID_HEIGHT = 9;
		static final int NO_OF_MINES = 10;
		
		void createAndShowGUI() {
			//Create and show GUI
			
			JFrame frame = new JFrame("Minesweepa");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Grid grid = new Grid(this, frame.getContentPane(), GRID_WIDTH, GRID_HEIGHT, NO_OF_MINES);
	
		    frame.pack();
		    frame.setVisible(true);
		}
		
		public void over() {
			System.out.println("Game over");
		}
}
