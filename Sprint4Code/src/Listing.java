
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Listing {
 
    
    
    
    



    
    
     public List < Products > listAllProducts(File file) {

  BufferedReader bufferedReader;
  List < Products > itemList = new ArrayList < > ();

  try {
   bufferedReader = new BufferedReader(new FileReader("SproductsBackup.txt"));
   String line;
   List < String > lines = new ArrayList < String > ();

   bufferedReader.lines().forEach(s -> {
    lines.add(s);

    if (lines.size() == 3) {
     itemList.add(new Products(lines.get(0), lines.get(1), lines.get(2)));
     lines.clear();
    }

   });

   bufferedReader.close();
  } catch (FileNotFoundException e) {
   e.printStackTrace();

  } catch (IOException e) {
   e.printStackTrace();
  }

  return itemList;
 }
}

    
    
    
    

