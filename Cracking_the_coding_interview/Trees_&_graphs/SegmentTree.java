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

	public int fetchRangeSum(SegNode p, int min, int max){
		if(p.start==p.end)
			if(min==p.start)
				return p.data
		if(checkRange(p,min,max))
			return fetchRangeSum(p.lc,min,max)+fetchRangeSum(p.rc,min,max);
	}

	public int getRangeSum(int min, int max){
		SegNode p = root;

		return fetchRangeSum(p,min,max);

	}

	public int getMaxSum(){
		return root.getSum();
	}
}

public class SegmentTree{
	public static void main(String[] args) {
		int ar[] = {1,3,5,7,9,11,0,0};
		int len = ar.length;

		SegTreeImpl t = new SegTreeImpl();
		
		t.insert(ar,0,len-1);
		
		System.out.println(t.getMaxSum());
	}
}