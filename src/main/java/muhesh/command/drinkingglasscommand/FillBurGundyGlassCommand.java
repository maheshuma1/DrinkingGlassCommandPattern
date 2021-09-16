/**
 * @description FillBurGundyGlassCommand Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class FillBurGundyGlassCommand implements Command{
    BurGundyGlass burgundyGlass;
    
    public FillBurGundyGlassCommand ( BurGundyGlass burgundyGlass ){
        this.burgundyGlass = burgundyGlass;
    }
    public void execute(){
        burgundyGlass.pourBurgundies();
        burgundyGlass.pourDelicateWine();
        burgundyGlass.pourPinotNoirs();
        System.out.println("\n");
    }
}
