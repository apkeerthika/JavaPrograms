import java.util.Scanner;
public class Mysecond

{


      public static void main(String args[])
        
        {

        	 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter number of rows for triangle: ");
		     int row= sc.nextInt();
		     System.out.println("Here you go: ");
		     Mysecond s=new Mysecond();
		     s.drawtraingle(row);


		     Scanner scan =new Scanner(System.in);
		     System.out.println("Enter the No of Rows for triangle:");
		     int rows = scan.nextInt();
		     s.righttraiangle(rows);

             Scanner scann =new Scanner(System.in);
             System.out.println("Enter the No of Rows for triangle:");
             int ro = scann.nextInt();
             s.inverttraiangle(ro);

             Scanner sca =new Scanner(System.in);
             System.out.println("Enter the No of Rows for triangle:");
             int n = sca.nextInt();
             s.updowntraingle(n);

             Scanner scn = new Scanner(System.in);
             System.out.print("Enter Number of Rows : ");
             int r = scn.nextInt();
             s.pascaltraingle(r);

             Scanner input = new Scanner(System.in);
             System.out.print("Enter Number of Rows : ");
             int ra = input.nextInt();
             s.floydstraingle(ra);
             System.out.println("Floyds Traingle:");
        
        }


      private void drawtraingle(int row)
    
    	{
        
        	int NoOfSpaces = row-1;
  
      
  
       		 for (int i=0; i<row; i++)
        
        		{
        	
            		for (int j=0; j<NoOfSpaces; j++)
            			
            			{
               
                			System.out.print(" ");
            			}
            
            	NoOfSpaces = NoOfSpaces - 1;
  
            			for (int starCounter=0; starCounter<=i; starCounter++ )
            				
            				{
                
                				System.out.print("* ");
           					 }
  
            
         	   System.out.println();
        		}
   	    }

   	private void righttraiangle(int number)
  
        {

        	for ( int i=0;i<number;i++)
        	{
        		for (int j=0;j<=i;j++)
        		{
        			System.out.println("*");

        		}

        	    System.out.println("");
        	}


        }

    private void inverttraiangle(int rows)

        {
            
            for (int i = rows; i > 0; i--) 
            {
            
                for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            
            System.out.print("\n");
        }
        }

    private void updowntraingle(int n)

        {
            for(int i=0;i>=n;i--)
            {
            for(int j=0;j>i;j--)
            {
            System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++)
            {
            System.out.print("*");
            }
            System.out.println();
            }
        }

    private void pascaltraingle(int row)
    
        {

            
            for(int i=0;i<row;i++)
            {
            for(int k=row; k>i; k--)
            {
                System.out.print(" ");
            }
            int number = 1;
            for(int j=0;j<=i;j++)
            {
                 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
            }
            System.out.println();
            }
        }

    private void floydstraingle(int rows)
    {
 
        int number=1;
        for ( int counter = 1 ; counter <= rows ; counter++ )
       {
           for ( int j = 1 ; j <= counter ; j++ )
           {

                System.out.print(number+" ");
                //Incrementing the number value
                number++;
           }
           //For new line
           System.out.println();
       }

    }
}