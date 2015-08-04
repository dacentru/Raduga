/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

/**
 *
 * @author Виктор
 */
public class Options {
    
    public static boolean debugMode;
    public static int maxAccessLevel = 3;

    static String[] getAll() {
        String a[] = {
            String.valueOf(debugMode),
            String.valueOf(maxAccessLevel)
        };
        return a;
    }
    
    public Options(){
        
    }
}
