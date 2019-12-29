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


    public String MaxProduct() throws IOException {
     
            File file = new File("SoldProducts.txt");
            statviewer.MaxProductView();
          String value=  databasesort.Sort(0, file, "MAX");
          return value;
            
       
    }

   
    public String MinProduct() throws IOException {

       
            File file = new File("SoldProducts.txt");
            statviewer.MinProductView();
           String value= databasesort.Sort(0, file, "min");
           
           return value;
            
       
    }
}
