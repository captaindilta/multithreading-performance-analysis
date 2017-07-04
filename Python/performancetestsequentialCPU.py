#Total Execution Time: 18.35 seconds (almost 2.5 times faster than while using two different threads of execution)

import time

def count(n):
	while(n > 0):
		n -= 1;
		
start_time = time.time();
count(100000000);
count(100000000);
end_time = time.time();

print("\n-------Total Execution Time-------%s seconds" %(end_time - start_time));

#System Used-
#OS: Windows 10; 64-bit Operating System
#Processor: 2.53 GHz Intel Core i3
#RAM: 2GB
#Cores: 2
#Logical Processors: 4
