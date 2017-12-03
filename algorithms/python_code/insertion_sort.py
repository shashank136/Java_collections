def insertion_sort(a):
	"""
	Here a is list which needs to be sorted using insertion sort
	time complexity of insertion sort is O(n^2)
	space complexity of insertion sort is O(1)
	"""
	temp = 0
	
	for i in a:
		temp = i
		for j in range(a.index(i),0,-1):
			if a[j] < a[j-1]:
				a[j] = a[j-1]
				a[j-1] = temp

	return a

a = [5,2,4,6,1,3]
insertion_sort(a)

print("list after sorting is ")
print(a)
