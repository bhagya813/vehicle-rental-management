package bhagya;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;

public class payment {

	
	JFrame frame_1;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment window = new payment();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		        frame_1 = new JFrame();
		        frame_1.getContentPane().setBackground(new Color(128, 128, 128));
		        frame_1.setBounds(100, 100, 1280, 720);
		        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame_1.getContentPane().setLayout(null);

		        JButton btnNewButton = new JButton("back");
		        btnNewButton.setBounds(10, 10, 85, 21);
		        frame_1.getContentPane().add(btnNewButton);

		        JLabel lblNewLabel = new JLabel("FULL PAYMENT");
		        lblNewLabel.setBounds(397, 53, 529, 85);
		        lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 54));
		        frame_1.getContentPane().add(lblNewLabel);

		        JLabel lblNewLabel_1 = new JLabel("Fine:");
		        lblNewLabel_1.setBounds(437, 208, 145, 25);
		        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(lblNewLabel_1);

		        
		        JLabel lblNewLabel_1_1 = new JLabel("Full payment:");
		        lblNewLabel_1_1.setBounds(437, 243, 185, 25);
		        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(lblNewLabel_1_1);


		        JLabel lblNewLabel_2 = new JLabel("Payment method:");
		        lblNewLabel_2.setBounds(437, 278, 178, 21);
		        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(lblNewLabel_2);

		        JComboBox comboBox = new JComboBox();
		        comboBox.setBounds(636, 278, 151, 21);
		        comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Cash", "Card"}));
		        frame_1.getContentPane().add(comboBox);

		        JLabel lblNewLabel_3 = new JLabel("Customer ID:");
		        lblNewLabel_3.setBounds(437, 170, 145, 28);
		        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(lblNewLabel_3);

		        

		        JButton btnNewButton_1 = new JButton("Download pay slip");
		        btnNewButton_1.setBounds(437, 326, 357, 21);
		        btnNewButton_1.setBackground(new Color(255, 255, 0));
		        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_1);

		        JScrollPane scrollPane = new JScrollPane();
		        scrollPane.setBounds(24, 455, 741, 233);
		        frame_1.getContentPane().add(scrollPane);
		        JButton searchButton = new JButton("Search");
		        searchButton.setBounds(1007, 458, 134, 21);
		        searchButton.setBackground(new Color(255, 255, 0));
		        searchButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		        

		        JButton btnNewButton_2 = new JButton("ADD");
		        btnNewButton_2.setBounds(831, 507, 111, 21);
		        btnNewButton_2.setBackground(new Color(255, 255, 0));
		        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_2);

		        JButton btnNewButton_2_1 = new JButton("Delete");
		        btnNewButton_2_1.setBounds(1033, 507, 108, 21);
		        btnNewButton_2_1.setBackground(new Color(255, 255, 0));
		        btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_2_1);

		        JButton btnNewButton_2_2 = new JButton("Edit");
		        btnNewButton_2_2.setBounds(831, 552, 111, 21);
		        btnNewButton_2_2.setBackground(new Color(255, 255, 0));
		        btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_2_2);

		        JButton btnNewButton_2_3 = new JButton("Clear");
		        btnNewButton_2_3.setBounds(1033, 556, 108, 21);
		        btnNewButton_2_3.setBackground(new Color(255, 255, 0));
		        btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_2_3);
		        
		        JLabel lblNewLabel_4 = new JLabel("Search customer here");
		        lblNewLabel_4.setBounds(854, 410, 287, 25);
		        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(lblNewLabel_4);
		        
		        JButton btnNewButton_3 = new JButton("Print invoice");
		        btnNewButton_3.setBounds(831, 620, 310, 21);
		        btnNewButton_3.setBackground(new Color(255, 255, 0));
		        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_3);
		        
		        JButton btnNewButton_3_1 = new JButton("Download payment report");
		        btnNewButton_3_1.setBounds(831, 661, 310, 21);
		        btnNewButton_3_1.setBackground(new Color(255, 255, 0));
		        btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		        frame_1.getContentPane().add(btnNewButton_3_1);
		        
		        JButton btnNewButton_4 = new JButton("SUBMIT");
		        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		        btnNewButton_4.setBackground(new Color(255, 255, 0));
		        btnNewButton_4.setBounds(404, 370, 400, 21);
		        frame_1.getContentPane().add(btnNewButton_4);
		        
		        textField = new JTextField();
		        textField.setBounds(600, 179, 204, 21);
		        frame_1.getContentPane().add(textField);
		        textField.setColumns(10);
		        
		        textField_1 = new JTextField();
		        textField_1.setBounds(600, 215, 204, 19);
		        frame_1.getContentPane().add(textField_1);
		        textField_1.setColumns(10);
		        
		        textField_2 = new JTextField();
		        textField_2.setBounds(610, 249, 194, 19);
		        frame_1.getContentPane().add(textField_2);
		        textField_2.setColumns(10);
		        
		        frame_1.setVisible(true);
		        
		      		        
		    }

	
	}


