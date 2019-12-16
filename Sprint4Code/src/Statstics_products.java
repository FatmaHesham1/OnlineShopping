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
public class Statstics_products implements Statstics {

    Database DB = new Database();

    @Override
    public void Max() {
        try {
            File file = new File("SoldProducts.txt");

            System.out.println("Maximum product sold is : " + DB.Sort(2, file, "MAX"));
        } catch (IOException ex) {
            Logger.getLogger(Statstics_products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Min() {

        try {
            File file = new File("SoldProducts.txt");
            System.out.println("Minmum product sold is : " + DB.Sort(2, file, "min"));
        } catch (IOException ex) {
            Logger.getLogger(Statstics_products.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
