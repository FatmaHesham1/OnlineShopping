
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
    
ListingView listview=new ListingView();
     public void viewproduct() throws FileNotFoundException, IOException {
         File file2 = new File("Sproducts.txt");
        listview.listviewProductDetails(file2);

    }

    public void viewStore() throws FileNotFoundException, IOException {
  File file3 = new File("AddStores.txt");
     listview.listviewProductDetails(file3);
    }
}
