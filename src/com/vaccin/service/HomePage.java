package com.vaccin.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUp = new JButton("Login");
		btnSignUp.setBounds(393, 68, 134, 42);
		btnSignUp.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSignUp.setBackground(Color.ORANGE);
		btnSignUp.setBorderPainted(false);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lg = new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnSignUp);
		
		JButton btnSignUp_1 = new JButton("Sign Up");
		btnSignUp_1.setBounds(393, 131, 134, 42);
		btnSignUp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterationPage rg = new RegisterationPage();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		btnSignUp_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnSignUp_1.setBorderPainted(false);
		btnSignUp_1.setBackground(Color.CYAN);
		contentPane.add(btnSignUp_1);
		
		JButton btnSignUp_1_1 = new JButton("Close");
		btnSignUp_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSignUp_1_1.setForeground(Color.BLACK);
		btnSignUp_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSignUp_1_1.setBorderPainted(false);
		btnSignUp_1_1.setBackground(Color.ORANGE);
		btnSignUp_1_1.setBounds(10, 405, 117, 31);
		contentPane.add(btnSignUp_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 0, 527, 464);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\VINOD\\Downloads\\vaccine-tracker.jpg"));
		lblNewLabel_1.setBounds(0, 10, 580, 454);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);
	}
}
