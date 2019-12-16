

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    public String Current_Directory(File file2) {

        return file2.getPath().toString();
    }

    public void Write_to_file(File file2, String[] array) throws IOException {

        FileWriter writeer = new FileWriter(file2, true);

        for (String i : array) {
            writeer.write(i);
            writeer.write("\n");

        }

        writeer.close();

    }

    public void view(File file) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }

    public int Counting(File file) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line1;
        String line2;
        String line3;

        int count = 0;
        while ((line1 = br.readLine()) != null & (line2 = br.readLine()) != null & (line3 = br.readLine()) != null) {
            count++;
        }

        return count;
    }

    public String Sort(int count, File file, String m) throws IOException {

        int minnum = 100;
        String name = null;
        int maxmum = 0;

        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String, Integer> x = new HashMap<String, Integer>();

        String line;
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                if (x.get(line) != null) {
                    x.put(line, x.get(line) + 1);
                } else {
                    x.put(line, 1);
                }

            }
            count++;
            if (count == 3) {
                count = 0;
            }

        }

        if (m.equals("MAX")) {

            for (Map.Entry<String, Integer> entry : x.entrySet()) {
                if (entry.getValue() > maxmum) {
                    maxmum = entry.getValue();
                    name = entry.getKey();
                }

            }
        } else {
            for (Map.Entry<String, Integer> entry : x.entrySet()) {
                if (entry.getValue() < minnum) {
                    minnum = entry.getValue();
                    name = entry.getKey();

                }

            }
        }
        return name;

    }

    public boolean Read(File file, String[] array1, int args) throws FileNotFoundException, IOException {

        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new FileReader(file));

        String line2;
        String line1;
        String line3;

        if (array1.length == 1 && args == 1) {
            boolean aExists = false;

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line1.equals(array1[0])) {

                    aExists = true;

                    break;
                }

            }

            if (aExists) {
                return true;
            } else {
                return false;
            }

        } else if (array1.length == 1 && args == 2) {

            boolean aExists = false;

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line2.equals(array1[0])) {

                    aExists = true;

                    break;
                }

            }

            if (aExists) {
                return true;
            } else {
                return false;
            }

        } else {
            boolean aExists = false;
            boolean bExists = false;
            boolean cexists = false;

            while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null) {

                if (line1.equals(array1[0]) && line2.equals(array1[1]) && line3.equals(array1[2])) {
                    aExists = true;
                    bExists = true;
                    cexists = true;
                    break;
                }
            }
            if (aExists && bExists && cexists) {
                return true;

            } else {
                return false;
            }

        }

    }
}
