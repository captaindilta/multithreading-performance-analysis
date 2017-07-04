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
		for i in range(1000):
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
	
	
	start_time = time.time();
	list1 = u1.selectionSort(list1);
	print("Sorted Array:");
	u1.printArray(list1);
	print();
	
	list2 = u1.selectionSort(list2);
	print("Sorted Array:");
	u1.printArray(list2);
	print();
	end_time = time.time();
	
	list3 = u1.selectionSort(list3);
	print("Sorted Array:");
	u1.printArray(list3);
	print();
	
	list4 = u1.selectionSort(list4);
	print("Sorted Array:");
	u1.printArray(list4);
	print();
	
	list5 = u1.selectionSort(list5);
	print("Sorted Array:");
	u1.printArray(list5);
	print();
	
	list6 = u1.selectionSort(list6);
	print("Sorted Array:");
	u1.printArray(list6);
	print();
	end_time = time.time();
	
	list7 = u1.selectionSort(list7);
	print("Sorted Array:");
	u1.printArray(list7);
	print();
	
	list8 = u1.selectionSort(list8);
	print("Sorted Array:");
	u1.printArray(list8);
	print();
	
	end_time = time.time();
	
	print("--- Total Execution Time: %s seconds ---" % (end_time - start_time));
	
if(__name__ == '__main__'):
	main();