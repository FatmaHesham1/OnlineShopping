
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AddingCollaborator {

    public AddingCollaborator() {
    }
    
     
 AddingCollaboratorView viewer=new AddingCollaboratorView();
  public static final String USER_BASE_PATH = "users.txt";
  DatabaseWriter databasewriter=new DatabaseWriter();
 
 public void Add_collaborator() throws IOException {


  File usersFile = new File(this.USER_BASE_PATH);
  FileWriter writer = new FileWriter(usersFile, true);
  String[] record = viewer.scanUserInput();
databasewriter.Write_to_file(usersFile, record);


 

 }
    
}

