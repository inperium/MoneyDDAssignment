package grid.controller;

import grid.view.GridFrame;

import grid.model.Money;

public class GridController {
	
	private Money [][] dollars;

	private GridFrame frame;
	
	public GridController(){
		this.dollars = new Money[5][4];
		populationizer();
		frame = new GridFrame(this);
	}

	public void start() {

	}
	
	public void populationizer() {
		for (int row=0; row<dollars.length; row++){
			for (int col=0; col < dollars[0].length; col++){
				Money worth = new Money();
				dollars[row][col] = worth;
			}
		}
	}
	
	public Money[][] getGrid() {
		return dollars;
	}

	public void setDollars(Money[][] dollars) {
		this.dollars = dollars;
	}
	
	public GridFrame getFrame() {
		return frame;
	}
}