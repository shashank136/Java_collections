import java.io.*;

// BufferedWriter never communicate with the file directly, compulsary it shoould communicate via some writer object.
// the main advantage of bufferedreader over filereader is that, we can read data line by line

public class BufferedStreamCopyTest
{
    public static void main(String[] args)
    {
        try(BufferedReader bi = new BufferedReader(new FileReader(args[0]));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(args[1])))
        {
            String line = "";
            while((line = bi.readLine()) != null)
            {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + e);
        }
        catch(IOException e)
        {
            System.out.println("IOException: " + e);
        }
    }
}