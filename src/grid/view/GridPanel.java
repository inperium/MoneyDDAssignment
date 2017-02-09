package grid.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

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
		this.rowField = new JTextField();
		this.inputField = new JTextField(15);
		this.rowLabel = new JLabel();
		this.columnLabel = new JLabel();
		this.inputLabel = new JLabel();
		this.submitButton = new JButton();

		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTable() {
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(),
				new String[] { "Person One", "Person Two", "Person Three" });
		gridTable = new JTable(data);
		gridPane = new JScrollPane(gridTable);
	}

	private void setupListeners() {

	}

	private void setupLayout() {
	}

	private void setupPanel() {
		this.add(gridPane);
		this.setLayout(baseLayout);
		this.add(rowField);
		this.add(columnField);
		this.add(inputField);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(inputLabel);
		this.add(submitButton);
	}
}