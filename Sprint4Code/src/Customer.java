

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer extends User {

    Database DB = new Database();
    ProductDetails PD = new ProductDetails();

    public void viewproduct(File file2) throws FileNotFoundException, IOException {
        DB.view(file2);

    }

    public void viewStore(File file3) throws FileNotFoundException, IOException {

        DB.view(file3);
    }

   
}
