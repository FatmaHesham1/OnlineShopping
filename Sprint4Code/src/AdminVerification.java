
import java.io.File;
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
public class AdminVerification {

    public AdminVerification() {
    }
    
    DatabaseConfirmation databaseconfirm=new DatabaseConfirmation();
    
      public boolean verify(String Category) throws IOException {

   
        File file3 = new File("Aproducts.txt");
        String array1[] = {Category};
        boolean test=databaseconfirm.Read(file3, array1, 2);
      
        if (test == true) {
            return true;
        } else {
            return false;
        }

    }
    
}
