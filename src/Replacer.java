
public class Replacer 
{
	public static String replace(String s)
	{
		String str = s;
		//int length = str.length();
		str = str.replaceAll("[ ]", "%20");
		
		if(str.endsWith(" "))
		{
			str.replaceAll("[ ]", "");
		}
		
		
		return str;
	}
	public static void main(String[] args)
	{
		System.out.println(replace("Mr John Smith   "));
		
	}

}
