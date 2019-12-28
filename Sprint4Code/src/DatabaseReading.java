
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;





public class DatabaseReading {

    public DatabaseReading() {
    }



   

    public void view(File file) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }

   

   
   }
    
    
    
   
