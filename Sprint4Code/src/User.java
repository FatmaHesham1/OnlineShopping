

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    public String Username;
    public String password;
    public String Login_stat;
    public String Fname;
    public String email;

    Database DB = new Database();

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin_stat() {
        return Login_stat;
    }

    public void setLogin_stat(String Login_stat) {
        this.Login_stat = Login_stat;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Register(String Username, String password, String Login_stat, String Fname, String email) throws IOException {

        File file4 = new File("users.txt");
        FileWriter writeer = new FileWriter(file4, true);

        System.out.println("Enter Fname : ");
        Scanner input4 = new Scanner(System.in);
        String name = input4.next();

        System.out.println("Username : ");
        Scanner input1 = new Scanner(System.in);
        Username = input1.next();

        System.out.println("Password : ");
        Scanner input2 = new Scanner(System.in);
        password = input2.next();

        System.out.println("Login status : ");
        Scanner input3 = new Scanner(System.in);
        Login_stat = input3.next();

        System.out.println("Enter email : ");
        Scanner input8 = new Scanner(System.in);
        email = input8.next();

        String array[] = {Username, password, Login_stat};
        DB.Write_to_file(file4, array);

        System.out.println("your account is created ");

    }

    public String login_verify(String Username, String password, String Login_stat) throws FileNotFoundException, IOException {

        File file4 = new File("users.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password : ");
        String pass = scanner.nextLine();
        System.out.println("Enter your login status : ");
        String ls = scanner.nextLine();

        System.out.println("Checking to see if username exists & matches password");

        String array1[] = {username, pass, ls};
        boolean test = DB.Read(file4, array1, 3);
        if (test == true) {
            System.out.println("Welcome.");

        } else {
            System.out.println("Unable to login");

        }

        return ls;

    }
}
