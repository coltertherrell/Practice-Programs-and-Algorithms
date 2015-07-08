import java.util.Scanner;


public class allUnique 
{
	
	public static boolean allCharsAreUnique(String str)
	{
		boolean char_set[] = new boolean[256];
		
		for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if(char_set[val])
			{
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String input;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		input = in.nextLine();
		input = input.replaceAll(" ", "");
		
		if(allCharsAreUnique(input))
		{
			System.out.println(input + " contains all unique chars");
		}
		else
		{
			System.out.println(input + " contains more than 1 of at least 1 char");
		}
		/*
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "aaaaaaaaaaa";
		if(allCharsAreUnique(str1))
		{
			System.out.println(str1 + " contains all unique chars");
		}
		if(allCharsAreUnique(str2))
		{
			System.out.println(str2 + " contains all unique chars");
		}
		else
		{
			System.out.println(str2 + " contains more than 1 of at least 1 char");
		}
		*/
		in.close();
		
	}

}
