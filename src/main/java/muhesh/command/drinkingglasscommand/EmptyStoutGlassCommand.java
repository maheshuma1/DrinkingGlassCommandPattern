/**
 * @descriptin FillSherryGlassCommand Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class EmptyStoutGlassCommand implements Command{
    StoutGlass stoutGlass;
    public EmptyStoutGlassCommand( StoutGlass stoutGlass ){
        this.stoutGlass = stoutGlass;
    }
    public void execute(){
        stoutGlass.emptyStoutGlass();
        System.out.println("\n");
    }
}