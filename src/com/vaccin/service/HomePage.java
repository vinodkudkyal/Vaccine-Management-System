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
		setBounds(100, 100, 576, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 127));
		panel.setBounds(5, 5, 547, 68);
		panel.setForeground(Color.ORANGE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Vaccinaton Drive");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 527, 38);
		panel.add(lblNewLabel);
		
		JButton btnSignUp = new JButton("Login");
		btnSignUp.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSignUp.setBackground(new Color(0, 255, 255));
		btnSignUp.setBorderPainted(false);
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lg = new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		btnSignUp.setBounds(206, 155, 158, 57);
		contentPane.add(btnSignUp);
		
		JButton btnSignUp_1 = new JButton("Sign Up");
		btnSignUp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterationPage rg = new RegisterationPage();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		btnSignUp_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSignUp_1.setBorderPainted(false);
		btnSignUp_1.setBackground(Color.CYAN);
		btnSignUp_1.setBounds(206, 256, 158, 57);
		contentPane.add(btnSignUp_1);
	}
}
