import java.util.*;
import java.io.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}

class Main {
	public static Node root;
	public static int maxLevel=0;
	public static Integer res=null;
	public static Node search(int data){
		
		if(root==null) return null;
		
		if(root.data==data) return root;
		
		Node cur=root;
		Node prev=null;

		while(cur!=null){
			if(cur.data==data)
				return cur;
			else if(cur.data>data){
				prev=cur;
				cur=cur.left;
			}
			else if(cur.data<data){
				prev=cur;
				cur=cur.right;
			}
		}
		return prev;
	}
	public static void insert(int data){
		if(root==null){
			root = new Node(data);
			return;
		}
		Node cur = search(data);
		if(cur.data==data)
			return;
		else{
			if(cur.data>data)
				cur.left=new Node(data);
			else
				cur.right=new Node(data);
		}
	}
	public static void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void levelOrderTraversal(Node root){
		if(root==null) return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			Node cur = q.poll();
			if(cur==null){
				if(q.isEmpty())
					break;
				System.out.println();
				q.add(null);
			}else{
				System.out.print(cur.data+" ");
				if(cur.left!=null) q.add(cur.left);
				if(cur.right!=null) q.add(cur.right);
			}
		}
	}
	public static Node getSucc(Node root){
		Node cur = root.right;
		while(cur!=null && cur.left!=null){
			System.out.println("cur: "+cur.data);
			cur=cur.left;
		}
		System.out.println("cur: "+cur.data);
		return cur;
	}
	public static Node delNode(Node root, int x){
		if(root==null) return null;
		if(root.data>x)
			root.left = delNode(root.left, x);
		else if(root.data<x)
			root.right = delNode(root.right, x);
		else{
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			else{
				System.out.println("here");
				Node succ = getSucc(root);
				root.data = succ.data;
				root.right = delNode(root.right, succ.data);
			}
		}
		return root;
	}
	public static void leftView(Node root, int level){
		if(root==null) return;
		if(maxLevel<level){
			System.out.println(root.data);
			maxLevel=level;
		}
		leftView(root.left, level+1);
		leftView(root.right, level+1);
	}
	public static void rightView(Node root, int level){
		if(root==null) return;
		if(maxLevel<level){
			System.out.println(root.data);
			maxLevel=level;
		}
		rightView(root.right, level+1);
		rightView(root.left, level+1);
	}
	public static int getFloorRecursive(Node root, int x){
		if(root==null) return (res==null)?-1:res;
		else if(root.data==x) return root.data;
		else if(root.data>x)
			return getFloorRecursive(root.left, x);
		else{
			res = (res==null)?root.data:Math.max(res,root.data);
			return getFloorRecursive(root.right,x);
		}
	}
	public static int getFloorIterative(Node root, int x){
		Node cur = root;
		int floor = -1;
		while(cur!=null){
			if(cur.data==x)
				return cur.data;
			else if(cur.data>x)
				cur = cur.left;
			else{
				floor = Math.max(floor, cur.data);
				cur=cur.right;
			}

		}
		return floor;
	}
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// List<Integer> ar = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()){
			insert(Integer.parseInt(st.nextToken()));
		}
		inorder(root);
		System.out.println();
		System.out.println("Level order traversal");
		levelOrderTraversal(root);
		// maxLevel=0;
		System.out.println();
		// System.out.println("Left View");
		// leftView(root,1);
		// maxLevel=0;
		// System.out.println();
		// System.out.println("Right View");
		// rightView(root,1);
		
		// delNode(root,Integer.parseInt(br.readLine()));

		// System.out.println();
		// inorder(root);

		// maxLevel=0;
		// System.out.println();
		// System.out.println("Right View");
		// rightView(root,1);
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()){
			res = null;
			System.out.println(getFloorIterative(root,Integer.parseInt(st.nextToken())));
		}
	}
}
