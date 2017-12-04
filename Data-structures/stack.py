class stack(object):
	"""
	implementation of stack using the list in python
	"""
	def push(self,stack,x,top):
		print(top)
		if top<5:
			top += 1
			stack.insert(top,x)
		elif top>=5:
			print("Stack overflow")
			return top

		return top

	def pop(self,stack,top):
		if top < 0:
			print("Stack underflow")
			return -1
		else:
			print("number poped is: ",stack[top])
			del(stack[top])
			top -= 1
			return top

	def __init__(self):
		# Assuming stack of size 5
		stack = []
		top = -1
		print("1: PUSH, 2: POP, 3: EXIT")
		while(True):
			n = int(input("enter the option: "))
			if n==1:
				x = int(input("enter the number to be pushed: "))
				top = self.push(stack,x,top)
				print("top is: ",top)
			elif n==2:
				top = self.pop(stack,top)
				print("top is: ",top)
			elif n==3:
				print("Thanks for using my stack datastructure.")
				break
			else:
				print("invalid option")

if __name__ == "__main__":
	st = stack()