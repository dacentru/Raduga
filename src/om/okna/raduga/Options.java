/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.util.Arrays;

/**
 *
 * @author Виктор
 */
public class Options {
    
    static boolean debugMode = true;
    static int maxAccessLevel = 3;
    static String loadURL = "http://192.168.137.1/raduga/";
    static String USER = "raduga";
    static String PASS = "12345678";
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://192.168.137.1/raduga";
    
    static String[] getSettingsArray() {
        String a[] = {
            String.valueOf(debugMode),
            String.valueOf(maxAccessLevel),
            loadURL,
            USER,
            PASS,
            JDBC_DRIVER,
            DB_URL
        };
        Loger.out("Получаем массив настроек: "+Arrays.toString(a));
        return a;
    }
    
    static void setSettingsArray(String[] s){
        debugMode=Boolean.valueOf(s[0]);
        maxAccessLevel=Integer.valueOf(s[1]);
        loadURL=s[2];
        USER=s[3];
        PASS=s[4];
        DB_URL=s[5];
    }
    
    public Options(){
        
    }
}
