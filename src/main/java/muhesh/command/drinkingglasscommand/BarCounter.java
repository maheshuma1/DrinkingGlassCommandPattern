/**
 * @description BarCounter Class the Invoker Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class BarCounter{
    Command[] pourCommands;
    Command[] emptyCommands;
    
    public BarCounter() {
        pourCommands = new Command[7];
        emptyCommands = new Command[7];
        
        Command noCommand = new NoCommand();
        for ( int l = 0; l < 7; l++){
            pourCommands[l] = noCommand;
            emptyCommands[l] = noCommand;
        }
    }
    /*
    Sets the command in command list
    @param int slot
    @param Command pourCommand the command to pour drink into glass
    @param Command emptyCommand the command to empty drink out of glass
    */
    public void setCommand(int slot, Command pourCommand, Command emptyCommand){
        pourCommands[slot] = pourCommand;
        emptyCommands[slot] = emptyCommand;
    }
    /*
    Pour Request to place drink in glass
    @param int slot the pour command indicated by the slot to execute
    @return void
    */
    public void onPourRequest(int slot){
        pourCommands[slot].execute();
    }
    /*
    Empty Request to empty drinking glass
    @param int slot the command to execute when emptying the glass
    @return void
    */
    public void onEmptyRequest(int slot){
        emptyCommands[slot].execute();
    }
}
