
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class ListingSoldProducts {

    public ListingSoldProducts() {
    }


  public List < ProductDetails > listSoldProducts() {

        BufferedReader bufferedReader;
        List < ProductDetails > itemList = new ArrayList < > ();
      
        try {
         bufferedReader = new BufferedReader(new FileReader("SoldProducts.txt"));
         String line;
         List < String > lines = new ArrayList < String > ();
      
         bufferedReader.lines().forEach(s -> {
          lines.add(s);
      
          if (lines.size() == 3) {
           itemList.add(new ProductDetails(lines.get(1), lines.get(0), lines.get(2)));
           lines.clear();
          }
      
         });
      
         bufferedReader.close();
        } catch (FileNotFoundException e) {
        //  e.printStackTrace();
      
        } catch (IOException e) {
        //  e.printStackTrace();
        }
      
        return itemList;
       }
  
  
  





 
}