/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author User
 */
public class Collaborators {

  
 /**
  * 
  */
 public static final String USER_BASE_PATH = "users.txt";


 
 /**
  * 
  */
 public void Add_collaborator() throws IOException {


  File usersFile = new File(this.USER_BASE_PATH);
  FileWriter writer = new FileWriter(usersFile, true);
  String[] record = this.scanUserInput();

  for (String i: record) {
   writer.write(i);
   writer.write("\n");
  }

  writer.close();

  System.out.println("Collaborator is added ! ");

 }


 /**
  * 
  */
 public String [] scanUserInput() {
  Scanner input = new Scanner(System.in);
  System.out.print("Please Enter your username :  ");
  String Username = input.next();
  System.out.print("Please Enter your Password : ");
  String password = input.next();
  System.out.print("Please Enter your  email : ");
  String email = input.next();
  System.out.println("\n Saving your new accounts....");

  return new String [] {
   Username,
   password,
   "collaborator"
   };
 }

}