package grid.controller;

import grid.view.GridFrame;
import grid.view.GridPanel;
import grid.model.Money;

public class GridController {
	
	private Money [][] dollars;

	private GridFrame gridFrame;
	
	public GridController(){
		setDollars(dollars);
		gridFrame = new GridFrame(null);
	}

	public void start() {
			
	}
	
	public Money[][] getDollars() {
		return dollars;
	}

	public void setDollars(Money[][] dollars) {
		this.dollars = dollars;
	}
}