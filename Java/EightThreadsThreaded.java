// Total Execution Time of 'EightThreadsSequential': 0.4988 seconds
// Total Execution Time of 'EightThreadsThreaded': 0.251 seconds
public class EightThreadsThreaded extends Thread
	{
		
		int[] array1;
		public EightThreadsThreaded(int[] arr)
		{
			this.array1 = arr;
		}
		
		public void run(){ 
		Handler t = new Handler();
		array1 = t.selectionSort(this.array1);
		}
	
	 
	public static void main(String args[]){ 
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
	
	
	
	EightThreadsThreaded thread1 = new EightThreadsThreaded(arr1);
	EightThreadsThreaded thread2 = new EightThreadsThreaded(arr2);
	EightThreadsThreaded thread3 = new EightThreadsThreaded(arr3);
	EightThreadsThreaded thread4 = new EightThreadsThreaded(arr4);
	EightThreadsThreaded thread5 = new EightThreadsThreaded(arr5);
	EightThreadsThreaded thread6 = new EightThreadsThreaded(arr6);
	EightThreadsThreaded thread7 = new EightThreadsThreaded(arr7);
	EightThreadsThreaded thread8 = new EightThreadsThreaded(arr8);
	
	long startTime = System.nanoTime();
	thread1.start();
	thread2.start();
	thread3.start();
	thread4.start();
	thread5.start();
	thread6.start();
	thread7.start();
	thread8.start();
	
	try {
            System.out.println("Waiting for thread 1 to finish.");
			thread1.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	
	try {
            System.out.println("Waiting for thread 2 to finish.");
			thread2.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	try {
            System.out.println("Waiting for thread 3 to finish.");
			thread3.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	
	try {
            System.out.println("Waiting for thread 4 to finish.");
			thread4.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	try {
            System.out.println("Waiting for thread 5 to finish.");
			thread5.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	
	try {
            System.out.println("Waiting for thread 6 to finish.");
			thread6.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	try {
            System.out.println("Waiting for thread 7 to finish.");
			thread7.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
	
	try {
            System.out.println("Waiting for thread 8 to finish.");
			thread8.join();
        } 
	catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

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
