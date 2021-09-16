/**
 * @description Pilsner Glass Class
 * @author muhesh
 */
package muhesh.command.drinkingglasscommand;


public class PilsnerGlass {
    String name;
    /*
    Constructor
    @param String name
    @return None
    */
    public PilsnerGlass( String name ){
        this.name = name;
    }
    /*
    pour pilsner
    @param void
    @return void
    */
    public void pourPilsner(){
        System.out.println(name + " pour pilsner");
    }
    /*
    Pour kolshes
    @param void
    @return void
    */
    public void pourKolsches(){
        System.out.println(name + " pour kolsches");
    }
    /*
    Pour pale lagers
    @param void
    @return void
    */
    public void pourLagers(){
        System.out.println( name + " pour Lagers");
    }
    /*
    Empty the Glass
    @param void
    @return void
    */
    public void emptyPilsnerGlass(){
        System.out.println( "Emptying " + name);
    }    
}
