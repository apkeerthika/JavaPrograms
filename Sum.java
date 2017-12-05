import java.util.Scanner;

public class Sum
{
	public static void main(String[] args)
	{

		System.out.print("Enter The No of Elements");
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
	
		for (int i = 0;i<size;i++)
		{ 

			for (int j=0;j<size-i;j++)
			{

				System.out.print(" * ");
			}

			System.out.print("\n");
			
			
		}

			
	}

}