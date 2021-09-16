/**
 * @descriptin FillSherryGlassCommand Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class FillSherryGlassCommand implements Command{
    SherryGlass sherryGlass;
    public FillSherryGlassCommand( SherryGlass sherryGlass ){
        this.sherryGlass = sherryGlass;
    }
    public void execute(){
        sherryGlass.pourCordials();
        sherryGlass.pourSherry();
        System.out.println("\n");
    }
}
