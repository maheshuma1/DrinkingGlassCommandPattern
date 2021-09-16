/**
 * @description FillPilsnerGlassCommand
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class EmptyPilsnerGlassCommand implements Command{
    PilsnerGlass pilsnerGlass;
    public EmptyPilsnerGlassCommand( PilsnerGlass pilsnerGlass ) {
        this.pilsnerGlass = pilsnerGlass;
    }
    public void execute(){
        pilsnerGlass.emptyPilsnerGlass();
        System.out.println("\n");
    }
}
