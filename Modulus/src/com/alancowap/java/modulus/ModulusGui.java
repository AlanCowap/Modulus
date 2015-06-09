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
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

public class ModulusGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField num;
	private JLabel notModulus;
	JTextArea modulusNumbers;
	JTextArea notModulusNumbers;
	
	private ModulusHandler handler = new ModulusHandler(this);
	private JTextField denominator;
	private JLabel lblDivisor;
	private JLabel lblNumerator;
	private JTextField txtError;
	
	
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
		btnCheck.setBounds(162, 42, 89, 23);
		contentPane.add(btnCheck);
		
		JLabel lblModulus = new JLabel("Modulus");
		lblModulus.setBounds(30, 76, 100, 14);
		contentPane.add(lblModulus);
		
		notModulus = new JLabel("Not Modulus");
		notModulus.setBounds(162, 76, 100, 14);
		contentPane.add(notModulus);
		
		modulusNumbers = new JTextArea();
		modulusNumbers.setBounds(30, 92, 100, 133);
		contentPane.add(modulusNumbers);
		
		notModulusNumbers = new JTextArea();
		notModulusNumbers.setBounds(162, 92, 100, 133);
		contentPane.add(notModulusNumbers);
		
		denominator = new JTextField();
		denominator.setText("11");
		denominator.setBounds(30, 42, 31, 20);
		contentPane.add(denominator);
		denominator.setColumns(10);
		
		lblDivisor = new JLabel("Denominator");
		lblDivisor.setBounds(71, 42, 81, 14);
		contentPane.add(lblDivisor);
		
		lblNumerator = new JLabel("Numerator");
		lblNumerator.setBounds(140, 14, 67, 14);
		contentPane.add(lblNumerator);
		
		txtError = new JTextField();
		txtError.setBounds(30, 231, 232, 20);
		contentPane.add(txtError);
		txtError.setColumns(10);

		// Adds actionlistener(s) to the button(s). 
		btnCheck.addActionListener(handler);
				
	}
	
	//Add some accessors and mutators
	
	public String getNumerator(){
		return this.num.getText();
	}
	
	public String getDenominator(){
		return this.denominator.getText();
	}
	
	public void addMod(String numerator, String denominator){
		this.modulusNumbers.append(numerator +" ("+ denominator +")" + "\n");
	}

	public void addNotMod(String numerator, String denominator){
		this.notModulusNumbers.append(numerator +" ("+ denominator +")" + "\n");
	}
	
	public void addError(String error){
		this.txtError.setForeground(Color.RED);
		this.txtError.setText(error);
	}

}
