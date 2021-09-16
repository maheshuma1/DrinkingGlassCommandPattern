/**
 * BurGundyGlass Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class BurGundyGlass {
    String name;
    /*
    Constructor
    */
    public BurGundyGlass( String name ) {
        this.name = name;
    }
    /*
    Pour Burgundies
    @param void
    @return void
    */
    public void pourBurgundies(){
        System.out.println(name + " pour burgundies");
    }
    /*
    Pour pinot noirs
    @param void
    @return void
    */
    public void pourPinotNoirs(){
        System.out.println(name + " pour pinot noirs");
    }
    /*
    Pour delicate wines
    @param void
    @return void
    */
    public void pourDelicateWine(){
        System.out.println(name + " pour delicate wine");
    }
    /*
    Empty the Glass
    @param void
    @return void
    */
    public void emptyBurGundyGlass(){
        System.out.println( "Emptying " + name);
    }
    
}
