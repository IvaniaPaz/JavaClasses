package com.class27;

/*Define a class card with 2 methods and this class should have 4 subclasses in which some behavior can be
 * overridden and some can implement it's own behavior  
 */

public class Card {
	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}

	public void creditLimit() { // overridden
		System.out.println("Credit limit of the card is $5,000");
	}
}

class AX extends Card {
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the AX card is $25,000");
	}
}

class MC extends Card {
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the MC card is $15,000");
	}

	public void cashBack() {
		System.out.println("MC gives back 3%");
	}
}

class VISA extends Card {
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the VISA card is $20,000");
	}
}

class Discovery extends Card {
	public void applePay() {
		System.out.println("Discovery can use Apple pay");
	}
}