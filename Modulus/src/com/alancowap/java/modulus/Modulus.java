package com.alancowap.java.modulus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modulus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField num;
	private JTextField modulusNumbers;
	private JTextField notModulusNumbers;
	private JLabel notModulus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulus frame = new Modulus();
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
	public Modulus() {
		this.setTitle("Alan Cowap - Modulus App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		num = new JTextField();
		num.setBounds(30, 11, 100, 20);
		contentPane.add(num);
		num.setColumns(13);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCheck.setBounds(162, 10, 89, 23);
		contentPane.add(btnCheck);
		
		modulusNumbers = new JTextField();
		modulusNumbers.setBounds(30, 68, 100, 133);
		contentPane.add(modulusNumbers);
		modulusNumbers.setColumns(13);
		
		JLabel lblModulus = new JLabel("Modulus 11");
		lblModulus.setBounds(30, 52, 100, 14);
		contentPane.add(lblModulus);
		
		notModulusNumbers = new JTextField();
		notModulusNumbers.setColumns(13);
		notModulusNumbers.setBounds(165, 68, 100, 133);
		contentPane.add(notModulusNumbers);
		
		notModulus = new JLabel("Not Modulus 11");
		notModulus.setBounds(162, 52, 100, 14);
		contentPane.add(notModulus);
		
	}
	
	
}
