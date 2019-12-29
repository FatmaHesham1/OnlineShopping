
import java.util.Scanner;


public class AddingCollaboratorView {

    public AddingCollaboratorView() {
    }
    
    
    
     public String [] scanUserInput() {
  Scanner input = new Scanner(System.in);
  System.out.print("Please Enter your username :  ");
  String Username = input.next();
  System.out.print("Please Enter your Password : ");
  String password = input.next();
  System.out.print("Please Enter your  email : ");
  String email = input.next();
  System.out.println("\n Saving your collaborator account....");

  return new String [] {
   Username,
   password,
   "collaborator"
   };
 }
}
