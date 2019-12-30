
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class DatabaseListing {

    public DatabaseListing() {
    }
    
    
     public List < ProductDetails > listAllProducts(File file) {

  BufferedReader bufferedReader;
  List < ProductDetails > itemList = new ArrayList < > ();

  try {
   bufferedReader = new BufferedReader(new FileReader(file));
   String line;
   List < String > lines = new ArrayList < String > ();

   bufferedReader.lines().forEach(s -> {
    lines.add(s);

    if (lines.size() == 3) {
     itemList.add(new ProductDetails(lines.get(0), lines.get(1), lines.get(2)));
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


