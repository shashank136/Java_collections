class Quicksort(object):
	"""
	Quicksort is an in-place sorting algorithm
	time complexity of quick sort is O(nlogn)
	space complaxity of quick sort is O(logn)
	"""
	def partition(self,a,start,end):
		pivot = a[end]
		pi = start-1
		for i in range(start,end):
			if a[i] <= pivot:
				pi += 1
				(a[i],a[pi])=(a[pi],a[i])

		(a[end],a[pi+1])=(a[pi+1],a[end])
		return pi+1

	def quicksort(self,a,start,end):
		if start < end:
			index = self.partition(a,start,end)
			self.quicksort(a,start,index-1)
			self.quicksort(a,index+1,end)

	def printList(self,a):
		return a

	def __init__(self):
		n = int(input("enter the size of list: "))
		l = []
		for i in range(n):
			l.append(int(input("enter the number: ")))
		self.quicksort(l,0,n-1)
		print(self.printList(l))

a = Quicksort()