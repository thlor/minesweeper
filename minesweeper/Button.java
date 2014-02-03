package minesweeper;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;


class Button extends JButton {

	//Three different flag states of a button.
	private final static int NOT_FLAGGED = 0;
	private final static int FLAGGED = 1;
	private final static int QUESTION = 2;
	
	//Is this button a mine?
	private boolean is_mine;
	
	//Coordinates of the button.
	private int x, y;
	
	//Flag state of the button.
	private int flag = NOT_FLAGGED;
	
	//
	private MouseAdapter mouseadapter;

	/**
	 * @param y The vertical coordinate of the field
	 * @param x The horizontal coordinate of the field
	 * @param is_mine True if has mine, false if doesn't
	 */
	public Button(int ih, int iw, boolean minefield) {
		x=iw;
		y=ih;
		is_mine=minefield;
		
		//Adding mouse listener, differentiating between left and right button.
		mouseadapter = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1)
					leftClick();
				else
					rightClick();
			}
		};
		addMouseListener(mouseadapter);
	}
	

	
	private void leftClick() {
		// Activate button
		if(is_mine) {
			
		}
		//Disabling button
		this.setEnabled(false);
		
	}	

	private void rightClick() {
		// Iterate through flag states.
		if(flag == NOT_FLAGGED) { //set from not flagged to flagged
			flag = FLAGGED;
			this.setText("F");
		} else if(flag == FLAGGED) { //set from flagged to question mark
			flag = QUESTION;
			this.setText("?");
		} else { //set from question mark to not flagged
			flag = NOT_FLAGGED;
			this.setText(null);
		}
	}

}
