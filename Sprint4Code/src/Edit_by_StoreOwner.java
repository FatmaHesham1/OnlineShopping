import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
public class Edit_by_StoreOwner {

	

    DatabaseEdit data=new DatabaseEdit();
    EditView editview=new EditView();
    public void EditStore() throws IOException{
        
        File Original = new File("Sproducts.txt");
        File backup = new File("SproductsBackup.txt");
         data.UpdatedProduct(Original, backup);
         
        editview.Finish();
        editview.After();
        
    }}