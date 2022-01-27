package project.java.filehandling;

import java.io.FileWriter;

public class FileWrite {
	  public static void main(String args[]) {

	    String data = "This is the data in the output file";
	    
	    try {
	      
	      FileWriter output = new FileWriter("C://New folder//Project.txt");

	     
	      output.write(data);
	      System.out.println("Data is written to the file.");

	     
	      output.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}

