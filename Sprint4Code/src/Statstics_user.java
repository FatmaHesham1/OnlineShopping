

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Statstics_user  {

    public Statstics_user() {
    }
    

 DatabaseCounting databasecount=new DatabaseCounting();
      File file = new File("SoldProducts.txt");
      DatabaseMaxMin databaseMaxMin=new DatabaseMaxMin();

    public int User_sum() throws IOException {
   
        
       
        int summation = databasecount.Counting(file);
       return summation;

       
    }

    public int User_avg() throws IOException {

   int summation=User_sum();
   return summation/2;

    }

  
    public void Max() throws IOException {

          databaseMaxMin.Sort(0, file, "MAX");
         
       

    }


    public void Min() throws IOException {

     databaseMaxMin.Sort(0, file, "min");
           
       
    }
}
