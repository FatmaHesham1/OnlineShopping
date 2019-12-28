

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserAccounts {

    public UserAccounts() {
    }
    

   
    File file4 = new File("users.txt");
RegisterationView registerview=new RegisterationView();
DatabaseWriter databasewrite= new DatabaseWriter();
 DatabaseConfirmation databaseconfirm=new DatabaseConfirmation();
 LoginView loginview=new LoginView();

  

    public void Register(String Username, String password, String Login_stat, String Fname, String email) throws IOException {

      
        FileWriter writeer = new FileWriter(file4, true);
        
        String array[]=registerview.register();
       
        boolean check=databaseconfirm.Read(file4, array, 1);
       if(check==false){
     
        
        databasewrite.Write_to_file(file4, array);
       registerview.AccountCreated();
       }
       else if(check==true ){
       registerview.AccountExists();
       }

       

    }

    public String login_verify(String Username, String password, String Login_stat) throws FileNotFoundException, IOException {

        File file4 = new File("users.txt");
String array1[]=loginview.Login();

       
        boolean test = databaseconfirm.Read(file4, array1, 3);
        if (test == true) {
            loginview.ConfirmLogin();

        } else {
            loginview.RejectLogin();

        }

        return array1[2];

    }
}
