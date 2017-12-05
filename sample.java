import java.util.Scanner;
public class sample 
{
 	public static void main(String args[])
 	{
	 
	 
		Scanner s = new Scanner(System.in);
	 	System.out.print("Enter any year:");
	 	int year = s.nextInt();
	 	First f = new First();
	 	f.isLeapYear(year);
	  	f.oddOrEven(year);
	  	f.positiveorNegative(year);

	

	 	Scanner input = new Scanner(System.in);
     	int number1;      
     	int number2; 
      
     	System.out.print( "Input first integer: " );        
     	number1 = input.nextInt();   
 
      	System.out.print( "Input second integer: " );         
      	number2 = input.nextInt();

     	f.compareTo(number1,number2);


	 

		Scanner scan = new Scanner(System.in);
		int num1;      
		int num2;
		int num3; 

		System.out.print( "Input first integer: " );        
		num1 = scan.nextInt();   

		System.out.print( "Input second integer: " );         
		num2 = scan.nextInt();

		System.out.print( "Input third integer: " );         
		num3 = scan.nextInt();

		f.compareTo(num1,num2,num3);
   
     



		Scanner fst = new Scanner(System.in);
		int n1;      
		int n2; 

		System.out.print( "Input first integer: " );        
		n1 = input.nextInt();   

		System.out.print( "Input second integer: " );         
		n2 = input.nextInt();

		System.out.println("Before Swapping");
		System.out.println("Value of n1 is :" + n1);
		System.out.println("Value of n2 is :" + n2);

		f.swap(n1,n2);

        
   





		Scanner sca = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=sca.nextInt();

		f.multiplication(n);






		Scanner swit= new Scanner( System.in );

		int v;

		System.out.println("1. To find Odd or Even");
		System.out.println("2. Leap Year or Not");
		System.out.println("3. positive  or Negative");
		System.out.println("4. Compare two Numbers");
		System.out.println("5. Compare three Numbers");
		System.out.println("6. Swapping The Numbers");
		System.out.println("7. multiplication");

		System.out.println();
		System.out.println("Enter number (or 0 to exit)");
		v = swit.nextInt();

   		while (v != 0)
		{
		  if(v <0 || v >7)
		  {
		      System.out.println("Wrong input");
		    }
		     
		  if(v >=1 && v<=7)
		  {
		      switch(v)
		      {
		  


		case 1:
		{


		private void oddOrEven(int number)
		{
		if(number % 2 == 0) {
		System.out.println("It is Even Number");
		}
		else {
		System.out.println("It is Odd Number");
		}
		}

		}





		case 2 :
		{


		private void isLeapYear(int year) 
		{


		boolean flag = false;
		if(year % 400 == 0)
		{
		flag = true;
		}
		else if (year % 100 == 0)
		{
		flag = false;
		}
		else if(year % 4 == 0)
		{
		flag = true;
		}
		else
		{
		flag = false;
		}
		if(flag)
		{
		System.out.println("Year "+year+" is a Leap Year");
		}
		else
		{
		System.out.println("Year "+year+" is not a Leap Year");
		}

		}

		}






		case 3:
		{


		private void positiveorNegative(int number)
		{
		if( number == 0)
		{ 
		System.out.println("Number is equal to zero"); 
		}
		else if (number > 0)
		{ 
		System.out.println("Number is positive"); 
		}
		else 
		{ 
		System.out.println("Number is negative"); 
		}
		}
		}





		case 4:
		{


		private void compareTo(int x,int y) 
		{

		if(x<y)
		{
			
			System.out.println("lessthan");
			
		}

		else
			
		if(x>y)
			
			{
				System.out.println("GreaterThan");
				
			}
		else

		 if(x==y)
			
			{
		         System.out.println("Equals");
			}
		 else
		       
			   {

		           System.out.println("Error");
			   }

		}
		}




		case 5:
		{



		private void compareTo(int x,int y,int z)

		{

		 if ( x > y && x > z )
		 System.out.println("X is largest.");
		else if ( y > x && y > z )
		 System.out.println("Y is largest.");
		else if ( z > x && z > y )
		 System.out.println("Z is largest.");
		else   
		 System.out.println("Entered numbers are not distinct.");

		}
		}




		case 6:
		{



		private  void swap(int x, int y) 

		{
		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		}
		}




		case 7:
		{


		private void multiplication(int n)

		{

		for(int i=1; i <= 10; i++)
		{
		    System.out.println(n+" * "+i+" = "+n*i);
		}

		}

		}

		}
		}

}
}




