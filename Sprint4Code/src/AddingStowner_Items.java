
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
public class AddingStowner_Items {

    public AddingStowner_Items() {
    }
    
    StoreOwnerView storeview=new StoreOwnerView();
    AdminVerification adminverify=new  AdminVerification();
    File file1 = new File("Sproducts.txt");
    DatabaseWriter databasewrite=new DatabaseWriter();
    
     public void addItems(String ProductName, String Category, String price) throws IOException {

       String Stores[]=storeview.Addview();
       
            

            if (adminverify.verify(Stores[1]) == true) {

                
                FileWriter writeer = new FileWriter("Sproducts.txt", true);
               
                databasewrite.Write_to_file(file1, Stores);

              storeview.verifyAdding();

            } else {
                storeview.RejectAdding();
            }
     

    }
}
