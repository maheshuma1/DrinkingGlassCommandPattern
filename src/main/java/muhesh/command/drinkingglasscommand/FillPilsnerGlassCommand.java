/**
 * @description FillPilsnerGlassCommand
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class FillPilsnerGlassCommand implements Command{
    PilsnerGlass pilsnerGlass;
    public FillPilsnerGlassCommand( PilsnerGlass pilsnerGlass ) {
        this.pilsnerGlass = pilsnerGlass;
    }
    public void execute(){
        pilsnerGlass.pourKolsches();
        pilsnerGlass.pourLagers();
        pilsnerGlass.pourPilsner();
        System.out.println("\n");
    }
}
