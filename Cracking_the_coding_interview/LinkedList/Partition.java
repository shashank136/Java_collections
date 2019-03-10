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

	public Node partition(int d){
		Node p = this;
		Node start = this;
		Node t = null;
		Node parent = null;

		if(p.data==d)
			t=p;

		if(t==null){
			while(p.next!=null){
				if(p.next.data < d){
					t = p.next;
					p.next = p.next.next;
					t.next = start;
					start = t;
				}
				parent = p;
				p = p.next;
			}
			if(p.data<d){
				t = p;
				parent.next = null;
				t.next = start;
				start = t;
			}
		}

		return p;
	}

	public Node partitionDivide(int d){
		Node before = null;
		Node after = null;
		Node p = this;

		while(p.next!=null){
			if(p.data<d){
				if(before==null)
					before = new Node(p.data);
				else{
					before.addNode(p.data);
				}
			}
			else{
				if(after==null)
					after = new Node(p.data);
				else{
					after.addNode(p.data);
				}
			}
			p = p.next;
		}
		if(p.data<d){
			if(before==null)
				before = new Node(p.data);
			else{
				before.addNode(p.data);
			}
		}
		else{
			if(after==null)
				after = new Node(p.data);
			else{
				after.addNode(p.data);
			}
		}

		Node t = before;
		while(t.next!=null){
			t = t.next;
		}
		t.next = after;

		return t;
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

public class Partition{
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

		Node r = node.partition(k);
		Node t = node.partitionDivide(k);

		r.iterateLinkedList();
		t.iterateLinkedList();
	}
}