
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LoginView {

    public LoginView() {
    }
    
    
    
    public String[] Login(){
    
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password : ");
        String pass = scanner.nextLine();
        System.out.println("Enter your login status : ");
        String ls = scanner.nextLine();

        System.out.println("Checking to see if username exists & matches password");
        
        String Info[]={username,pass,ls};
        return Info;
    
    }
    
    
 public void ConfirmLogin(){
 System.out.println("Welcome");
 }
 
 public void RejectLogin(){
 System.out.println("Unable to login");
 }
}

