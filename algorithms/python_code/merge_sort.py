class Merge_sort(object):
	"""
	Merge sort follows divide and conquer algorithm
	This class contains two methods merge and merge_sort
	time complexity of merge sort is O(nlogn)
	space complexity of merge sort is O(n)
	"""
	def merge(self,a,start,end,mid):
		b = a[start:mid+1] # first half of the list
		c = a[mid+1:end+1] # second half of the list
		n1 = len(b)
		n2 = len(c)
		i=0
		j=0
		k=start
		while(True):
			if i<n1 and j<n2:
				if b[i] < c[j]:
					a[k] = b[i]
					k += 1
					i += 1
				else:
					a[k] = c[j]
					k += 1
					j += 1
			else:
				if i < n1:
					a[k] = b[i]
					k += 1
					i += 1
				elif j < n2:
					a[k] = c[j]
					k += 1
					j += 1
				else:
					break

	def merge_sort(self,a,start,end):
		if start < end:
			mid = (start+end)//2
			self.merge_sort(a,start,mid)
			self.merge_sort(a,mid+1,end)
			self.merge(a,start,end,mid)

	def __init__(self):
		n = int(input("enter number of elements in list: "))
		b = []
		for i in range(n):
			b.append(int(input("enter number: ")))

		start = 0
		end = len(b)-1
		if start < end:
			self.merge_sort(b,start,end) # divide the list into smaller lists
		else:
			print(a[start])
		print("list after sorting: ",b)


a = [5,2,4,7,1,3,2,6]
print("list to be sorted: ",a)
l = Merge_sort()