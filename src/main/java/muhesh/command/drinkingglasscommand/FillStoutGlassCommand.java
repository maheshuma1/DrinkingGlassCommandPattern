/**
 * @descriptin FillSherryGlassCommand Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class FillStoutGlassCommand implements Command{
    StoutGlass stoutGlass;
    public FillStoutGlassCommand( StoutGlass stoutGlass ){
        this.stoutGlass = stoutGlass;
    }
    public void execute(){
        stoutGlass.pourStout();
        System.out.println("\n");
    }
}