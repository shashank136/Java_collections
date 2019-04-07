import java.util.*;
import java.io.*;


class Node{
	int data;
	Node next;

	public Node(int data){
		this.data = data;
	}

	public void addNode(int data){
		Node x = new Node(data);
		Node n = this;
		while(n.next!=null){
			n= n.next;
		}
		n.next = x;
	}

	public boolean isPalindrome(){
		Node p1 = this;
		Node p2 = this;

		Stack<Integer> stack = new Stack<Integer>();

		while(p2!=null && p2.next!=null){
			stack.push(p1.data);
			p1 = p1.next;
			p2 = p2.next.next;
		}

		if(p2!=null){
			// there are odd number of nodes
			p1 = p1.next;
		}

		while(p1!=null){
			int top = stack.pop().intValue();

			if(top!=p1.data)
				return false;
			p1 = p1.next;
		}

		return true;

	}
}

public class Palindrome{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node head= null;
		while(n-->0){
			if(head==null)
				head = new Node(sc.nextInt());
			else
				head.addNode(sc.nextInt());
		}

		System.out.println(head.isPalindrome());
	}
}