package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Place_order {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Place_order window = new Place_order();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Place_order() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 998, 819);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 974, 762);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(852, 175, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(824, 221, 85, 21);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(852, 276, 85, 21);
		panel.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("Food name");
		lblNewLabel.setBounds(787, 575, 102, 21);
		panel.add(lblNewLabel);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(783, 606, 102, 21);
		panel.add(lblType);
		
		JLabel lblFoodPrice = new JLabel("Food price");
		lblFoodPrice.setBounds(783, 643, 102, 21);
		panel.add(lblFoodPrice);
		
		textField = new JTextField();
		textField.setBounds(599, 478, 206, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(758, 321, 206, 19);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(706, 392, 207, 21);
		panel.add(comboBox);
		
		table = new JTable();
		table.setBounds(282, 504, 302, 208);
		panel.add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(633, 691, 85, 21);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Menu();
			}
		});
		panel.add(btnBack);
	}
}
