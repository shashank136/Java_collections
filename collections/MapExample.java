import java.util.*;

public class MapExample{
	public static void main(String args[]){
		Map map = new HashMap();

		map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");
	    
	    Set set = map.entrySet();
	    Iterator itr = set.iterator();

	    while(itr.hasNext()){
	    	Map.Entry entry=(Map.Entry)itr.next();
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }		      
	}
}