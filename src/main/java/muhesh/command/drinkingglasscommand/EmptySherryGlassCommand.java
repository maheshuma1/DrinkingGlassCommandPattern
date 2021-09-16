/**
 * @descriptin FillSherryGlassCommand Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class EmptySherryGlassCommand implements Command{
    SherryGlass sherryGlass;
    public EmptySherryGlassCommand( SherryGlass sherryGlass ){
        this.sherryGlass = sherryGlass;
    }
    public void execute(){
        sherryGlass.emptySherryGlass();
        System.out.println("\n");
    }
}
