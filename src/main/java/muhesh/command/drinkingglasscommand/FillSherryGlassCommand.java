/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhesh.command.drinkingglasscommand;

/**
 * @descriptin FillSherryGlassCommand Class
 * @author muhesh
 */
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
