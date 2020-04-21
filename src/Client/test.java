/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author Lenovo
 */
public class test {
    
    
    public static void main(String args[]){
        String txt1="80";
        String txt2="B";
        String txt3="C";
        StringBuilder buildP = new StringBuilder(txt1 + "." + txt2 + "." + txt3);
        System.out.println(Integer.parseInt(buildP.substring(0, buildP.indexOf("."))));
        System.out.println(buildP.substring(buildP.indexOf("."), buildP.lastIndexOf(".")));
        System.out.println(buildP.substring(buildP.lastIndexOf("."),buildP.length()));
    }
    
}
