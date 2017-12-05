import java.util.Scanner;
public class Largest
{

	public static void main(String[] args)
	{

		System.out.print("Enter The No Of Elements:");
		Scanner input=new Scanner(System.in);
		int size = input.nextInt();
		for(int i = 1;i<=size;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
            System.out.print("\n");
 		}

		
    }

	private static void findLargest(int[] numbers)
	{

	}

}