import java.util.Scanner;


public class myMergeSort 
{
	private static int[] array;
	private static int[] tempArray;
	private static int length;
	
	public static void sort(int[] inputArray)
	{
		array = inputArray;
		length = inputArray.length;
		tempArray = new int[length];
		mergeSort(0, length - 1);
	}
	
	private static void mergeSort(int low, int high)
	{
		if(low < high)
		{
			int middle = low + (high - low)/2;
			
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			mergeParts(low, middle, high);
		}
	}
	
	private static void mergeParts(int low, int middle, int high)
	{
		for(int i = low; i <= high; i++)
		{
			tempArray[i] = array[i];
		}
		int x = low;
		int y = middle + 1;
		int z = low;
		
		while(x <= middle && y <= high)
		{
			if(tempArray[x] <= tempArray[y])
			{
				array[z] = tempArray[x];
				x++;
			}
			else
			{
				array[z] = tempArray[y];
				y++;
			}
			z++;
		}
		while(x <= middle)
		{
			array[z] = tempArray[x];
			z++;
			x++;
		}
	}
	public static void main(String[] args)
	{
		//myMergeSort sorter = new myMergeSort();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the number of integers to sort: ");
		
        int C = Integer.parseInt(in.nextLine());
		int[] input = new int[C];
		for(int i = 0; i < C; i++)
		{
			System.out.print("Integer " + (i+1) + ": ");
			input[i] = in.nextInt();
		}
		
		sort(input);
		
		for(int i : input)
		{
			System.out.print(i + " " + "\n");
		}
		in.close();
	}

}
