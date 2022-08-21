import java.util.Scanner;

public class Main {
		
		//function to checkPalindrome

	    public void checkPalindrome(int number) {
	    	int X = number;
			int Y = 0;		
			
			while(X>0) {
				int digit = X % 10;			
				Y = Y * 10 + digit;			
				X = X / 10;
			}
			
			if(Y==number) {
				System.out.println("Yes, It is a Palindrome.");
			} else {
				System.out.println("Not a Palindrome!");
			}
	    	
	    }
		
	    //function to printPattern

	    public void printPattern(int number) {
	    	for (int i=number; i>=1; i--) {
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
	    	
	    }
	    
	    //function to check no is prime or not

	    public void checkPrimeNumber(int number) {	    	
	    	if(number==1) {
	    		System.out.println("! is neither Prime nor Composite.");
	    	} else {
	    		int a=1;
	    		for(int i=2; i<number; i++) {
	    			if(number%i==0) {
	    				System.out.println(number + " is not a Prime number.");
	    				a=0;
	    				break;
	    			}
	    		}
	    		if(a!=0) {
	    			System.out.println(number + " is a Prime number.");
	    		}
	    	}
	    	
	    }


	    // function to print Fibonacci Series

	    public void printFibonacciSeries(int number) {
	    	
	    	//initialize the first and second value as 0,1 respectively.
	    	
	    	int n1 = 0, n2 = 1, n3 = 0;
	    	int count = number-2;
	    	System.out.print("The Fibonacci series is: "+n1+" "+n2);
	    	while(count>0) {
	    		n3 = n1 + n2;
	    		System.out.print(" "+n3);
	    		n1 = n2;
	    		n2 = n3;
	    		
	    		count--;
	    	}
	    	System.out.println("");
	    }
	    
	    //main method which contains switch and do while loop

	    public static void main(String[] args) {
	    	
	    	Main obj = new Main();
	    	
	    	int choice;
	    	
	    	int number;
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	do {
	    			    			    		
	    		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n" 
	    		
	    				+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
				
						+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
				
				System.out.println();
				
				choice = sc.nextInt();
			
				switch (choice) {
				
					case 0:				
						choice = 0;					
						break;		
						
					case 1: 
						{	
						System.out.println("Enter INPUT: ");
				    	number = sc.nextInt();
						obj.checkPalindrome(number);	
						}
					
						break;		
					 
				
					case 2: 
					
						{				 
						System.out.println("Enter INPUT: ");
					    number = sc.nextInt();
						obj.printPattern(number);					
						}
					
						break;
					 
				
					case 3: 
					
						{
						System.out.println("Enter INPUT: ");
					    number = sc.nextInt();
						obj.checkPrimeNumber(number);					
						}
					
						break;					 
					
					case 4: 
						
						{			 
						System.out.println("Enter INPUT: ");
					    number = sc.nextInt();
						obj.printFibonacciSeries(number);
						}
					
						break;
				
					default:
				
						System.out.println("Invalid choice. Enter a valid no.\n");
				
				}
				
				
				
			} while (choice != 0);
			
				System.out.println("Exited Successfully!!!");
				
				sc.close();
			
		}		
}