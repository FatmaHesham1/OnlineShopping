/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RemoteCommand {
    Icommand command;

    public RemoteCommand(Icommand command) {
        this.command = command;
    }

    public Icommand getCommand() {
        return command;
    }

    public void setCommand(Icommand command) {
        this.command = command;
    }
    
    public void choose(){
    command.Execute();
    }
}
