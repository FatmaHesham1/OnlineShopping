
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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
public class Adding_Brands {

    public Adding_Brands() {
    }
    
    
    DatabaseWriter databasewriter=new DatabaseWriter();
    BrandView brandviewer=new BrandView();
    
    public void addNewBrand(String BrandName, String BrandCategory) throws IOException {

       

            File file3 = new File("AddBrands.txt");

            FileWriter writeer = new FileWriter("AddBrands.txt", true);

      String arrayOfBrands[]=brandviewer.AddBrandView();

          

           databasewriter.Write_to_file(file3, arrayOfBrands);

           

    }
}
