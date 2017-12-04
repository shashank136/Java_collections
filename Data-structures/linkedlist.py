class Node:
	def __init__(self,data):
		self.data = data
		self.next = None

class LinkedList(object):
	def __init__(self):
		self.head = None

	def append(self,data):
		"""
		function to add new node at the end
		"""
		if self.head==None:
			self.head = Node(data)
		else:
			current = self.head
			while current.next != None:
				current = current.next
			current.next = Node(data)


	def prepend(self,data):
		"""
		function to add new node at the beginning
		"""
		newNode = Node(data)
		if self.head == None:
			self.head = newNode
		else:
			newNode.next = self.head
			self.head = newNode


	def display(self):
		"""
		function to display all the nodes in Linkedlist
		"""
		t = self.head
		if self.head == None:
			print("linked list is empty")
			return -1

		while t != None:
			print(t.data)
			t = t.next

	def countNode(self):
		"""
		function to find the number of nodes in the linked list
		"""
		if self.head == None:
			print("Linked list is empty")
		else:
			count = 0
			t = self.head
			while t.next != None:
				count += 1
				t = t.next
			print("Total number of nodes in the linked list are: ",count)

if __name__ == "__main__":

	ll = LinkedList()
	ll.append(10);
	ll.append(12);
	ll.append(14);
	ll.append(15);
		
	ll.prepend(5);

	ll.countNode();

	ll.display();