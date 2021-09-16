/**
 *
 * @author xyzalpha
 */
package muhesh.command.drinkingglasscommand;


public class BarCounterTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BarCounter barCounter = new BarCounter();
        
        BurGundyGlass burgundyGlass = new BurGundyGlass( " BurGundy Glass ");
        PilsnerGlass pilsnerGlass = new PilsnerGlass("Pilsner Glass");
        SherryGlass sherryGlass = new SherryGlass("Sherry Glass");
        StoutGlass stoutGlass = new StoutGlass("Stout Glass");
        TulipGlass tulipGlass = new TulipGlass("Tulip Glass");
        
        FillBurGundyGlassCommand fillBurGundyGlassCommand = new FillBurGundyGlassCommand(burgundyGlass);
        FillPilsnerGlassCommand fillPilsnerGlassCommand = new FillPilsnerGlassCommand(pilsnerGlass);
        FillSherryGlassCommand fillSherryGlassCommand = new FillSherryGlassCommand(sherryGlass);
        FillStoutGlassCommand fillStoutGlassCommand = new FillStoutGlassCommand(stoutGlass);
        FillTulipGlassCommand fillTulipGlassCommand = new FillTulipGlassCommand(tulipGlass); 
        
        EmptyBurGundyGlassCommand emptyBurGundyGlassCommand = new EmptyBurGundyGlassCommand(burgundyGlass);
        EmptyPilsnerGlassCommand emptyPilsnerGlassCommand = new EmptyPilsnerGlassCommand(pilsnerGlass);
        EmptySherryGlassCommand emptySherryGlassCommand = new EmptySherryGlassCommand(sherryGlass);
        EmptyStoutGlassCommand emptyStoutGlassCommand = new EmptyStoutGlassCommand(stoutGlass);
        EmptyTulipGlassCommand emptyTulipGlassCommand = new EmptyTulipGlassCommand(tulipGlass); 
        
        Command[] fillCommands = {
            fillBurGundyGlassCommand,
            fillPilsnerGlassCommand,
            fillSherryGlassCommand,
            fillStoutGlassCommand,
            fillTulipGlassCommand
        };
        Command[] emptyCommands = {
            emptyBurGundyGlassCommand,
            emptyPilsnerGlassCommand,
            emptySherryGlassCommand,
            emptyStoutGlassCommand,
            emptyTulipGlassCommand
        };
        MacroCommand fillMacro = new MacroCommand(fillCommands);
        MacroCommand emptyMacro = new MacroCommand(emptyCommands);
        
        barCounter.setCommand(0, fillMacro, emptyMacro);
        
        System.out.println(barCounter);
        System.out.println("---------Activating Macro on------- \n");
        barCounter.onPourRequest(0);
        System.out.println("---------Deactivating Macro off-------\n");
        barCounter.onEmptyRequest(0);
    }
}
