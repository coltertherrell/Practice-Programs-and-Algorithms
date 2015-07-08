import java.util.Scanner;


public class myQuickSortString 
{
	private String[] array;
	private int length;
	
	private void sort(String[] input)
	{
		if(input == null || input.length == 0)
		{
			return;
		}
		if(input.length == 0)
		{
			return;
		}
		this.array = input;
		length = array.length;
		quickSort(0, length - 1);
		
		
	}
	
	private void quickSort(int low, int high)
	{
		int i = low;
		int j = high;
		
		String pivot = array[low + (high - low)/2];
		
		while(i <= j)
		{
			while(array[i].compareTo(pivot) < 0)
			{
				i++;
			}
			while(array[j].compareTo(pivot) > 0)
			{
				j--;
			}
			if(i <= j)
			{
				exchange(i, j);
				i++;
				j--;
			}
		}
		if(low < j)
		{
			quickSort(low, j);
		}
		if(i < high)
		{
			quickSort(i, high);
		}
	}
	
	private void exchange(int i, int j)
	{
		String tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void main(String args[])
	{
		myQuickSortString sorter = new myQuickSortString();
		
		Scanner in = new Scanner(System.in);
		
		String tmp = in.nextLine();
        int C = Integer.parseInt(tmp);
		String[] input = new String[C];
		for(int i = 0; i < C; i++)
		{
			input[i] = in.nextLine();
		}
		
		sorter.sort(input);
		
		for(String i : input)
		{
			System.out.print(i + " " + "\n");
		}
		in.close();
		
		
		
	}
	
	

}
