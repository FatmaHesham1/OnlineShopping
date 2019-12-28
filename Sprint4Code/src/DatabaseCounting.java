
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DatabaseCounting {

    public DatabaseCounting() {
    }
    
     public int Counting(File file) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line1;
        String line2;
        String line3;

        int count = 0;
        while ((line1 = br.readLine()) != null & (line2 = br.readLine()) != null & (line3 = br.readLine()) != null) {
            count++;
        }

        return count;
    }
}
