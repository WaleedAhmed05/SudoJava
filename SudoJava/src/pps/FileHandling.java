package pps;


import java.io.*;


public class FileHandling {
	
	
	public static void main(String [] args) {
	
		/*
		File fc= new File("W:\\Projects\\Github\\SudoJava\\SudoJava\\src\\pps\\textfile.txt");
	
	try {
		boolean value =fc.createNewFile();
		
		
		if(value) {
			System.out.println("File has been created: ");
		}
		else {
			System.out.println("File not created for some reason");
			
		}
		
	}
	
	catch(Exception e) {
		System.err.println("not created");
	}
	
	*/
	
   try {
	   
	   
	   FileWriter fwriter= new FileWriter("W:\\\\Projects\\\\Github\\\\SudoJava\\\\SudoJava\\\\src\\\\pps\\\\textfile.txt");
		
		fwriter.write("I am Waleed Ahmed");
	   fwriter.close();
	FileReader freader= new FileReader("textfile.txt");
	
	
	char[] array= new char[100];
	freader.read(array);
	System.out.println(array);
	freader.close();
   }
   
   catch (Exception e) {
	   System.err.println("Exception occured for some reason: ");
   }
	

}
}
