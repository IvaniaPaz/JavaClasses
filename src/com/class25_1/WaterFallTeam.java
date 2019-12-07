package com.class25_1;

import com.class25.Employee;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
		WaterFallTeam team= new WaterFallTeam();
		team.companyName="Syntax";
		team.employeeID=12345; //accessing protected variable in different package
		

	}

}
