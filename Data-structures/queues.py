class queues(object):
	"""
	implementation of queues using python list
	"""
	def enqueue(self,queue,front,back,num,MAX):
		if back == MAX-1:
			print("queue is full")
			return front,back
		else:
			back += 1
			queue.insert(back,num)
			if front == -1:
				front += 1
			return front,back

	def dequeue(self,queue,front,back,MAX):
		if front == -1:
			print("queue is empty")
			return front,back
		else:
			print(queue[front])
			front += 1
			if front > back and back == MAX-1:
				front = -1
				back = -1
			return front,back

	def __init__(self,front=-1,back=-1):
		# Assuming queue of size 5
		self.front = front
		self.back = back
		MAX = 5
		queue = []
		front,back = self.enqueue(queue,front,back,2,MAX)
		front,back = self.enqueue(queue,front,back,3,MAX)
		front,back = self.enqueue(queue,front,back,5,MAX)
		front,back = self.enqueue(queue,front,back,9,MAX)
		front,back = self.dequeue(queue,front,back,MAX)
		front,back = self.dequeue(queue,front,back,MAX)
		front,back = self.dequeue(queue,front,back,MAX)

if __name__ == "__main__":
	q = queues()