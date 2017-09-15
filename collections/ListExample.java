import java.util.*;

// This is an ArrayLiist example.
// uses dynamic array internally.

public class ListExample{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<>();

		al.add("Shashank"); // void add(int index, Object element);
		al.add("Rishi");
		al.add("Kumar");
		al.add(1,"Sahine");

		System.out.println("Element at 2nd position: "+al.get(2)); // public Object get(int index);
		
		for(String s: al){
			System.out.println(s);
		}

		String y = al.set(1,"Hayyal"); // public Object set(int index, Object o); will return the element being updated i.e. Sachine
		System.out.println("y :"+ y);
		System.out.println();

		System.out.println("\n ArrayList elements after update\n");

		ArrayList<String> al2 = new ArrayList<>();
		
		boolean x=al2.addAll(al); // public boolean addAll(Collection c);
		al2.add("Dummy element");
		al2.addAll(5,al); // public boolean addAll(int index, Collection c);

		System.out.println("Dummy element is at postion :"+ al2.indexOf("Dummy element")); // public int indexOf(Object o);
		System.out.println("last occurance of Shashank :"+ al2.lastIndexOf("Shashank")); //public int lastIndexOf(Object o);

		System.out.println(x);

		for(String s: al2){
			System.out.println(s);
		}

		ListIterator<String> itr=al.listIterator();
		
		System.out.println("traversing elements in forward direction...");  
		
		while(itr.hasNext()){  // public boolean hasNext();
		System.out.println(itr.next());  // public Object next();
		}  
		
		System.out.println("traversing elements in backward direction...");  
		
		while(itr.hasPrevious()){  // public boolean hasPrevious();
		System.out.println(itr.previous());  // public Object previous();
		}

		Object [] ob = al.toArray(); // public Object[] toArray();
		
		System.out.println("Printing elements from first to last:"); 
		
		for (Object value : ob) {
		System.out.println(value);
		}	

		// removing the last occurance of Shashank from al2 arraylist
		String str = al2.remove(5); // public Object remove(int index);
		System.out.println("removed :"+str);
		System.out.println();

		Iterator<String> st = al2.iterator();
		while(st.hasNext()){
			System.out.println(st.next());
		}
	}
}