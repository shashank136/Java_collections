import java.util.*;

// In TreeMap the keys are automatically sorted.

public class MapDemo{
	public static void main(String args[]){
		
		Map<String, String> pl = new TreeMap<>();
		
		pl.put("S001","Shashank");
		pl.put("S002","Kumar");
		pl.put("H001","Shashank");
		pl.put("S003","Rishi");

		pl.put("S003","Rishidada");

		Set<String> keys= pl.keySet(); // It is used to return the Set view containing all the keys.
		System.out.println(keys);
		System.out.println();

		Set key_value = pl.entrySet(); // It is used to return the Set view containing all the keys and values.
		System.out.println(key_value);
		System.out.println();		

		for(String key:keys){
			System.out.println("Part# :"+key+" "+pl.get(key));
		}

	}
}