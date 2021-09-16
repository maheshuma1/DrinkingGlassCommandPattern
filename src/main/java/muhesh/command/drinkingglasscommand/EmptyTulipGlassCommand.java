
/**
 * @description FillTulipGlassCommand
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;

public class EmptyTulipGlassCommand implements Command{
    TulipGlass tulipGlass;
    public EmptyTulipGlassCommand ( TulipGlass tulipGlass ){
        this.tulipGlass = tulipGlass;
    }
    public void execute(){
        tulipGlass.emptyTulipGlass();
        System.out.println("\n");
    }
}
