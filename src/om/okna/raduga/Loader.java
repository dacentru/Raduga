/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.io.File;
import static java.io.File.separator;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Виктор
 */
public class Loader {
    
    void readFile(){
        
    }
    
    public static void writeFile(String fileName, String text){
        //Определяем файл
        File file = new File(getRootFolder()+separator+fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
            //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    static String getLoadURL(){
        String url = "http://192.168.137.1/raduga/";
        return url;
    }
    
    static File getRootFolder(){
        File folder = new File(System.getenv("APPDATA")+separator+".raduga");
        if(!folder.isDirectory()) folder.mkdir();
        return folder;
    }
    
    public static void main(String[] arg){
        System.out.println(getRootFolder());
        System.out.println(getLoadURL());
        writeFile("test.txt","1321312311231321313212");
    }
}
