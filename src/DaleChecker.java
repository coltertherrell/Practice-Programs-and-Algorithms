
public class DaleChecker 
{
	
	public String str = "legit";
	
	public boolean isDale(String s)
	{
		if(s.equals(str))
		{
			System.out.println("Dale is lagite");
			return true;
		}
		else
		{
			System.out.println("Dale is not lagite");
			return false;
		}
		
	}

	public static void main(String[] args)
	{
		DaleChecker dale = new DaleChecker();
		
		dale.isDale("lagite");
	}
}
