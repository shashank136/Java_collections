import java.util.*;

public class LinkedListDemo{
	public static void main(String args[]){

		LinkedList<String> al=new LinkedList<String>();
		al.add("Shashank");
		al.add("Rishi");
		al.add("Kumar");
		al.add("Hayyal");

		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}