package com.lockedMe;
import java.util.Scanner;

public class LockedMeMain {
	

	    public static void main(String[] args) throws InterruptedException{
	      
	        FileOperations.CreateFolder("Main");
	        System.out.println("Please enter Project Name and developerName");
	        Scanner sc = new Scanner(System.in);
	        WelComeClass.WelcomeMethod(sc.nextLine(), sc.nextLine());
	        HandleOptions.HomeMenuBusinessOperation();
	        }        	
}


