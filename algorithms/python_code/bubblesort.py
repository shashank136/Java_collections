class Bubblesort(object):
	"""
	It's an inplace sorting algorithm
	time complexity of bubble sort is O(n^2)
	space complexity of bubble sort is O(1)
	"""
	def __init__(self):
		n = int(input("enter the number of elements: "))
		a = []
		for i in range(n):
			a.append(int(input("enter the number: ")))
		print("list to be sorted: ",a)
		self.bubble_sort(a)
		self.print_list(a)
		
	def bubble_sort(self,a):
		for j in range(len(a)-1,2,-1):
			for i in range(0,j):
				if a[i] > a[i+1]:
					(a[i],a[i+1]) = (a[i+1],a[i])

	def print_list(self,a):
		print("list after sorting: ",a)

item = Bubblesort()