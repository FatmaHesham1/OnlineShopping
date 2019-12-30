
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EditView {
   	
    ArrayList<String> edit = new ArrayList<String>();
    DatabaseListing databaselist=new DatabaseListing();
    ListingView listview=new ListingView();
    
           File file=new File("Sproducts.txt");
    
	public ArrayList<String> Edit() throws IOException {
          

   listview.listviewProductDetails(file);
                 
                
		System.out.println("\n Choose a product to be edited : ");
		Scanner x1 = new Scanner(System.in);
		String edited = x1.next();
		System.out.println(" What is the new product name ? ");
		Scanner x2 = new Scanner(System.in);
		String edited2 = x2.next();
                System.out.println("what is the new product category ");
		Scanner x3 = new Scanner(System.in);
		String edited3 = x3.next();
                 System.out.println("what is the new product price ? ");
		Scanner x4 = new Scanner(System.in);
		String edited4 = x4.next();
		edit.add(0, edited);
		edit.add(1,edited2);
                edit.add(2, edited3);
		edit.add(3,edited4);
                
		return edit;
                
	} 
        
        public void Finish(){
        System.out.println("Product Is Updated Successfuly..Thanks");
        }
        
        public void Before(){
              File file1=new File("SproductsBackup.txt");
       listview.listviewProducts(file1);
 
                 
        
        }
        public  void After(){
        
           listview.listviewProductDetails(file);
 
                 }
        }

