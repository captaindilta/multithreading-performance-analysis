# Total Execution Time : 14.04 seconds
#System Used-
#OS: Windows 10; 64-bit Operating System
#Processor: 2.53 GHz Intel Core i3
#RAM: 2GB
#Cores: 2
#Logical Processors: 4

import random
import time

class Util:
	def selectionSort(self, list):
		n = len(list);
		for i in range (n - 1):
			min = i;
			j = i + 1;
			while(j < n):
				if(list[j] < list[min]):
					min = j;
				j = j + 1;
			temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		return list;

	def createArray(self, start, end):
		list = [];
		for i in range(8000):
			temp = random.randint(start, end);
			list.append(temp);
		return list;

		
	def printArray(self, list):
		for i in list:
			print(i, end = " ");


	
def main():
	u1 = Util();
	
	list1 = u1.createArray(0, 9);
	print("Unsorted Array:");
	u1.printArray(list1);
	print();
	
	list2 = u1.createArray(10, 19);
	print("Unsorted Array:");
	u1.printArray(list2);
	print();
	
	start_time = time.time();
	list1 = u1.selectionSort(list1);
	list2 = u1.selectionSort(list2);
	end_time = time.time();
	
	print("Sorted Array:");
	u1.printArray(list1);
	print();
	
	print("Sorted Array:");
	u1.printArray(list2);
	print();
	
	print("--- Total Execution Time: %s seconds ---" % (end_time - start_time));
	
if(__name__ == '__main__'):
	main();
