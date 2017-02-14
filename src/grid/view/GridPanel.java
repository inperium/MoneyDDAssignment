package grid.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JButton closeButton;
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
		this.rowField = new JTextField(5);
		this.rowLabel = new JLabel("Row");
		this.columnLabel = new JLabel("Column");
		this.inputLabel = new JLabel("Input");
		this.submitButton = new JButton("Submit");
		this.closeButton = new JButton("Close");
		baseLayout.putConstraint(SpringLayout.SOUTH, closeButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, closeButton, -39, SpringLayout.EAST, this);

		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTable() {
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(),
		new String[] {"Bank One", "Bank Two", "Bank Three", "Bank Four", "Bank Five"}){
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		gridTable = new JTable(data);
		gridPane = new JScrollPane(gridTable);
	}

	private void setupListeners() {
		this.submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(rowField.getText());
				int y = Integer.parseInt(columnField.getText());
				String replace = "$ " + inputField.getText();
				gridTable.setValueAt(replace, x, y);
			}
		});
		
		this.closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -200, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 200, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 40, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 99, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 5, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 58, SpringLayout.SOUTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowField, -175, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 0, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 40, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 7, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowLabel, -6, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnLabel, -8, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, inputLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 10, SpringLayout.WEST, this);
	}

	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(gridPane);
		this.add(rowField);
		this.add(columnField);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(inputLabel);
		this.add(submitButton);
		this.add(closeButton);
		this.setPreferredSize(new Dimension(650, 400));
		this.inputField = new JTextField(15);
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 14, SpringLayout.SOUTH, inputField);
		add(inputField);
	}
}