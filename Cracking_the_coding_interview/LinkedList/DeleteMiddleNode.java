import java.util.*;
import java.io.*;

class Node{
	int data;
	Node next=null;

	public Node(int data){
		this.data = data;
	}

	public void addNode(int d){
		Node p = this;
		Node t = new Node(d);

		while(p.next!=null){
			p = p.next;
		}

		p.next = t;
	}

	public Node deleteNode(int d){
		// Deleting the first occurance of the Node
		Node head = this;
		Node p = this;

		if(p.data==d){
			p.next = p.next.next;
			return p;
		}
		while(p.next!=null){
			if(p.next.data==d){
				p.next = p.next.next;
				break;
			}
			p = p.next;
		}

		return p;
	}

	public void iterateLinkedList(){
		Node head = this;

		while(head.next!=null){
			System.out.print(head.data+", ");
			head = head.next;
		}
		System.out.print(head.data);
	}
}

public class DeleteMiddleNode{
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

		node.deleteNode(k);
		node.iterateLinkedList();
	}
}