/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Collaborators {

    Database DB = new Database();

    public void Add_collaborator() throws IOException {

        System.out.println("\n Collaborator Name & Store : ");
        Scanner input6 = new Scanner(System.in);
        String Ncollaborator = input6.next();

        System.out.println("\n password : ");
        Scanner input7 = new Scanner(System.in);
        String Scollaborator = input7.next();

        System.out.println("\n Login_stat : ");
        Scanner input8 = new Scanner(System.in);
        String Lcollaborator = input8.next();

        File file2 = new File("users.txt");

        String array[] = {Ncollaborator, Scollaborator, Lcollaborator};

        DB.Write_to_file(file2, array);

        System.out.println("Collaborator is added ! ");

    }

}
