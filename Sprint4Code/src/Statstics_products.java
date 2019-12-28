/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Statstics_products  {

    public Statstics_products() {
    }
    

 DatabaseMaxMin databasesort=new  DatabaseMaxMin();
 Stat_product_viewer statviewer=new  Stat_product_viewer();


    public void MaxProduct() throws IOException {
     
            File file = new File("SoldProducts.txt");
            statviewer.MaxProductView();
            databasesort.Sort(2, file, "MAX");
            
       
    }

   
    public void MinProduct() throws IOException {

       
            File file = new File("SoldProducts.txt");
            statviewer.MinProductView();
            databasesort.Sort(2, file, "min");
            
       
    }
}
