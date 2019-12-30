
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ActionsController {

    AddingCollaborator addcoll = new AddingCollaborator();
    Icommand undoadd = new UndoAdd();
    Icommand undoDelete = new UndoDelete();
    Icommand undoedit = new UndoEdit();

    public void Actions() throws IOException {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println(" Other Actions.... \n");
            System.out.println("1.) Adding Collaborator :");
            System.out.println("2.) UndoAdd :");
            System.out.println("3.) UndoDelete : ");
            System.out.println("4.) Undo the last Edit : ");

            System.out.println("5.) Exit \n ");

            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addcoll.Add_collaborator();

                    break;

                case 2:

                    undoadd.Execute();
                    break;
                case 3:
                    undoDelete.Execute();
                    break;

                case 4:

                    undoedit.Execute();
                    System.out.println("Undo the last edit and here is the file ....");

                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }

        } 
while(choice>5);
    }

}
