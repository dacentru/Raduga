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
public class dbArray {
    public dbArray(String action, String[] data){
        String w = "write";
        String r = "reed";
        String[] result;
        if(action == w){
            dbWrite(data);
        } else if(action == r){
            dbReed(data);
        } else {
            System.out.println("Ошибка!!!");
        }
    }

    private String dbWrite(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String dbReed(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
