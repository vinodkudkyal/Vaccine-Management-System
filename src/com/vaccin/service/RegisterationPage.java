package com.vaccin.service;

import java.awt.BorderLayout;
import com.vaccin.dao.Database;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;

public class RegisterationPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtVkhnvk;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtFdh;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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
		setBounds(100, 100, 926, 657);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(5, 5, 912, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registeration ");
		lblNewLabel.setIcon(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 892, 53);
		panel.add(lblNewLabel);
		
		txtVkhnvk = new JTextField();
		txtVkhnvk.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtVkhnvk.setBounds(182, 130, 143, 29);
		contentPane.add(txtVkhnvk);
		txtVkhnvk.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(182, 199, 143, 29);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(182, 264, 143, 29);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(182, 334, 143, 29);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(501, 130, 264, 29);
		contentPane.add(textField_6);
		
		txtFdh = new JTextField();
		txtFdh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFdh.setBounds(179, 406, 454, 73);
		contentPane.add(txtFdh);
		txtFdh.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(501, 341, 264, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 606, 149, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(754, 558, 149, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 264, 127, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(21, 130, 127, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Middle Name");
		lblNewLabel_1_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(21, 199, 127, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(21, 406, 127, 37);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Phone No.");
		lblNewLabel_1_3_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_1.setBounds(21, 334, 127, 37);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Email ID");
		lblNewLabel_1_3_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_2.setBounds(375, 124, 96, 37);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Valid Name");
		lblNewLabel_2.setForeground(Color.RED);
		//lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(181, 169, 144, 20);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Valid Name");
		lblNewLabel_3.setForeground(Color.RED);
		//lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(182, 238, 140, 20);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Valid Name");
		lblNewLabel_4.setForeground(Color.RED);
		//lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(182, 303, 143, 20);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("Enter Valid Mobile No.");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(182, 373, 143, 20);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Valid Email ID");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(501, 169, 132, 20);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		JLabel lblNewLabel_7 = new JLabel("Enter The Date Of Birth");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(501, 239, 177, 20);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Address");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(179, 489, 146, 20);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(501, 199, 177, 29);
		contentPane.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setBounds(501, 268, 161, 29);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Select Gender");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(499, 308, 163, 20);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		JLabel lblNewLabel_11 = new JLabel("Enter Valid Aadhar No");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setBounds(501, 378, 177, 18);
		contentPane.add(lblNewLabel_11);
		lblNewLabel_11.setVisible(false);
		
		JLabel lblNewLabel_14 = new JLabel("Password Incorrect");
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setBounds(571, 558, 146, 20);
		contentPane.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);
		
		JLabel lblNewLabel_15 = new JLabel("Enter Password");
		lblNewLabel_15.setForeground(Color.RED);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(182, 563, 127, 15);
		contentPane.add(lblNewLabel_15);
		lblNewLabel_15.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 511, 161, 29);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(553, 511, 161, 31);
		contentPane.add(passwordField_1);
		
		ArrayList al = new ArrayList();
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int c = 0;
				boolean b;
				//First Name
				b = Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(txtVkhnvk.getText()).matches();
				if(b==false) 
				{
					lblNewLabel_2.setVisible(true);
					c = 1;
					//txtVkhnvk.setText(null);
				}
				else {
					al.add(txtVkhnvk.getText());
				}
				
				// Middle Name
				b = Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(textField_3.getText()).matches();
				if(b==false) 
				{
					lblNewLabel_3.setVisible(true);
					c = 1;
					//textField_3.setText(null);
				}
				
				//Last Name
				b = Pattern.compile("[a-zA-Z]{3,30}").matcher(textField_4.getText()).matches();
				if(b==false) 
				{
					lblNewLabel_4.setVisible(true);
					//textField_4.setText(null);
				}
				else {
					al.add(textField_4.getText());
				}
				
				//Email Id
				b = Pattern.compile("^(.+)@(.+)$").matcher(textField_6.getText()).matches();
				if(b==false) 
				{
					lblNewLabel_6.setVisible(true);
					c = 1;
					//textField_6.setText(null);
				}
				else {
					al.add(textField_6.getText());
				}
				
				//Phone No
				b = Pattern.compile("\\d{10}$").matcher(textField_5.getText()).matches();
				if(b==false) 
				{
					lblNewLabel_5.setVisible(true);
					c = 1;
					//textField_5.setText(null);
				}
				else {
					al.add(textField_5.getText());
				}
				
				//Aadhar no
				b = Pattern.compile("^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$").matcher(textField.getText()).matches();
				if(b==false) 
				{
					lblNewLabel_11.setVisible(true);
					c = 1;
				}
				else {
					al.add(textField.getText());
				}
				
				//confirm password
				if(!passwordField_1.getText().equals(passwordField.getText()))
				{
					lblNewLabel_14.setVisible(true);
					c = 1;
				}
				else {
					al.add(textField_2.getText());
				}
				
				
				//Address
				b = Pattern.compile("").matcher(textField_5.getText()).matches();
				if(b==true) 
				{
					lblNewLabel_8.setVisible(true);
					c = 1;
					//txtFdh.setText(null);
				}
				else {
					al.add(txtFdh.getText());
				}
				
				//gender
				if(comboBox.getSelectedIndex()==0) {
					lblNewLabel_9.setVisible(true);
					c = 1;
				}
				else {
					al.add(comboBox.getSelectedItem().toString());
				}
				
				//DOB
				if(dateChooser.getDate()==null) {
					lblNewLabel_7.setVisible(true);
					c = 1;
					//dateChooser.setDate(null);
				}
				
				//Password
				b = Pattern.compile("").matcher(passwordField.getText()).matches();
				if(b==true) 
				{
					lblNewLabel_15.setVisible(true);
					c = 1;
					//textField_1.setText(null);
				}
				
				Database db = new Database();
				int a = db.insertIntoDB(al);
				//JOptionPane.showMessageDialog(null, a);
				if( a == 1 )
				{
					JOptionPane.showMessageDialog(null, "Submited Successfully :)");
				}
				else
				{
					JOptionPane.showMessageDialog(null, " Dosent Submited");
					c=0;
				}
			}	
		});
		
		btnNewButton.setBackground(new Color(124, 252, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(182, 598, 133, 37);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVkhnvk.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				txtFdh.setText(null);
				textField_6.setText(null);
				dateChooser.setDate(null);
				comboBox.setSelectedIndex(0);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_5.setVisible(false);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblNewLabel_11.setVisible(false);
				lblNewLabel_14.setVisible(false);
				lblNewLabel_15.setVisible(false);
			}
		});
		btnReset.setBackground(new Color(0, 191, 255));
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(501, 598, 133, 37);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Gender");
		lblNewLabel_1_3_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_3.setBounds(375, 264, 96, 29);
		contentPane.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_3_1 = new JLabel("DOB");
		lblNewLabel_1_3_3_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_3_1.setBounds(375, 195, 96, 37);
		contentPane.add(lblNewLabel_1_3_3_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(770, 598, 133, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("Aadhar NO");
		lblNewLabel_10.setForeground(new Color(192, 192, 192));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(375, 344, 96, 29);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("Passwoed");
		lblNewLabel_12.setForeground(new Color(192, 192, 192));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_12.setBounds(21, 511, 127, 37);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Confirm Password");
		lblNewLabel_13.setForeground(new Color(192, 192, 192));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_13.setBounds(367, 511, 161, 29);
		contentPane.add(lblNewLabel_13);
		
		
		
		
		
		setUndecorated(true);
	}
}
