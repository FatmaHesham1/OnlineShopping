/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
 import java.io.*;
public class DatabaseBackup {
    
    
   

    public void copy (File Original,File backup) throws FileNotFoundException, IOException
    {
        PrintWriter writer = new PrintWriter(Original);
			writer.print("");
			writer.close();
       
            FileReader fr=new FileReader(backup);
            FileWriter fw=new FileWriter(Original);
            int c=fr.read();
            while(c!=-1)
            {
                fw.write(c);
                c = fr.read(); // Add this line
            }
        
       
         
            fr.close();
            fw.close();
        

    }
}

