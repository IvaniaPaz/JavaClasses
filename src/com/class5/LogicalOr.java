package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		/*7 days a week
		 * if days is 2 or 4 ---> SDLC CLASS
		 * if days is 6 or 7 ---->JAVA CLASS
		 * if days is 1 or 5 ---->NO CLASS
		 * if day is =3------> REVIEW CLASS
		 */
	
		int day=3;
		
		if(day==2 || day==4) {
		System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
		System.out.println("Java Class");
		}else if (day==1 || day==5) {
		System.out.println("No class");
		}else if (day==3) {
		System.out.println("Review class");
		}else {
		System.out.println("Not a valid day");
		}
		
		/*7 days a week
		 * if days is Tuesday or Thursday ---> SDLC CLASS
		 * if days is Saturday or Sunday ---->JAVA CLASS
		 * if days is Monday or Friday ---->NO CLASS
		 * if day is Wednesday------> REVIEW CLASS
		 */
		
		String weekDay="Day";
		
		if (weekDay.equals("Tuesday")|| weekDay.equals("Thursday")) {
		System.out.println("SDLC CLASS");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
		System.out.println("JAVA CLASS");
		}else if (weekDay.equals("Monday") || weekDay.contentEquals("Friday")) {
		System.out.println("NO CLASS");
		}else if(weekDay.equals("Wednesday")) {
		System.out.println("REVIEW CLASS");
		}else {
		System.out.println("NOT A VALID DAY");
		}
 }
}
