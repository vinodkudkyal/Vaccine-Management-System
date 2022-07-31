package com.vaccin.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class RegisterationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtFdh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterationPage frame = new RegisterationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(5, 5, 771, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registeration ");
		lblNewLabel.setIcon(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 751, 53);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(182, 130, 143, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(501, 199, 264, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 199, 143, 29);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 264, 143, 29);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(182, 334, 143, 29);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(501, 130, 264, 29);
		contentPane.add(textField_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(501, 266, 96, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFemale.setBounds(669, 266, 96, 21);
		contentPane.add(rdbtnFemale);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 264, 127, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(21, 130, 127, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Middle Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(21, 199, 127, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(21, 439, 127, 37);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Phone No.");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_1.setBounds(21, 334, 127, 37);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Email ID");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_2.setBounds(375, 124, 96, 37);
		contentPane.add(lblNewLabel_1_3_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(124, 252, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(182, 545, 133, 37);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(0, 191, 255));
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(500, 545, 133, 37);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Zender");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_3.setBounds(388, 262, 96, 29);
		contentPane.add(lblNewLabel_1_3_3);
		
		txtFdh = new JTextField();
		txtFdh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFdh.setBounds(182, 439, 454, 73);
		contentPane.add(txtFdh);
		txtFdh.setColumns(10);
		
		JLabel lblNewLabel_1_3_3_1 = new JLabel("DOB");
		lblNewLabel_1_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_3_1.setBounds(388, 193, 96, 37);
		contentPane.add(lblNewLabel_1_3_3_1);
		
	}
}
