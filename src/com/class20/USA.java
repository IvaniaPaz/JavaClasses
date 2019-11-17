package com.class20;

 class USA {
	private String captialCity="Washington, DC";
	public String mainState="New York";
	protected String school="Syntax Technologies";
	
public static void main(String[]args) {
	USA us=new USA();
	System.out.println("access from inside USA");
	System.out.println(us.mainState);
	System.out.println(us.school);
	System.out.println(us.captialCity);
	
	
	
}
}
