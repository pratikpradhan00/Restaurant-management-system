package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Reservation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation window = new Reservation();
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
	public Reservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 921, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 7, 901, 707);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 215, 0));
		panel_1.setBounds(0, 0, 345, 697);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Book a table in your");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(64, 27, 195, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("favourite restaurant!!");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(64, 46, 227, 46);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\micheile-henderson-eF4421ZnFWU-unsplash (4).jpg"));
		lblNewLabel_4.setBounds(60, 121, 219, 378);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Make your table reservation");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(54, 532, 256, 26);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("easily in few clicks");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_6.setBounds(98, 568, 181, 26);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setBounds(241, 661, 94, 26);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new After_login();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(344, 0, 557, 697);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\james-elchico-zB4A-PP49ww-unsplash (3).jpg"));
		lblNewLabel_1.setBounds(0, 0, 585, 506);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 250, 210));
		panel_3.setBounds(0, 505, 557, 192);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnBook = new JButton("Book");
		btnBook.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBook.setBackground(new Color(255, 255, 0));
		btnBook.setBounds(139, 10, 85, 21);
		panel_3.add(btnBook);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnUpdate.setBackground(new Color(255, 255, 0));
		btnUpdate.setBounds(283, 10, 85, 21);
		panel_3.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(255, 255, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDelete.setBounds(436, 10, 85, 21);
		panel_3.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(85, 85, 70, 21);
		panel_3.add(lblNewLabel);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(85, 116, 139, 24);
		panel_3.add(lblPhoneNumber);
		
		JLabel lblTableNumber = new JLabel("Table number");
		lblTableNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTableNumber.setBounds(85, 161, 139, 21);
		panel_3.add(lblTableNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(269, 73, 252, 24);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(269, 119, 252, 24);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(269, 163, 252, 21);
		panel_3.add(comboBox);
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.setVisible(true);
		
	}
}
