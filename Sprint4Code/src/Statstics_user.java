

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Statstics_user implements Statstics {

    Database DB = new Database();

    public int User_sum() throws IOException {
        File file = new File("SoldProducts.txt");

        int summation = DB.Counting(file);

        return summation;
    }

    public int User_avg() throws IOException {

        int AVGsum = User_sum();
        return AVGsum / 2;

    }

    @Override
    public void Max() {

        try {
            File file = new File("SoldProducts.txt");
            System.out.println("Maximum user using site is : " + DB.Sort(0, file, "MAX"));
        } catch (IOException ex) {
            Logger.getLogger(Statstics_user.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void Min() {

        File file = new File("SoldProducts.txt");
        try {
            System.out.println("Minmum user using site is  : " + DB.Sort(0, file, "min"));
        } catch (IOException ex) {
            Logger.getLogger(Statstics_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
