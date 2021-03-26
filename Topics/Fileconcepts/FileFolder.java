
import java.io.File;
import java.io.IOException;
public class FileFolder {
    public static void main(String args[]){
        File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Harish\\KCT");
        try{

        // Whether the file or directory is present or not
            boolean present = file.exists();
            System.out.println("Folder present :"+present);
            if(present == false){
                file.mkdir(); // folder creation
                file.mkdirs(); // subfolder creation
            present = file.exists();
            System.out.println("Folder present: "+ present);
            } 
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
