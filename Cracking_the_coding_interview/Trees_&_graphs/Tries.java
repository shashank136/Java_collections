import java.util.*;
import java.io.*;

class TrieNode{
	int count;
	TrieNode list[] = new TrieNode[26];

	TrieNode next(final char c){
		return list[c-'a'];
	}
}

class TriesImpl{
	final TrieNode root;

	public TriesImpl(){
		this.root = new TrieNode();
	}

	public void insert(final String s){
		TrieNode current = root;
		for(int i=0; i<s.length(); i++){
			if(current.list[s.charAt(i)-'a'] == null){
				current.list[s.charAt(i)-'a'] = new TrieNode();
			}
			current = current.next(s.charAt(i));
		}
		current.count++;
		//System.out.println(s+" "+current.count);
	}

	public int search(final String s){
		TrieNode current = root.next(s.charAt(0));
		//System.out.println(current.count);
		if(current==null)
			return 0;
		for(int i=1; i<s.length(); i++){
			current = current.next(s.charAt(i));
			if(current==null)
				return 0;
		}
		//System.out.println("found: "+current.count);
		return current.count;
	}
}

public class Tries{
	public static void main(String[] args) {
		
		TriesImpl t = new TriesImpl();
		t.insert("many");
		t.insert("my");
		t.insert("man");
		t.insert("a");
		t.insert("lie");

		System.out.println(t.search("man"));
	}
}