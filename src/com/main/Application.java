package com.main;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Application {

//	static boolean isValidemail(String email) { 
//		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
//	//regex to validate email. 
//	return email.matches(regex);
//	}
//	//match email id with regex and return the value 
	 public static void main(String[] args) { 
//		String email = "ssthva@gmail.com";
//		System.out.println("The Email ID is: " + email); 
//		System.out.println("Email ID valid? " + isValidemail(email)); 
//		email = "@sth@gmail.com";
//		System.out.println("The Email ID is: " + email); 
//		System.out.println("Email ID valid? " + isValidemail(email)); }
	
		 Scanner in = new Scanner(System.in);
		 int testCases = Integer.parseInt(in.nextLine());		
		 while(testCases>0){
			 String pattern = in.nextLine();
			 try{
				 Pattern.compile(pattern);
				 System.out.println("Valid");
			 }catch (PatternSyntaxException e){
				 System.out.println("Invalid");              
			 }
			 testCases--;  
		 }
	}
}


