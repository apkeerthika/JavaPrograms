public class Switch 

{	
	static void switchTest(int caseValue)
        {
		
                switch(caseValue) 
                {
                case 0:
                        System.out.println("Case 0.");
                        break;               
                case 1:
                        System.out.println("Case 1.");
                        break;               
                case 2:
                        System.out.println("Case 2.");
                        break;               
                default:
                        System.out.println("Default Case.");
 
        }
}	
 
	public static void main(String args[])
        { 
		
		switchTest(1); 
	}
}