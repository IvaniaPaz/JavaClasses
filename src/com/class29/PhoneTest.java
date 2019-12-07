package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		
		/* you cannot directly create an object of an abstraction class Phone phone=new
		 * Phone(); we can create it indirectly Phone phone=new iPhone(); phone=parent,
		 * iPhone=child
		 */

		Phone phone = new iPhone();
		phone.makeCall();
		phone.sendText();
		phone.takePics();
		phone.playGames();
	}

}
