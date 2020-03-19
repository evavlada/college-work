package q1;

import java.util.Scanner;

public class c2a2q1_2020_EvaVlada {

	public static void main(String[] args) {
		// get the user input 
		  Scanner sc = new Scanner(System.in);
	       System.out.print("Please enter a letter of the alphabet: ");
	       char letter1 = sc.next().charAt(0);
	       // test if it's valid
	       while (!Character.isLetter(letter1)) {
	    	   System.out.print("Invalid entry, please enter a letter of the alphabet: ");
		       letter1 = sc.next().charAt(0);  
	    	} 
	       // transforms the char into integer
	        int num1=0;  
	         int sum =0; 
			if(letter1>=97 && letter1<=122) {   //  ascii characters -96 ( a to z)
	        	  num1 = (int) letter1-96;
	            }else if(letter1>=64 && letter1<=90){ //ascii characters (A to Z)
	             num1 = (int) (letter1-64)+100;
	            }
			
	
	
	       System.out.print("Please enter a letter of the alphabet: ");
	       
	       char letter2 = sc.next().charAt(0);
	       while (!Character.isLetter(letter2)) {
	    	   System.out.print("Invalid entry, please enter a letter of the alphabet: ");
		       letter2 = sc.next().charAt(0);  
	    	}
	       
	      int num2=0;  
	   	if(letter2>=97 && letter2<=122) {   //  ascii characters -96 ( a to z)
	      	  num2 = (int) letter2-96; 
	          }else if(letter2>=65 && letter2<=90){ //ascii characters (A to Z)
	           num2 = (int) (letter2-64)+100;        
	          }
	
	       System.out.print("Please enter a letter of the alphabet: ");
	       char letter3 = sc.next().charAt(0);
	       while (!Character.isLetter(letter3)) {
	    	   System.out.print("Invalid entry, please enter a letter of the alphabet: ");
		       letter3 = sc.next().charAt(0);  
	    	}          
	                                
	                    
	 int num3=0;      
	if(letter3>=97 && letter3<=122) {   //  ascii characters -96 ( a to z)
  	  num3 = (int) letter3-96; 
      }else if(letter3>=65 && letter3<=90){ //ascii characters (A to Z)
       num3 = (int) (letter3-64)+100;        
      }
	// displays the char entered by user
	System.out.println("The letters you entered are: " + "[" + letter1 +", " +letter2 +", "+letter3 + "]");
        // adds the nums
        sum = num1+num2+num3;
        
        System.out.println("The sum is: "+ sum); 
    
        
	//Display if the password is unlocked or not 
	if(sum%5==0) {
		System.out.println("Password Unlocked.");
	}else {System.out.println("Incorect password, please try again.");
	
	}
	sc.close();
	}
	}


