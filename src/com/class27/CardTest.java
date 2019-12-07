package com.class27;

import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		
		//primitve 
		int i=10;
		//non primitive
		String str="Hello";
		Scanner scan;
		MC mc;
		/*Take an object of child class and 
		 * give reference to the parent
		 */
	// type reference variable= object is created
		Card card=new AX();
		card.chargeInterest();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2=new VISA();
		card2.creditLimit();
		
		Card card3=new Discovery();
		card3.creditLimit();
		
System.out.println("------------------------");		
		
		//type [] arrayName ={}; --examples
//		type [] arrayName=new type[]; --examples
//		int [] numArray= {10,12,13}; --examples
//		String [] stringArray= {"aa","bb"}; --examples
		
//first we created objects and assigned to the variables and the stored those variables inside array	
		Card[] cardArray={card, card1,card2,card3};
		
// creating object and storing it directly into an Array of Cards
		Card[] cardArray1= {new MC(), new AX(), new VISA(), new Discovery()};
		
		//cardArray[0]-- MC
		// cardArray[3]--Discovery
	
		for (Card cc:cardArray1) {
			cc.chargeInterest();
			cc.creditLimit();
		}
	System.out.println("----------------------");
		for (int j = 0; j < cardArray1.length; j++) {
			cardArray1[j].creditLimit();
		}
		
System.out.println("------------------------");		
		
		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();
		
		AX ax1= new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();
		
		MC mc2=new MC();
		MC mc3=new MC();
		
		Discovery d1= new Discovery();
		d1.applePay();
		d1.chargeInterest();
		d1.creditLimit();
		
		Card ccard= new MC();
		ccard.chargeInterest();
		ccard.creditLimit();
		
		MC [] masterCards= {mc1,mc2,mc3};
		for(MC mCard:masterCards) {
			mCard.cashBack();
			mCard.chargeInterest();
			mCard.creditLimit();
		}
		
		
		
		
		
	}
}
