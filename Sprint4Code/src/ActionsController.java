
import java.io.IOException;
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
public class ActionsController {

    DeleteItems delete = new DeleteItems();
    Icommand undoadd=new UndoAdd();
    Icommand undoDelete=new UndoDelete();

    public void Actions() throws IOException {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println(" Other Actions.... \n");
            System.out.println("1.) Deleting product : \n");
            System.out.println("2.) UndoAdd : \n");
            System.out.println("3.) UndoDelete : \n ");
            System.out.println("4.) Exit \n ");

            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    delete.delete();
                    break;

                case 2:

                    undoadd.Execute();
                    break;
                case 3:
                    undoDelete.Execute();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }

        } while (choice > 5);

    }

}
