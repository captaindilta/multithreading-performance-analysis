import java.util.*;

public class Handler
{
		
	public static int[] createArray(int a, int b)
	{
		Random rand = new Random();
		int[] result = new int[8000];
		
		for(int i = 0; i < 8000; i++)
		{
			int temp = rand.nextInt((b - a) + 1) + a;
			result[i] = temp;
		}
		
		return result;
	}
	
	public static void printArray(int array[])
	{
		for(int i = 0; i < array.length; i++)
		{
		System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	public static int[] selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	
}