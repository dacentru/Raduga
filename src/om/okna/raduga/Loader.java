/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.okna.raduga;

import java.io.BufferedReader;
import java.io.File;
import static java.io.File.separator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static om.okna.raduga.Options.loadURL;

/**
 *
 * @author Виктор
 */
public class Loader {
    
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(getRootFolder()+separator+fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
    
    public static String readFile(String fileName)throws FileNotFoundException{
        //Этот спец. объект для построения строки
    StringBuilder sb = new StringBuilder();
    
    File file = new File(getRootFolder()+separator+fileName);
    
    exists(fileName);
 
    try {
        //Объект для чтения файла в буфер
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        try {
            //В цикле построчно считываем файл
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } finally {
            //Также не забываем закрыть файл
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
 
    //Возвращаем полученный текст с файла
    return sb.toString();
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
        return null;//loadURL;
    }
    
    static File getRootFolder(){
        File folder = new File(System.getenv("APPDATA")+separator+".raduga");
        if(!folder.isDirectory()) folder.mkdir();
        return folder;
    }
    
//    public static void main(String[] arg){
//        System.out.println(getRootFolder());
//        System.out.println(getLoadURL());
//        writeFile("test.txt","1321312311231321313212");
//    }
}
