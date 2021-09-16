
/**
 * @description Sherry Glass Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;

public class SherryGlass {
    String name;
    /*
    Constructor
    @param String name
    @return None
    */
    public SherryGlass( String name ) {
        this.name = name;
    }
    /*
    Pour sherry
    @param void
    @return void
    */
    public void pourSherry(){
        System.out.println(name + " pour sherry");
    }
    /*
    Pour Cordials
    @param void
    @return void
    */
    public void pourCordials(){
        System.out.println(name + " pour cordials");
    }
    /*
    Empty the Glass
    @param void
    @return void
    */
    public void emptySherryGlass(){
        System.out.println( "Emptying " + name);
    }    
}
