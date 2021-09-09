/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vande
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        
        lista.add(29);
        lista.add(30);
        lista.add(35);
        lista.add(58);
        lista.add(45);
        lista.add(23);
        System.out.println("ola");
        lista.forEach(i -> {
            System.out.println(i);
        });
        
        
    }
}
