/**
 * @description EmptyBurGundyGlassCommand Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class EmptyBurGundyGlassCommand implements Command{
    BurGundyGlass burgundyGlass;
    
    public EmptyBurGundyGlassCommand ( BurGundyGlass burgundyGlass ) {
        this.burgundyGlass = burgundyGlass;
    }
    
    public void execute(){
        burgundyGlass.emptyBurGundyGlass();
        System.out.println("\n");
    }
}
