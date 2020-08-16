/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass8;

/**
 *
 * @author DaiPhongPC
 */
public class JavaClass8 {


    public static void main(String[] args) {
    
       ComplexNumbers cn1 = new ComplexNumbers(); 
       ComplexNumbers cn2 = new ComplexNumbers(); 
       cn1.input();
       cn2.input();
       cn1.output();
       cn2.output();
       cn1.add(cn2);
       cn1.div(cn2); 
       cn1.mul(cn2);
       cn1.sub(cn2);
    }
    
}
