package com.class25;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("-----------Creating an object of Employee-----------");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("----------Creating an object of ScrumTeam---------");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint DEMO, Planning, Retro, Daily StandUp";
		sm.attendScrumMeeting();
		
		System.out.println("--------Creating an object of Developer------");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint DEMO, Planning, Retro, Daily StandUp";
		dev.attendScrumMeeting();
		dev.employeeID=101;
//		dev.employeeSSN not accessible 
		
	   System.out.println("--------Creating an object of ProductOwner------");
	   ProductOwner pO=new ProductOwner();
	   pO.salary=98000;
	   pO.work();
	   pO.getPaid();
	   pO.prioritize();
	   pO.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
	   pO.ceremonies="Sprint DEMO, Planning, Retro, Daily StandUp";
	   pO.attendScrumMeeting();
	   
	   System.out.println("--------Creating an object of BuinessAnalyst------");
	   BusinessAnalyst bA=new BusinessAnalyst();
	   bA.salary=150000;
	   bA.work();
	   bA.getPaid();
	   bA.writeRequirement();
	   bA.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
	   bA.ceremonies="Sprint DEMO, Planning, Retro, Daily StandUp";
	   bA.attendScrumMeeting();
	   
	   
		
	}
}
