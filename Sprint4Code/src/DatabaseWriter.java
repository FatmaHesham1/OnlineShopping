
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DatabaseWriter {

    public DatabaseWriter() {
    }
    
     public void Write_to_file(File file2, String[] array) throws IOException {

        FileWriter writeer = new FileWriter(file2, true);

        for (String i : array) {
            writeer.write(i);
            writeer.write("\n");

        }

        writeer.close();

    }
}
