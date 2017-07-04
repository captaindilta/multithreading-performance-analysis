#Both of the threads created below are completely CPU bound threads.
#Total Execution Time: 45.56 seconds (almost 2.5 times slower than its sequential counterpart)


import threading
import time

class myThread(threading.Thread):
	def __init__(self, n):
		threading.Thread.__init__(self);
		self.n = n;
		
	def run(self):
		while(self.n > 0):
			self.n = self.n - 1;


start_time = time.time();
t1 = myThread(100000000);
t2 = myThread(100000000);
t1.start();
t2.start();
t1.join();
t2.join();
end_time = time.time();
	
print("\n\n--- Total Execution Time: %s seconds ---" % (end_time - start_time));

#System Used-
#OS: Windows 10; 64-bit Operating System
#Processor: 2.53 GHz Intel Core i3
#RAM: 2GB
#Cores: 2
#Logical Processors: 4
