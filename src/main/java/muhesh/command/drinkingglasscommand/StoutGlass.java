/**
 * @description StoutGlass Class
 * @author xyzalpha
 */
package muhesh.command.drinkingglasscommand;


public class StoutGlass {
    String name;
    /*
    Constructor
    @param String name 
    @return None
    */
    public StoutGlass( String name ) {
        this.name = name;
    }
    /*
    Pour Stout
    @param void
    @return void
    */
    public void pourStout(){
        System.out.println(name + " pour stout");
    }
    
    /*
    Empty the Glass
    @param void
    @return void
    */
    public void emptyStoutGlass(){
        System.out.println( "Emptying " + name);
    }
}
