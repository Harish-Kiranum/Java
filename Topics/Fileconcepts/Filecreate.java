
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;


public class Filecreate {
    public static void main(String args[]){
        File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Harish\\status.txt");
        try{

            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(97); // print the AScII value
            writer.write("Hi, This is Harish");
            writer.flush();
            writer.close();

            FileReader reader = new FileReader(file);
            int output = reader.read();
            while(output!=-1){
                System.out.println(output); // prints the integer value
                System.out.print((char) output);// prints the string
                output = reader.read();
            }
            char[] ch = new char[(int)file.length()];
            System.out.println(ch.length);


    }catch(IOException e){
        e.printStackTrace();
    }
}

    
}
