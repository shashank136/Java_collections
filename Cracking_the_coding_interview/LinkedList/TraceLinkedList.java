import java.util.*;
import java.io.*;

class Node{
	int data;
	Node next = null;

	public Node(int d){
		data = d;
	}

	public void addNode(int d){
		Node t = new Node(d);
		Node n = this;

		while(n.next!=null){
			n = n.next;
		}

		n.next = t;
	}

	public void getKtoLastNodes(int k){ // Prints the node values from k to Nth node.
		int n = 0;
		Node p = this;

		while(p.next != null){
			n++;
			if(n>=k){
				System.out.print(p.data+", ");
			}
			p = p.next;
		}
		System.out.print(p.data+", ");
	}

	public Node getKtoEndNodes(int k){
		int n = 0;
		Node p = this;
		Node head = this;

		while(p.next != null){
			n++;
			if(n==k){
				head = p;
				break;
			}
			p = p.next;
		}

		return head;
	}
}

public class TraceLinkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node node = null;
		while(n-->0){
			if(node==null)
				node = new Node(sc.nextInt());
			else
				node.addNode(sc.nextInt());
		}

		int k = sc.nextInt();

		node.getKtoLastNodes(k);
		System.out.println(node.getKtoEndNodes(k));
	}
}