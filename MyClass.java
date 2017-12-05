public class MyClass
{
	public void showSum(float x,float y,int count)
	{
		if(count<1)
			return;
		float sum = x + y;

		for(int i = 0; i < count; i++)
			System.out.println(sum);
		return;
	}

	public static void main(String[] args)
	{
		MyClass m = new MyClass();
		m.showSum(7.5f, 4.5f, 0);

		System.out.println("I AM BACK");
	}
}