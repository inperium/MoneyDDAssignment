package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel gridPanel;

	public GridFrame(GridController gridController) 
	{
			super();
			this.baseController = gridController;
			this.gridPanel = new GridPanel (baseController);
			
			this.setupFrame();
	}

	private void setupFrame() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Griddy");
		this.setSize(650, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setContentPane(gridPanel);
		this.setVisible(true);
	}
	
	public GridPanel getGridPanel()
	{
		return this.gridPanel;
	}
	
	public GridController getBaseController() {
		return baseController;
	}

	public void setBaseController(GridController baseController) {
		this.baseController = baseController;
	}
}