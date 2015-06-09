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
		//Read number from gui, string to char[] to int[] 
		String num = gui.getNum();
//		System.out.println(num);
		
		//strip out hyphens, etc. from string
		//TODO for now we assume legal chars only
		num = num.trim();
		
		//convert to int[], 
		int[] nums = new int[num.length()];
		for(int i=0; i < num.length(); ++i){
			int number = Character.getNumericValue(num.charAt(i));
			if(number < 0 || number > 9){ //any non-numeric character
				nums[i] = 10;
			}else{
				nums[i] = number;
			}			
		}
		
//		for(int i : nums){
//			System.out.print(i);
//		}
		
		boolean isMod11 = this.isModulus(nums, 11);
	
		//update gui
		if(isMod11){
			gui.addMod(num);
		}else{
			gui.addNotMod(num);
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
		//TODO code logic
		return false;
	}

}
