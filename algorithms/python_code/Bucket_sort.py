class Bucket_sort(object):
	"""
	Time complexity of bubble sort is O(n+k)
	space complaxity of bubble sort is O(n)
	"""
	def bucket_sort(self,a,n):
		b = {} # dictionary to hold multiple list
		
		for i in range(n):
			index = int(n*a[i])
			if index in b:
				b[index].append(a[i])
			else:
				b[index] = [a[i]]

		k = b.keys()
		for i in k:
			b[i].sort()

		c = list(k)
		c.sort()

		index = 0
		for i in c:
			for e in b[i]:
				a[index] = e
				index += 1

	def printList(self,a):
		return a


	def __init__(self):
		a = [0.897,0.565,0.656,0.1234,0.665,0.3434]
		n = len(a)
		self.bucket_sort(a,n)
		print(self.printList(a))

b = Bucket_sort()