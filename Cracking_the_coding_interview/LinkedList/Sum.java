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

	public int[] sendSum(int x, int y){
		int result[] = new int[2];
		result[0] = (x+y)/10; // carry
		result[1] = (x+y)%10; // base to be added

		return result;
	}

	public Node getSum(Node a, Node b, int n, int m){
		Node c = null;
		Node d = null;
		int carry=0;

		if(n>=m){
			c=a;d=b;
		}
		else{
			c=b;d=a;
		}
		
		while( c!=null  && c.next!=null){
				while(d.next!=null){
					int res[] = new int[2];
					res = sendSum(c.data, d.data);
					c.data = res[1] + carry;
					carry = res[0];
					d = d.next;
					break;
				}
				if(d.next==null){
					c = c.next;
					int res[] = new int[2];
					res = sendSum(c.data, d.data);
					c.data = res[1] + carry;
					carry = res[0];
				}
				c = c.next;
			}
			if(c!=null)
				c.data += carry;
		return (n>=m)? a: b;
	}	
}

public class Sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Node a=null,b=null;

		while(n-->0){
			if(a==null)
				a = new Node(sc.nextInt());
			else{
				a.addNode(sc.nextInt());
			}
		}

		while(m-->0){
			if(b==null)
				b = new Node(sc.nextInt());
			else{
				b.addNode(sc.nextInt());
			}
		}

		Node c = a.getSum(a,b,n,m);

		while(c.next!=null){
			System.out.print(c.data+"-->");
			c = c.next;
		}
		System.out.println(c.data);
	}
}