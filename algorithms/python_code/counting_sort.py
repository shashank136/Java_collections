class counting_sort(object):
    """
    time complexity of counting sort is O(n+k)
    sapce complexity of counting sort is O(k)
    """
    def countingsort(self,a,size,k):
        c = [] # stores the number of occurance of an element in array
        b = [] # output array
        
        # initializing array c
        for i in range(k):
            c.append(0)
        
        for i in range(size):
            b.append(0)
            
        # storing the frequency of each element in array a into c.
        for i in range(1,size):
            c[a[i]] = c[a[i]] + 1

        # storing the rank for each element
        for i in range(1,k):
            c[i] += c[i-1]

        # updating the array b with sorted list of the elements
        for j in range(size-1,0,-1):
            b[c[a[j]]] = a[j]
            c[a[j]] = c[a[j]]-1

        # print the output array
        print("list after sorting is: ",b[1:])


    def __init__(self):
        k = 5
        a=[0,5,0,2,1,5,2,1,5,1,4]
        print("list to be sorted is: ",a[1:])
        self.countingsort(a,len(a),k+1)

c = counting_sort()
