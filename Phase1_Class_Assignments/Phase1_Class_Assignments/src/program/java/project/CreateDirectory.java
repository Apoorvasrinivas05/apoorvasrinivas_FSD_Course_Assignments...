package program.java.project;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {

	public static void main(String[] args) {
		System.out.println("Enter the path where you want to create a Directory:");
		Scanner sc =new Scanner(System.in);
		String path =sc.next();
		System.out.println("Enter the name of the desired a directory:");
		path=path+sc.next();
	    File f1= new File(path);
	    boolean bool =f1.mkdir();
	    if(bool){
	    	System.out.println("Directory is created successfully");
	    }
	    else{
	    	System.out.println("Error found!");
	    }
}

	}



