import java.util.*;


class SegNode{
	int data;
	SegNode lc;
	SegNode rc;
	int start;
	int end;

	public int getSum(){
		return this.data;
	}

	public void updateNode(int data){
		this.data = data;
	}
}

class SegTreeImpl{

	SegNode root;

	public SegTreeImpl(){
		root = new SegNode();
	}

	public SegNode add(int ar[], int start, int end){

		SegNode s = new SegNode();

		if(start == end){
			s.data = ar[start];
			s.start = start;
			s.end = start;
			return s;
		}

		int mid = (start+end)/2;

		SegNode l = add(ar, start, mid);
		SegNode r = add(ar, mid+1, end);

		s.data = l.data + r.data;
		s.lc = l;
		s.rc = r;
		s.start = start;
		s.end = end;

		return s;
	}

	public void insert(int ar[], int s, int e){
		root = add(ar,s,e);
	}

	public boolean checkRange(SegNode s, int min, int max){
		if((min>=s.start || min<=s.end)||(max>=s.start || max<=s.end))
			return true;
		return false;
	}

	public boolean checkLeafNode(SegNode s, int min, int max){
		if(s.start>=min && s.start<=max)
			return true;
		else
			return false;
	}

	public int fetchRangeSum(SegNode p, int min, int max){
		
		if(p.start==p.end){ // single node in the segment tree or leaf node
			if(checkLeafNode(p,min,max)){
				return p.data;
			}
			else{
				return 0;
			}
		}
		if(checkRange(p,min,max))
			return fetchRangeSum(p.lc,min,max)+fetchRangeSum(p.rc,min,max);
		else
			return 0;
	}

	public int getRangeSum(int min, int max){
		SegNode p = root;

		return fetchRangeSum(p,min,max);

	}

	public int getMaxSum(){
		return root.getSum();
	}

	public void preOrdertraversal(SegNode p){
		if(p!=null){
			System.out.print(p.data+" ");
			preOrdertraversal(p.lc);
			preOrdertraversal(p.rc);
		}
	}

	public void printTree(){
		SegNode p = root;
		preOrdertraversal(p);
	}

	public int updateValues(SegNode p, int n, int val){
		if(p.start==p.end ){ 
			if (n==p.start)
				p.updateNode(val);
			return p.data;
		}
		if(n>p.end || n<p.start)
			return p.data;
		return updateValues(p.lc, n, val)+updateValues(p.rc, n, val);
	}

	public boolean updateNodeValues(int index, int value){
		SegNode s = root;
		if(index<s.start || index>s.end)
			return false;
		else{
			s.data = updateValues(s,index,value);
		}
		return true;
	}
}

public class SegmentTree{
	
	public static int maxArraySize(int n){
		int p = 1;
		while(p<n){
			p = p<<1;
		}
		return p;
	}

	public static void main(String[] args) {
		int a[] = {1,3,5,7,9,11}; 
		int ar[];
		int l = a.length;
		int l1 = maxArraySize(l);
		if(l!=l1){
			ar = new int[maxArraySize(l)];
			int i=0;
			for(i=0; i<l; i++){
				ar[i] = a[i];
			}
			for(; i<l1; i++)
				ar[i] = 0;
		}else
			ar = a;

		int len = ar.length;

		SegTreeImpl t = new SegTreeImpl();
		
		t.insert(ar,0,len-1);
		
		System.out.println(t.getMaxSum());
		System.out.println(t.getRangeSum(2,4));
		t.updateNodeValues(2,11);
		System.out.println(t.getRangeSum(2,4));
		// t.printTree(); // Un-comment to see the pre-traversal of the segment tree formed.
	}
}
