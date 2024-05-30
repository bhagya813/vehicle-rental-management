package bhagya;

import java.awt.EventQueue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class supplier {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supplier window = new supplier();
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
	public supplier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 1280,720 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPPLIER PROFILE");
		lblNewLabel.setBounds(389, 75, 583, 47);
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 50));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(10, 10, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Supplier ID :");
		lblNewLabel_1.setBounds(355, 188, 129, 36);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Supplier name:");
		lblNewLabel_1_1.setBounds(355, 237, 154, 36);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NIC:");
		lblNewLabel_1_1_1.setBounds(355, 283, 129, 36);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Contact no:");
		lblNewLabel_1_1_2.setBounds(355, 329, 129, 36);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Vehicle name:");
		lblNewLabel_1_1_3.setBounds(355, 423, 162, 36);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Email address:");
		lblNewLabel_1_1_4.setBounds(355, 377, 162, 36);
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Vehicle type:");
		lblNewLabel_1_1_5.setBounds(355, 482, 144, 36);
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Vehicle reg no:");
		lblNewLabel_1_1_6.setBounds(355, 533, 201, 36);
		lblNewLabel_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 56, 1266, 66);
		frame.getContentPane().add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);
		textPane.setBackground(new Color(255, 255, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Supplier payment:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setBounds(355, 579, 343, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(306, 155, 599, 500);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane.setColumnHeaderView(textPane_1);
		
		JButton btnNewButton_1 = new JButton("Print supplier details");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setBounds(936, 634, 291, 21);
		frame.getContentPane().add(btnNewButton_1);
	}


	}


