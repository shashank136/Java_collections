import java.util.*;
import java.io.*;

class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
	}
}

public class linkedlist{
	Node head;

	// function to add new node at the end
	public void append(int data){
		if(head==null){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = new Node(data);
	}

	// function to add new node at the beginning
	public void prepand(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}
		newNode.next = head;
		head = newNode;
	}

	// function to display all the nodes in Linkedlist
	public void display(){
		Node t = head;

		if(head ==null){
			System.out.println("Linked list is empty.");
			return;
		}

		while(t!=null){
			System.out.println(t.data);
			t = t.next;
		}
	}

	// function used to find the number of nodes in  linkedlist
	public void countNode(){
		if(head==null){
			System.out.println("Linked list is empty");
			return;
		}

		int count=0;
		Node t = head;
		while(t!=null){
			count++;
			t = t.next;
		}
		System.out.println("Number of nodes in Linked list: "+count);
	}

	public static void main(String []args){

		linkedlist ll = new linkedlist();
		ll.append(10);
		ll.append(12);
		ll.append(14);
		ll.append(15);
		
		ll.prepand(5);

		ll.countNode();

		ll.display();
	}
}