import java.util.Scanner;

import java.io.*;

 
public class Calculator {
    
 
    public static void main(String[] args) {

 
    	int choice;

    	int x;

    	int y;

    	int sum;

    	PrintStream out;

 
    	Calculator calc = new Calculator();

 
 
    	try

    	{

    		out = new PrintStream ("calclog.txt");

 
    		do

    		{

    			System.out.println("Calculator Program");

    			System.out.println("--------------------\n");

    			System.out.println("1.  Add");

    			System.out.println("2.  Subtract");

    			System.out.println("3.  Multiply");

    			System.out.println("4.  Divide");

    			System.out.println("5.  Mod");

    			System.out.println("6.  Power");

    			System.out.println("99. End Program\n");

    			System.out.println("Enter Choice: ");

 
    			Scanner input = new Scanner(System.in);

    			choice = input.nextInt();

 
    			while ((choice < 1 || choice > 6) && choice != 99)

    			{

    				System.out.println("Please enter a 1, 2, 3, 4, 5, or 6: " );

    				choice = input.nextInt();

    			}

 
 
    			System.out.println("Please enter 2 numbers only: ");

    			x = input.nextInt();

    			y = input.nextInt();

 
    				switch (choice)

    				{

    					case 1: 

    						sum = calc.add(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "+" + y + "=" + sum);

    						break;

 
    					case 2:

    						sum = calc.sub(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "-" + y + "=" + sum);

    						break;

 
    					case 3:

    						sum = calc.multi(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "*" + y + "=" + sum);

    						break;

 
    					case 4:

    						sum = calc.div(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "/" + y + "=" + sum);

    						break;

 
    					case 5:

    						sum = calc.mod(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "%" + y + "=" + sum);

    						break;

 
    					case 6:

    						sum = calc.pow(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "^" + y + "=" + sum);

    						break;

    				}

 
    		}

 
    		while (choice != 99);

    		System.out.println("Ending program...");

 
    	}

 
    	catch(Exception e)

    	{

    		System.out.println("ERROR: Could not open file!");

    	}

 
 
 
 
 
 
 
    }

}