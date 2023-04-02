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
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(0, 0, 452, 752);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\jarritos-mexican-soda-idP6ct9jkmk-unsplash (4).jpg"));
		lblNewLabel_1.setBounds(82, 10, 268, 380);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Favourite Food");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel_2.setBounds(83, 428, 359, 43);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Delivered To You");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel_3.setBounds(117, 481, 272, 30);
		panel_1.add(lblNewLabel_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 139, 139));
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnBack.setBounds(306, 668, 109, 35);
		panel_1.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Menu();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(449, 0, 525, 762);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(122, 485, 342, 243);
		panel_2.add(table);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBounds(58, 29, 109, 39);
		panel_2.add(btnUpdate);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(234, 29, 95, 39);
		panel_2.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(240, 240, 240));
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBounds(389, 29, 102, 39);
		panel_2.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("Food name");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel.setBounds(58, 168, 147, 31);
		panel_2.add(lblNewLabel);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblType.setBounds(65, 255, 102, 31);
		panel_2.add(lblType);
		
		textField_2 = new JTextField();
		textField_2.setBounds(257, 168, 258, 31);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(257, 256, 258, 29);
		panel_2.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(265, 343, 250, 31);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Food Quantity");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_4.setBounds(58, 348, 166, 31);
		panel_2.add(lblNewLabel_4);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
