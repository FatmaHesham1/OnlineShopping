
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DatabaseEdit {
    
    
    	
	ArrayList<Products> products = new ArrayList<Products>();
        EditView edit=new EditView();
         DatabaseWriter databasewrite=new DatabaseWriter();
	

	public void UpdatedProduct(File Original,File backup) throws IOException {
            	

		
                
               
		FileReader r = new FileReader(Original);
		Scanner read = new Scanner(Original);
		String Line1 = null;
		String Line2=null;
                String Line3 = null;
		ArrayList<String> to_BeEdited = new ArrayList<String>();
		to_BeEdited = edit.Edit();
		String OriginalName = to_BeEdited.get(0);
                
		String EditName = to_BeEdited.get(1);
                String EditPrice = to_BeEdited.get(2);
                String EditCategory = to_BeEdited.get(3);
                
                
                

		while (read.hasNext()) {
			Line1 = read.nextLine();
		Line2 = read.nextLine();
			Line3= read.nextLine();
			
			Products x = new Products(Line1, Line2, Line3);
			products.add(x);
                      
                        PrintWriter writer = new PrintWriter(Original);
			writer.print("");
			writer.close();
			
                        }
                        
			
                        for (int j = 0; j < products.size(); j++) 
                        {
			Line1 = products.get(j).getName();
			Line2 = products.get(j).getCategory();
			Line3 = products.get(j).getPrice();
			String str[] = { Line1, Line2, Line3};
                        databasewrite.Write_to_file(backup, str);
		}
               
		     for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(OriginalName)) {
                             
				products.get(i).setName(EditName);
                                   products.get(i).setCategory(EditCategory);
                                products.get(i).setPrice(EditPrice);
                             
			}
		}
                     
		//File file1 = new File("Sproducts.txt");
		for (int j = 0; j < products.size(); j++) {
			Line1 = products.get(j).getName();
			Line2 = products.get(j).getCategory();
			Line3 = products.get(j).getPrice();
			String str[] = { Line1, Line2, Line3};
                        databasewrite.Write_to_file(Original, str);
		
			
	
		}
		

	}
}
