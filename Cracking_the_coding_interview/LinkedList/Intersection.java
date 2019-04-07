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

	public void addAtEnd(Node x){
		Node present = this;
		while(present.next!=null)
			present = present.next;
		present.next = x;
	}

}

public class Intersection{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node h1= null;
		while(n-->0){
			if(h1==null)
				h1 = new Node(sc.nextInt());
			else
				h1.addNode(sc.nextInt());
		}

		int n1 = sc.nextInt();

		Node h2= null;
		while(n-->0){
			if(h2==null)
				h2 = new Node(sc.nextInt());
			else
				h2.addNode(sc.nextInt());
		}

		boolean flag = false;

		// check for intersection
		int l1 = 0;
		while(h1.next!=null){
			h1 = h1.next;
			l1++;
		}

		int l2 = 0;
		while(h2.next!=null){
			h2 = h2.next;
			l2++;
		}

		if(h1.equals(h2))
			flag = true;

		if(flag){
			// find the intersection node.
			int exclude=-1;
			if(l1>l2){
				exclude = l1-l2;
				while(h1.next!=null && l1!=l2){
					h1 = h1.next;
					l1--;
				}
			}else if(l2>l1){
				exclude = l2-l1;
				while(h2.next != null && l2!=l1){
					h2 = h2.next;
					l2--;
				}
			}

			while(h1 != h2){
				h1 = h1.next;
				h2 = h2.next;
			}

			System.out.println("Found the intersection at: "+h1.data);

		}else{
			System.out.println("There is no intersection.");
		}
	}
}