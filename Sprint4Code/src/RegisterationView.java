
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
public class RegisterationView {

    public RegisterationView() {
    }
    
    public String[] register(){
     System.out.println("Enter Fname : ");
        Scanner input4 = new Scanner(System.in);
        String name = input4.next();

        System.out.println("Username : ");
        Scanner input1 = new Scanner(System.in);
     String   Username = input1.next();

        System.out.println("Password : ");
        Scanner input2 = new Scanner(System.in);
        String password = input2.next();

        System.out.println("Login status : ");
        Scanner input3 = new Scanner(System.in);
       String Login_stat = input3.next();

        System.out.println("Enter email : ");
        Scanner input8 = new Scanner(System.in);
       String email = input8.next();
       
       String userInfo[]={Username,password,Login_stat};
       
       return userInfo;
    
    }
    
    public void AccountExists(){
    
    System.out.println("Sorry This account cannot be created !");
    }
    
    public void AccountCreated(){
  System.out.println("Account is created !");
    }
}
