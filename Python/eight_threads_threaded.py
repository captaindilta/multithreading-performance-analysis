import random
import threading
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
		for i in range(1000):
			temp = random.randint(start, end);
			list.append(temp);
		return list;

		
	def printArray(self, list):
		for i in list:
			print(i, end = " ");



class MyThread(threading.Thread):
	list1 = [];
	def __init__(self, arr):
		threading.Thread.__init__(self);
		self.list1 = arr;
		
	def run(self):
		u9 = Util();
		u9.selectionSort(self.list1);
		

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
	
	list3 = u1.createArray(20, 29);
	print("Unsorted Array:");
	u1.printArray(list3);
	print();
	
	list4 = u1.createArray(30, 39);
	print("Unsorted Array:");
	u1.printArray(list4);
	print();
	
	list5 = u1.createArray(40, 49);
	print("Unsorted Array:");
	u1.printArray(list5);
	print();
	
	list6 = u1.createArray(50, 59);
	print("Unsorted Array:");
	u1.printArray(list6);
	print();
	
	list7 = u1.createArray(60, 69);
	print("Unsorted Array:");
	u1.printArray(list7);
	print();
	
	list8 = u1.createArray(70, 79);
	print("Unsorted Array:");
	u1.printArray(list8);
	print();
	
	t1 = MyThread(list1);
	t2 = MyThread(list2);
	t3 = MyThread(list3);
	t4 = MyThread(list4);
	t5 = MyThread(list5);
	t6 = MyThread(list6);
	t7 = MyThread(list7);
	t8 = MyThread(list8);
	
	start_time = time.time();
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	t5.join();
	t6.join();
	t7.join();
	t8.join();
	end_time = time.time();
	
	print("Sorted Array :");
	u1.printArray(list1);
	print();
	
	print("Sorted Array :");
	u1.printArray(list2);
	print();
	
	print("Sorted Array :");
	u1.printArray(list3);
	print();
	
	print("Sorted Array :");
	u1.printArray(list4);
	print();
	
	print("Sorted Array :");
	u1.printArray(list5);
	print();
	
	print("Sorted Array :");
	u1.printArray(list6);
	print();
	
	print("Sorted Array :");
	u1.printArray(list7);
	print();
	
	print("Sorted Array :");
	u1.printArray(list8);
	print();
	
	print("\n\n--- Total Execution Time: %s seconds ---" % (end_time - start_time));

if(__name__ == '__main__'):
	main();