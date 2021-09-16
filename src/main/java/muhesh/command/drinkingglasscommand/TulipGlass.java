/**
 * @description Tulip Glass Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class TulipGlass {
    String name;
    /*
    Constructor
    @param String name
    @return none
    */
    public TulipGlass( String name ) {
        this.name = name;
    }
    /*
    Pour sparkline wines
    @param void
    @return void
    */
    public void pourSparklingWine(){
        System.out.println(name + " pour sparkling wine");
    }
    /*
    Pour Champagne
    @param void
    @return void
    */
    public void pourChampagne(){
        System.out.println(name + " pour Champagne");
    }
    /*
    Pour prosecco
    @param void
    @return void
    */
    public void pourProsecco(){
        System.out.println( name + " pour prosecco");
    }
    /*
    Pour Asti
    @param void
    @return void
    */
    public void pourAsti(){
        System.out.println( name + " pour Asti");
    }
    /*
    Empty the Glass
    @param void
    @return void
    */
    public void emptyTulipGlass(){
        System.out.println( "Emptying " + name);
    }    
}
