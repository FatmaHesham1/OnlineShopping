
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
public class UndoAdd extends Icommand{

 DeleteItems delete=new DeleteItems();
    public void Execute() {
     try {
         delete.delete();
     } catch (IOException ex) {
         Logger.getLogger(UndoAdd.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
}
