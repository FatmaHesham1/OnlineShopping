
import java.io.File;
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
public class UndoEdit extends Icommand{
DatabaseBackup database=new DatabaseBackup();
  File Original = new File("Sproducts.txt");
                    File backup = new File("SproductsBackup.txt");
                    EditView editview=new EditView();
    @Override
    public void Execute() {
    try {
        database.copy(Original, backup);
       editview.Before();
    } catch (IOException ex) {
        Logger.getLogger(UndoEdit.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
