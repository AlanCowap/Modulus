/**
 * Class describing the GUI for the ModulusGui app 
 * Numbers are 10 characters long, last character (LSB) may be X (equivalent to 10) 
 *
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 */
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

public class ModulusGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField num;
	private JTextField modulusNumbers;
	private JTextField notModulusNumbers;
	private JLabel notModulus;

	private ModulusHandler handler = new ModulusHandler(this);
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModulusGui frame = new ModulusGui();
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
	public ModulusGui() {
		this.setupGui();
	}

	
	/**
	 * Sets up all the components of the GUI
	 */
	private void setupGui(){
		this.setTitle("Alan Cowap - ModulusGui App");
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

		// Adds actionlistener(s) to the button(s). 
		btnCheck.addActionListener(handler);
				
	}
	
	//Add some accessors and mutators
	
	public String getNum(){
		return this.num.getText();
	}
	
	
}
