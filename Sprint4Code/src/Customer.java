

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer extends UserAccounts {

    public Customer() {
    }
    
    

   
     CustomerViewing_Site customershow=new  CustomerViewing_Site();
       DatabaseConfirmation databaseconfirm = new DatabaseConfirmation();
   DatabaseWriter databasewrite=new DatabaseWriter();
    BuyingViewer customerview=new BuyingViewer();
     
     
   

   

    public void BuyProduct() throws IOException {
        
         File file5 = new File("SoldProducts.txt");
           File file1 = new File("Sproducts.txt");
       customershow.viewproduct();
     

    String TargetProduct=  customerview.ChooseProduct();
    customerview.CheckingProduct();
    
        String array1[] = {TargetProduct};
        boolean check=databaseconfirm.Read(file1, array1, 1);
      

        if (check == true) {
          String arrayInfo[]=customerview.EnterInfo();
            String array[]= {arrayInfo[2], TargetProduct,arrayInfo[1]};
            databasewrite.Write_to_file(file5, array);
            customerview.ConfirmBuying();
           
            
            
        } else {
            customerview.ProductNotExists();
            
        }
    
    
    
    }
    
       
        
       
}
