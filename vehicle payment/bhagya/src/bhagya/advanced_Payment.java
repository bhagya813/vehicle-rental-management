package bhagya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class advanced_Payment {

	protected static final JComponent payment = null;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					advanced_Payment window = new advanced_Payment();
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
	public advanced_Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
        frame.getContentPane().setBackground(new Color(128, 128, 128));
        frame.setBounds(100, 100, 1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("ADVANCE PAYMENT");
        lblNewLabel.setBackground(new Color(128, 128, 128));
        lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 50));
        lblNewLabel.setBounds(296, 50, 628, 88);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("back");
        btnNewButton.setBounds(10, 22, 85, 21);
        frame.getContentPane().add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(296, 227, 175, 19);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Payment duration :");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(526, 168, 196, 36);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Total price:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2.setBounds(132, 214, 203, 36);
        frame.getContentPane().add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setBounds(753, 181, 196, 19);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Discount:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(526, 214, 196, 36);
        frame.getContentPane().add(lblNewLabel_1_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(296, 285, 175, 19);
        frame.getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(753, 227, 196, 19);
        frame.getContentPane().add(textField_3);

        JLabel lblNewLabel_2_1 = new JLabel("Advance:");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2_1.setBounds(132, 272, 203, 36);
        frame.getContentPane().add(lblNewLabel_2_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("Payment method :");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1_1.setBounds(526, 272, 196, 36);
        frame.getContentPane().add(lblNewLabel_1_1_1);

       

        JButton searchButton = new JButton("SEARCH");
        searchButton.setBackground(new Color(255, 255, 0));
        searchButton.setBounds(1012, 440, 185, 21);
        frame.getContentPane().add(searchButton);
        
        JLabel lblNewLabel_3 = new JLabel("Search customer here");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_3.setBounds(913, 417, 222, 13);
        frame.getContentPane().add(lblNewLabel_3);
        
        JButton btnNewButton_1 = new JButton("Add");
        btnNewButton_1.setBackground(new Color(255, 255, 0));
        btnNewButton_1.setBounds(891, 471, 85, 21);
        frame.getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_1_1 = new JButton("Edit");
        btnNewButton_1_1.setBackground(new Color(255, 255, 0));
        btnNewButton_1_1.setBounds(891, 513, 85, 21);
        frame.getContentPane().add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("Delete");
        btnNewButton_1_2.setBackground(new Color(255, 255, 0));
        btnNewButton_1_2.setBounds(1050, 471, 85, 21);
        frame.getContentPane().add(btnNewButton_1_2);
        
        JButton btnNewButton_1_3 = new JButton("clear");
        btnNewButton_1_3.setBackground(new Color(255, 255, 0));
        btnNewButton_1_3.setBounds(1050, 513, 85, 21);
        frame.getContentPane().add(btnNewButton_1_3);
        
        JButton btnNewButton_2 = new JButton("View full payment");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2.setBackground(new Color(255, 255, 0));
        btnNewButton_2.setBounds(885, 554, 250, 21);
        frame.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Download pay slip");
        btnNewButton_3.setBackground(new Color(255, 255, 0));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_3.setBounds(424, 335, 259, 36);
        frame.getContentPane().add(btnNewButton_3);
        
        JLabel lblNewLabel_2_2 = new JLabel("Customer ID:");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2_2.setBounds(132, 168, 203, 36);
        frame.getContentPane().add(lblNewLabel_2_2);
       
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 447, 817, 237);
        frame.getContentPane().add(scrollPane);
        JButton btnNewButton_5 = new JButton("Print invoice");
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_5.setBackground(new Color(255, 255, 0));
        btnNewButton_5.setBounds(913, 597, 208, 21);
        frame.getContentPane().add(btnNewButton_5);
        
        JButton btnNewButton_5_1 = new JButton("Download payment report");
        btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_5_1.setBackground(Color.YELLOW);
        btnNewButton_5_1.setBounds(881, 636, 303, 21);
        frame.getContentPane().add(btnNewButton_5_1);
        
        
     // Inside the initialize() method of advanced_Payment class
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the payment class
                payment paymentPage = new payment();
                // Show the payment page
                paymentPage.frame_1.setVisible(true);
                // Hide the current frame
                frame.setVisible(false);
            }
        });
        
     // Inside the initialize() method of advanced_Payment class
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the payment class
                payment paymentPage = new payment();
                // Show the payment page
                paymentPage.frame_1.setVisible(true);
                // Hide the current frame
                frame.setVisible(false);
            }
        });

       
        

        
    }

	
   
  
  }
	


        
        
  


		


