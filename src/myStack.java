import java.util.ArrayList;

public class myStack
{
	public int head, current;
	public static ArrayList<Integer> stack = new ArrayList<Integer>();
	
	public void push(int num)
	{
		current = num;
		stack.add(current);
		head = stack.indexOf(num);
	}
	
	public void pop()
	{
		stack.remove(head-1);	
	}

	public int size() 
	{
		return stack.size();
	}
	public int getEl(int index)
	{
		return stack.get(index);
	}
	
	public static void main(String[] args)
	{
		myStack s = new myStack();
		
		s.push(4);
		s.push(8);
		s.push(12);
		s.push(15);
		
		s.pop();
		

		
		

		
		for(int i = 0; i < s.size(); i++)
		{
			System.out.println(s.getEl(i));
		}
	
	}
}