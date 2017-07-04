// Total Execution Time: 1.712 seconds
// Threaded program 'PerformanceTestThreaded.java' is 2 times as fast as 'PerformanceTestSequential.java'
// Java conventionally schedule threads to run concurrently on all available processors and cores.
public class PerformanceTestThreaded implements Runnable
{
	int N;
	
	public PerformanceTestThreaded(int n)
	{
		this.N = n;
	}
	
	public void run()
	{
		while(this.N > 0)
		{
			this.N -= 1;
		}
	}
	
	public static void main(String args[])
	{
		PerformanceTestThreaded object1 = new PerformanceTestThreaded(2000000000);
		Thread t1 = new Thread(object1);
		PerformanceTestThreaded object2 = new PerformanceTestThreaded(2000000000);
		Thread t2 = new Thread(object2);
		
		long startTime = System.nanoTime();
		t1.start();
		t2.start();
		
		try {
			System.out.println("Waiting for thread 1 to finish!");
			t1.join();
		} catch(InterruptedException e) {
			System.out.println("Main thread interrupted!");
		}
		
		try {
			System.out.println("Waiting for thread2 to finish!");
			t2.join();
		} catch(InterruptedException e) {
			System.out.println("Main thread interrupted!");
		}
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("-------Total Execution Time: " + (double)totalTime / 1000000000 + " seconds-------");
	}
}

// System Used-
// OS: Windows 10; 64-bit Operating System
// Processor: 2.53 GHz Intel Core i3
// RAM: 2GB
// Cores: 2
// Logical Processors: 4
