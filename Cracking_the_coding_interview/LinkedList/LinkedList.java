import java.util.*;
import java.io.*;

class Node{
	int data;
	Node next = null;

	public Node(int d){
		data = d;
	}

	public void addNode(int d){ // add nodes to the linked list
		Node t = new Node(d);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = t;
	}

	public Node deleteNode(int d, Node head){ // deleted Nodes from the linked list
		Node n = head;
		if(head==null)
			return -1;
		if(n.data==d){
			head = head.next;
			return head
		}
		while(n.next!=null){
			if(n.next.data==d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
	}

	public Node removeDuplicate(Node head){ // removes the duplicates from an unsorted linked list
		Node p1 = head;

		while(p1.next!=null){
			Node p2 = p1;
			while(p2.next!=null){
				if(p1.data == p2.next.data){
					p2.next = p2.next.next;
				}
				else
					p2 = p2.next;
			}
			p1 = p1.next;
		}
		return head;
	}
}

public class LinkedList{
	public static void main(String[] args) {
		
	}
}