import java.util.Scanner;
public class First
{

      private int getOption() {
      
            System.out.println("1. To find Odd or Even");
            System.out.println("2. Leap Year or Not");
            System.out.println("3. positive  or Negative");
            System.out.println("4. Compare two Numbers");
            System.out.println("5. Compare three Numbers");
            System.out.println("6. Swapping The Numbers");
            System.out.println("7. multiplication");

            System.out.println("Enter Choice: ");
            Scanner swit = new Scanner(System.in);
            int option = swit.nextInt();
            return option;
      }

      public static void main(String args[])        
      {
	 
            First f = new First();
            int choice = 0;
            while((choice=f.getOption())!=0) {
                switch (choice)

                {

                  case 1: 

                        Scanner s = new Scanner(System.in);
                      	 System.out.print("Enter any year:");
                      	 int year = s.nextInt();
                      	
                      	  f.isLeapYear(year);
                      	  f.oddOrEven(year);
                      	  f.positiveorNegative(year);
                  break;

                  case 2 :	

                      	  Scanner input = new Scanner(System.in);
                           int number1;      
                           int number2; 
                            
                           System.out.print( "Input first integer: " );        
                           number1 = input.nextInt();   
                       
                            System.out.print( "Input second integer: " );         
                            number2 = input.nextInt();

                            
                           f.compareTo(number1,number2);

                  break;

                  case 3:


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

                  break;

                  case 4:

                         Scanner fst = new Scanner(System.in);
                         int n1;      
                         int n2; 
                          
                         System.out.print( "Input first integer: " );        
                         n1 = fst.nextInt();   
                     
                          System.out.print( "Input second integer: " );         
                          n2 = fst.nextInt();
                          
                         System.out.println("Before Swapping");
                         System.out.println("Value of n1 is :" + n1);
                         System.out.println("Value of n2 is :" + n2);
                        
                         f.swap(n1,n2);

                  break;

                  case 5:



                         Scanner fir = new Scanner(System.in);
                         int v1;      
                         int v2; 
                          
                         System.out.print( "Input first integer: " );        
                         v1 = fir.nextInt();   
                     
                          System.out.print( "Input second integer: " );         
                          v2 = fir.nextInt();
                          
                         System.out.println("Before Swapping");
                         System.out.println("Value of n1 is :" + v1);
                         System.out.println("Value of n2 is :" + v2);
                        
                         f.swap2(v1,v2);

                  break;

                  case 6:

                        Scanner sca = new Scanner(System.in);
                      	System.out.print("Enter number:");        
                      	int n=sca.nextInt();

                      	f.multiplication(n);

                  break;

                  case 7:

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter number of rows for triangle: ");
                        int row= sc.nextInt();
                        System.out.println("Here you go: ");

                         f.drawtraingle(row);
              }
     	        }

    
    }



private void oddOrEven(int number)
{
	if(number % 2 == 0) {
		System.out.println("It is Even Number");
	}
	else {
		System.out.println("It is Odd Number");
	}
}


private void isLeapYear(int year) 
{


	boolean flag = false;
	if(year % 400 == 0 || year % 4 == 0)
	{
		flag = true;
	}
	else if (year % 100 == 0)
	{
		flag = false;
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


private  void swap(int x, int y) 

{
  int temp = x;
  x = y;
  y = temp;

  System.out.println("After Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 
}

private void swap2(int a,int b)
{
 
 	a=a+b;
 	b=a-b;
 	a=a-b;

  System.out.println("After Swapping");
  System.out.println("Value of x is :" + a);
  System.out.println("Value of y is :" + b);


}

private void multiplication(int n)

 {
 
   for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

 }

private void drawtraingle(int row)

{

	int NoOfSpaces = row-1;

	for (int rowCounter=0; rowCounter<row; rowCounter++)
        {
        	 
            for (int spaceCounter=0; spaceCounter<NoOfSpaces; spaceCounter++)
            {
                
                System.out.print(" ");
            }
            
            NoOfSpaces = NoOfSpaces - 1;
  
            
            for (int starCounter=0; starCounter<=rowCounter; starCounter++ )
            {
                
                System.out.print("* ");
            }
  
           
            System.out.println();
        }
    
}

}




