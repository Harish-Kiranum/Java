
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Buffer {
    public static void main(String ags[]){
        File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Harish\\Status.txt");
        try
        {
            FileWriter fwriter = new FileWriter(file);
            BufferedWriter bwriter = new BufferedWriter(fwriter);
            bwriter .write("Data structures");
            bwriter.flush();
            bwriter.close();
            bwriter.newLine();// It goes nextLine
            bwriter.write("Data Analytics");
            bwriter.flush();
            bwriter.close();
            FileReader freader = new FileReader(file);
            BufferedReader read= new BufferedReader(freader);
            String output= read.readLine();// It reads line by line
            int count =0;
            while(output!=null)
           {
               count++;
               System.out.println(output);
               output = read.readLine();

            
            }
            System.out.println("Count the values:"+" "+count);

        }catch(IOException e){

            e.printStackTrace();
        }
    }
    
}
