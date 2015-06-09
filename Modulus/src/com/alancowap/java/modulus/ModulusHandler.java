/**
 * Class describing the event handler  for the ModulusGui app 
 * 
 *
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 */

package com.alancowap.java.modulus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModulusHandler implements ActionListener {
	
	private ModulusGui gui;
	
	public ModulusHandler(ModulusGui gui){
		this.gui = gui;
	}

	
	/**
	 * This callback method is executed when user has clicked a Button we are listening to.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("Check")){
			checkNumFromGui();
		}
	}
	
	/**
	 * Check if the number is Modulus 11
	 */
	private void checkNumFromGui(){
		//Clear any errors
		gui.addError("");
		
		//Read number from gui, string to char[] to int[] 
		String numerator = gui.getNumerator();
//		System.out.println(num);
		
		//strip out hyphens, etc. from string
		//TODO for now we assume legal chars only
		numerator = numerator.trim();
		
		//convert to int[], 
		int[] numeratorArray = new int[numerator.length()];
		for(int i=0; i < numerator.length(); ++i){
			int number = Character.getNumericValue(numerator.charAt(i));
			if(number < 0 || number > 9){ //any non-numeric character
				numeratorArray[i] = 10;
			}else{
				numeratorArray[i] = number;
			}			
		}
		
		//Get denominator, check modulus and update GUI
		String denom = gui.getDenominator().trim();
		int denominator = 0;
		try {
			denominator = Integer.parseInt(denom);

			boolean isMod11 = this.isModulus(numeratorArray, denominator);

			//update gui
			if(isMod11){
				gui.addMod(numerator, denom);
			}else{
				gui.addNotMod(numerator, denom);
			}
		} catch (NumberFormatException e) {
			gui.addError("Not a valid Numerator");

		}

	}
	
	/**
	 * 
	 * 
	 * @param nums array containing number to check (numerator)
	 * @param divisior divisor to check (denominator)
	 * @return true if num % divisor is 0 (zero)
	 */
	private boolean isModulus(int[] num, int divisor){
		int sum=0, len = num.length;
		for(int i=0; i < num.length; ++ i){
			sum += num[i] * len--;//i;			
		}
		System.out.println(sum);
		return ((sum % divisor) == 0);
	}

}
