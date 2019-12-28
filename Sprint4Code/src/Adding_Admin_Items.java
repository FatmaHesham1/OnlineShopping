

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Adding_Admin_Items  {

    public Adding_Admin_Items() {
    }
    

  
    DatabaseWriter databasewriter= new DatabaseWriter();
    AdminView adminviewer=new AdminView();


    public void AdminAddItems(String ProductName, String Category, String Price) throws IOException {
       

            File file2 = new File("Aproducts.txt");

            FileWriter writeer = new FileWriter("Aproducts.txt", true);

          String arrayOfItems []=adminviewer.ViewAddItems();

     databasewriter.Write_to_file(file2, arrayOfItems);
        

       

    }

  

    

    
}
