
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
public class AddingStores {
    
    File file2 = new File("AddStores.txt");
    StoresView storeview=new StoresView();
    DatabaseWriter databasewrite=new DatabaseWriter();
     public void addNewStore(String StoreName, String Location, String Type) throws IOException {

        
        FileWriter writeer = new FileWriter(file2, true);
String StoreInfo[]=storeview.Storeview();

       databasewrite.Write_to_file(file2, StoreInfo);
       

        

    }

    public AddingStores() {
    }

}
