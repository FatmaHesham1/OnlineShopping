
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class AddingOffers {

    public AddingOffers() {
    }
    
   AdminOffersView offersviewer=new AdminOffersView();
      File file3 = new File("Aproducts.txt");
    File file4 = new File("Offers.txt");
 ListingView listview=new ListingView();
    DatabaseConfirmation databaseconfirmation=new DatabaseConfirmation();
    DatabaseWriter databasewriter=new DatabaseWriter();
    
    
    public void choose_offered_product() throws IOException {
       listview.listviewProductDetails(file3);
       
       String pname= offersviewer.chooseProduct();
        String productName[]={pname};
        boolean check=databaseconfirmation.Read(file3, productName, 1);
       
         
         if (check == true) {
           String numOfOffers[]=offersviewer.offers();
       

            String array[] = {pname, numOfOffers[0], numOfOffers[1]};
            databasewriter.Write_to_file(file4, array);
           
           offersviewer.FinishAdding();
        } else {
           offersviewer.UnfinishAdding();
        }

     
    }
        
        


 
      
      

        
    }


