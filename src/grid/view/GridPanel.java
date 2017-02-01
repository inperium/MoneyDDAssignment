package grid.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.*;

import grid.controller.GridController;

public class GridPanel extends JPanel {
		
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JLabel inputLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	public GridController getBaseController() {
		return baseController;
	}

	public void setBaseController(GridController baseController) {
		this.baseController = baseController;
	}
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController) {
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.columnField = new JTextField(5);

		setupTable();
		setupPanel();
		setupLayout();
		setupListners();
}

	private void setupTable() {
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
		
	}

	private void setupListners() {

	}

	private void setupLayout() {
		
	}

	private void setupPanel() {
		add(rowField);
		add(columnField);
		add(inputField);
		add(rowLabel);
		add(columnLabel);
		add(inputLabel);
		add(submitButton);
		this.setLayout(baseLayout);	
	}
}