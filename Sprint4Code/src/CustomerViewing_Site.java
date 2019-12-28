
import java.io.File;
import java.io.FileNotFoundException;
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
public class CustomerViewing_Site {

    public CustomerViewing_Site() {
    }
    
    
    DatabaseReading databasereader=new DatabaseReading();
     public void viewproduct() throws FileNotFoundException, IOException {
         File file2 = new File("Aproducts.txt");
        databasereader.view(file2);

    }

    public void viewStore() throws FileNotFoundException, IOException {
  File file3 = new File("Sproducts.txt");
      databasereader.view(file3);
    }
}
