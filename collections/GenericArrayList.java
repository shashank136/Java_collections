import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

// Colllection: List example

public class GenericArrayList{
	public static void main(String args[]){
		List<Integer> partList = new ArrayList<>(3);

		partList.add(new Integer(1111));
		partList.add(new Integer(2222));
		partList.add(new Integer(3333));
		//partList.add("Bad Input");
		partList.add(new Integer(4444));
		partList.add(new Integer(5555));
		partList.add(0, new Integer(6666));
		Integer x = partList.remove(3);
		System.out.println(x);
		System.out.println(partList.size());

		Iterator<Integer> elements = partList.iterator();
		while(elements.hasNext()){
			Integer partNumberObject = elements.next();
			int partNumber = partNumberObject.intValue();

			System.out.println("part number: "+ partNumber);
		}
	}
}