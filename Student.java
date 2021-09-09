import java.io.*;
import java.util.ArrayList;
public class Student {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("C:\\Java11Assignments_StudentList.txt"); 
        BufferedReader br = new BufferedReader(fr);
       String line;
       int Wordcount=0;
       ArrayList<String> ar= new ArrayList<>();
       while((line=br.readLine()) != null)
       {
           String[] words = line.split(" ");
           Wordcount +=words.length;
          
       }
       System.out.print("\n Total word count = "+ ++Wordcount);
    }

}
