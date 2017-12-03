class Heapsort(object):
	"""
	This is the implementation of max heap.
	Heap sort is an in-place sorting technique
	time complexity of heap sort is O(nlogn)
	space complexity of heap sort is O(1)
	"""
	def heapify(self,a,n,i):
		largest = i # index of parent node
		l = 2*i+1 # index of left child
		r = 2*i+2 # index of right child

		#  if left child is larger then root
		if l<n and a[l]>a[largest]:
			largest=l

		# if right child is larger then largest so far	
		if r<n and a[r]>a[largest]:
			largest=r

		# is largest is not root	
		if largest != i:
			(a[i],a[largest])=(a[largest],a[i])
			self.heapify(a,n,largest)

	def heapsort(self,a,n):
		# n//2-1 gives the count of root plus internal nodes excluding leaf nodes 
		for i in range((n//2)-1,-1,-1):
			self.heapify(a,n,i) # starting from the last parent
		for i in range(n-1,-1,-1):
			(a[i],a[0]) = (a[0],a[i])
			self.heapify(a,i,0)

	def printArray(self,a):
		return a

	def __init__(self):
		a = [13,20,7,2,17]
		print("list before sorting: ",a)
		self.heapsort(a,len(a))
		print("list after sorting: ",self.printArray(a))

h = Heapsort()