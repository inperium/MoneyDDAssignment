package grid.controller;

import grid.view.GridFrame;

import grid.model.Money;

public class GridController {
	
	private Money [][] dollars;

	private GridFrame gridFrame;
	
	public GridController(){
		this.dollars = new Money[5][4];
		gridFrame = new GridFrame(null);
		populationizer();
	}

	public void start() {

	}
	
	public void populationizer() {
		for (int row=0; row<dollars.length; row++){
			for (int col=0; col < dollars[0].length; col++){
				//Money = 
				//dollars[row][col] = Money;
			}
		}
	}
	
	public Money[][] getDollars() {
		return dollars;
	}

	public void setDollars(Money[][] dollars) {
		this.dollars = dollars;
	}
}