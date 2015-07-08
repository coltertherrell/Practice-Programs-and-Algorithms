
import java.util.Scanner;


public class myQuickSortInt 
{
	private int[] array;
	private int length;
	
	public void sort(int[] inputArray)
	{
		if(inputArray == null || inputArray.length == 0)
		{
			return;
		}
		if(inputArray.length == 0)
		{
			return;
		}
		this.array = inputArray;
		length = array.length;
		quickSort(0, length - 1);
		
		
	}
	
	private void quickSort(int low, int high)
	{
		int i = low;
		int j = high;
		
		int pivot = array[low + (high - low)/2];
		
		while(i <= j)
		{
			while(array[i] < pivot)
			{
				i++;
			}
			while(array[j] > pivot)
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
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void main(String args[])
	{
		myQuickSortInt sorter = new myQuickSortInt();
		
		Scanner in = new Scanner(System.in);		
		
		String tmp = in.nextLine();
        int C = Integer.parseInt(tmp);
		int[] input = new int[C];
		for(int i = 0; i < C; i++)
		{
			input[i] = in.nextInt();
		}
		
		sorter.sort(input);
		
		for(int i : input)
		{
			System.out.print(i + " " + "\n");
		}
		in.close();
		
		
		
	}
	
	

}