public class Swap
{
	 private void swap(int i ,int j)
	{
		int k = i;
		i = j;
		j = k;

		System.out.println("After Swapping\ni = "+i+"\nj = "+j);

	}

	 public static void main(String[] args)
	{
		int x = 10;
		int y = 20;

		  System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

		swap(x,y);
 
	}

}