
 import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.*;
public class CollaboratorController {
   public CollaboratorController() {
    }
    
    
 UserDetails userdetail=new UserDetails();
 String user = userdetail.getUsername();
 String pass = userdetail.getPassword();
 String stat = userdetail.getLogin_stat();
 
 UserAccounts useracc=new UserAccounts();
AddingCollaborator addcoll=new AddingCollaborator();


 public void Collaborator_Controller() throws IOException {

  Scanner input = new Scanner(System.in);



  int choice = 0;
  do {
   System.out.println(" Collaborator menu.... \n");
   System.out.println("1.) Add collaborator : ");
   System.out.println("2.) Exit  ");
   System.out.print("\nEnter Your Menu Choice: ");

   choice = input.nextInt();


  switch (choice) {

   case 1:

    System.out.println("please re-enter information to be checked : \n ");
    String test = useracc.login_verify(user, pass, stat);
    if (test.equalsIgnoreCase("storeowner")) {
     addcoll.Add_collaborator();
    System.out.println("Collaborator is added ! ");
    } else if (test.equalsIgnoreCase("collaborator"))
     System.out.println("This functionality can be used only by StoreOwner . ");
    break;

   
  
   case 2:
    System.out.println("Exiting Program...");
    System.exit(0);
    break;
  }

}

while (choice > 2);

 }



 
}
