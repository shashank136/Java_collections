import java.io.PrintWriter;

// PrintWriter character stream instead if byte

public class PrintWriterExample{
	public static void main(String args[]){
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is some output.");
	}
}