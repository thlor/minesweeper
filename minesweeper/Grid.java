package minesweeper;

import java.awt.Container;

import java.awt.GridLayout;
import java.util.Random;

class Grid {
	Grid(Game game, Container contentPane, int grid_width, int grid_height, int no_of_mines) {
		
        contentPane.setLayout(new GridLayout(grid_height,grid_width));
        
        //Two dimensional button matrix
        Button button[][] = new Button[grid_height][grid_width];
        
        //Generating random mine field
        Random r = new Random();
        boolean minefield[] = new boolean[grid_height*grid_width];
        
        //Filling up button matrix with mines
        for(int i = 0; i < no_of_mines;) {
        	int temp = r.nextInt(minefield.length);
        	if(minefield[temp]==false) {
        		minefield[temp]=true;
        		i++;
        	}
        }
        
        
        
        int counter = 0;
        //Iterate through rows (i = current row)
        for(int ih = 0; ih < grid_height; ih++) {
        	
        	//Iterate through rows (i = current row)
        	for(int iw = 0; iw <grid_width; iw++) {
        		
        		//set button text to counter
        		button[ih][iw] = new Button(ih,iw,minefield[counter]);
        		contentPane.add(button[ih][iw]);
        		counter++;
        	}
        }

	}
}