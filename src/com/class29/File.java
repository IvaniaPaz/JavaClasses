package com.class29;

public abstract class File {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("Edit");
	}
	public void close() {
		System.out.println("Close");
	}
	
}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java file");
		
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open sublime text");
		
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open .doc file");
		
	}
	
}