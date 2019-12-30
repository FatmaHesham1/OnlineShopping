
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CommittingChange {

    public CommittingChange() {
    }
    
    
     public void commitChange(List < ProductDetails > itemList  ) throws IOException
 {

        if (itemList!=null){
                File usersFile = new File("Sproducts.txt");
                FileWriter writer = new FileWriter(usersFile);
                for (ProductDetails record: itemList) {
                        writer.write(record.getProductName()+"\n" +
                        
                        record.getCategory() + "\n" 
                        
                        + record.getPrice() + "\n");
                       }
                    
                       writer.close();
          }
 }
    
}

