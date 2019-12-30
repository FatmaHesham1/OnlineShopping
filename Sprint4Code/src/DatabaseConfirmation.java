
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DatabaseConfirmation {

    public DatabaseConfirmation() {
    }
    
     public boolean Read(File file, String[] array1, int args) throws FileNotFoundException, IOException {

        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new FileReader(file));

        String line2;
        String line1;
        String line3;

        if (array1.length == 1 && args == 1 ) {
            boolean aExists = false;

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line1.equals(array1[0]) ) {

                    aExists = true;

                    break;
                }

            }

            if (aExists) {
                return true;
            } else {
                return false;
            }

        } else if (array1.length == 1 && args == 2) {

            boolean aExists = false;

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line2.equals(array1[0])) {

                    aExists = true;

                    break;
                }

            }

            if (aExists) {
                return true;
            } else {
                return false;
            }
            
            

        } 
        
        
        else if (array1.length==3&&args==1){
        
        
         boolean aExists = false;
        

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line1.equals(array1[0])) {

                    aExists = true;
                    

                    break;
                }

            }

            if (aExists) {
                return true;
            } else {
                return false;
            }}
       
        
        
        else {
            boolean aExists = false;
            boolean bExists = false;
            boolean cexists = false;

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line1.equals(array1[0]) && line2.equals(array1[1]) && line3.equals(array1[2])) {
                    aExists = true;
                    bExists = true;
                    cexists = true;
                    break;
                }
            }
            if (aExists && bExists && cexists) {
                return true;

            } else {
                return false;
            }

        }

    }
}
