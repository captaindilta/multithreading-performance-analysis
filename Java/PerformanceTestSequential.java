// Total Execution Time: 3.249 seconds
// This sequential execution is almost 2 times slower than by creating two separate threads of execution in PerformanceTestThreaded.java

public class PerformanceTestSequential
{
	int N;
	
	public PerformanceTestSequential(int n)
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
		PerformanceTestSequential t1 = new PerformanceTestSequential(2000000000);
		PerformanceTestSequential t2 = new PerformanceTestSequential(2000000000);
		
		long startTime = System.nanoTime();
		t1.run();
		t2.run();
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("\n\nExecution Time: " + (double)totalTime / 1000000000);
	}
}

// System Used-
// OS: Windows 10; 64-bit Operating System
// Processor: 2.53 GHz Intel Core i3
// RAM: 2GB
// Cores: 2
// Logical Processors: 4
