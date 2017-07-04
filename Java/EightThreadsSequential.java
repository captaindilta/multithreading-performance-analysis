// Total Execution Time of 'EightThreadsSequential': 0.4988 seconds
// Total Execution Time of 'EightThreadsThreaded': 0.2514 seconds
public class EightThreadsSequential
	{
	
	public static void main(String[] args){ 
	
	Handler t1 = new Handler();

	int arr1[] = t1.createArray(1, 9);
	System.out.println("Unsorted Array 1:");
	t1.printArray(arr1);
	
	int arr2[] = t1.createArray(11, 19);
	System.out.println("Unsorted Array 2:");
	t1.printArray(arr2);
	
	int arr3[] = t1.createArray(21, 29);
	System.out.println("Unsorted Array 3:");
	t1.printArray(arr3);
	
	int arr4[] = t1.createArray(31, 39);
	System.out.println("Unsorted Array 4:");
	t1.printArray(arr4);
	
	int arr5[] = t1.createArray(41, 49);
	System.out.println("Unsorted Array 5:");
	t1.printArray(arr5);
	
	int arr6[] = t1.createArray(51, 59);
	System.out.println("Unsorted Array 6:");
	t1.printArray(arr6);
	
	int arr7[] = t1.createArray(61, 69);
	System.out.println("Unsorted Array 7:");
	t1.printArray(arr7);
	
	int arr8[] = t1.createArray(71, 79);
	System.out.println("Unsorted Array 8:");
	t1.printArray(arr8);
	
	
		
	long startTime = System.nanoTime();
	arr1 = t1.selectionSort(arr1);
	arr2 = t1.selectionSort(arr2);
	arr3 = t1.selectionSort(arr3);
	arr4 = t1.selectionSort(arr4);
	arr5 = t1.selectionSort(arr5);
	arr6 = t1.selectionSort(arr6);
	arr7 = t1.selectionSort(arr7);
	arr8 = t1.selectionSort(arr8);
	long endTime   = System.nanoTime();	
	
	System.out.println("Sorted Array 1: ");
	t1.printArray(arr1);
	
	System.out.println("Sorted Array 2: ");
	t1.printArray(arr2);
	
	System.out.println("Sorted Array 3: ");
	t1.printArray(arr3);
	
	System.out.println("Sorted Array 4: ");
	t1.printArray(arr4);
	
	System.out.println("Sorted Array 5: ");
	t1.printArray(arr5);
	
	System.out.println("Sorted Array 6: ");
	t1.printArray(arr6);
	
	System.out.println("Sorted Array 7: ");
	t1.printArray(arr7);
	
	System.out.println("Sorted Array 8: ");
	t1.printArray(arr8);
	
	
	long totalTime = endTime - startTime;
	
	System.out.println("\n\nExecution Time: " + (double)totalTime / 1000000000);
	
 }  
}
