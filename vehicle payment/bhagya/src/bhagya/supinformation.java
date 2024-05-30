package bhagya;

import java.awt.EventQueue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import javax.swing.JFrame;

public class supinformation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supinformation window = new supinformation();
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
	public supinformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 1280,720 );
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.setBounds(10, 10, 72, 21);
		
		JLabel lblNewLabel = new JLabel(" ADD NEW SUPPLIER");
		lblNewLabel.setBounds(369, 67, 639, 99);
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 48));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Supplier ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(192, 190, 104, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
		JLabel lblNewLabel_1_4 = new JLabel("Vehicle reg no:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(680, 300, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("Vehicle type:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(680, 264, 104, 21);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Vehicle name:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(680, 221, 118, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email address:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(680, 190, 128, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact no:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(192, 300, 104, 21);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NIC:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(192, 264, 104, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Supplier name:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(193, 221, 138, 21);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Car");
		comboBox.addItem("Van");
		comboBox.addItem("Heavy vehicle");
		comboBox.setBounds(818, 266, 275, 21);
		frame.getContentPane().add(comboBox);
		
	
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1_1.setBounds(1107, 507, 85, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("EDIT");
		btnNewButton_1_2.setBackground(new Color(255, 255, 0));
		btnNewButton_1_2.setBounds(962, 551, 85, 21);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("CLEAR");
		btnNewButton_1_3.setBackground(new Color(255, 255, 0));
		btnNewButton_1_3.setBounds(1107, 551, 85, 21);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton(" View supplier deatails");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4.setBackground(new Color(255, 255, 0));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBounds(971, 592, 195, 52);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setBounds(962, 507, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100,1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField searchTextField = new JTextField();
		searchTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		searchTextField.setBackground(new Color(255, 255, 0));
		searchTextField.setBounds(945, 460, 138, 21);
		frame.getContentPane().add(searchTextField);

		JButton searchButton = new JButton("SEARCH");
		frame.getContentPane().add(searchButton);
		
		JLabel lblNewLabel_2 = new JLabel("Search  supplier here");
		lblNewLabel_2.setBackground(new Color(192, 192, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(1013, 424, 286, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Supplier payment :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(434, 350, 244, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(319, 193, 223, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(319, 224, 223, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(319, 264, 220, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(319, 303, 223, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(818, 193, 245, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(818, 224, 245, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(816, 303, 277, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		

	}



		
		
	}


