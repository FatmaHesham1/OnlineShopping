
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UndoDelete extends Icommand {

 AddingStowner_Items additem=new AddingStowner_Items();
 ProductDetails productdetails;
 String ProductName=null;
 String Category=null;
 String price=null;

 @Override
    public void Execute() {

     try {
         additem.addItems(ProductName, Category,price );
     } catch (IOException ex) {
         Logger.getLogger(UndoDelete.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
}
