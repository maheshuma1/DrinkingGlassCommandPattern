
/**
 * @description FillTulipGlassCommand
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;

public class FillTulipGlassCommand implements Command{
    TulipGlass tulipGlass;
    public FillTulipGlassCommand ( TulipGlass tulipGlass ){
        this.tulipGlass = tulipGlass;
    }
    public void execute(){
        tulipGlass.pourAsti();
        tulipGlass.pourChampagne();
        tulipGlass.pourProsecco();
        tulipGlass.pourSparklingWine();
        System.out.println("\n");
    }
}
