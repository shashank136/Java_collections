import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		File folder = new File("C:\\Users\\H SHASHANK KUMAR\\Desktop\\hi");
		if(!folder.exists()){
			folder.mkdir();
		}
		String fileName = "hello.txt";
		File file = new File(folder+ File.separator +fileName);
		file.createNewFile();
		String path = "C:\\Users\\H SHASHANK KUMAR\\Desktop\\hi\\hello.txt";
		Hashtable ht = new Hashtable();
		ht.put("Document Id", "1234");
		ht.put("Archive Id", "asdf");
		Enumeration texts;
		texts = ht.keys();
		try(BufferedWriter w = new BufferedWriter(new FileWriter(path))){
			while(texts.hasMoreElements()){
				String l = (String)texts.nextElement();
				String t = l+": "+ht.get(l);
				if(t!=null){
					w.write(t);
					w.newLine();
				}
			}
		}
	}
}
