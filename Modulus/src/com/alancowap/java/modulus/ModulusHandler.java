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
			checkNum();
		}
	}
	
	/**
	 * Check if a number is Modulus 11
	 */
	private void checkNum(){
		//TODO add functionality
	}

}
