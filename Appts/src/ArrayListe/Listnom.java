/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListe;

import java.util.ArrayList;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Listnom {
    public static void main(String[] args) {
        String nom ="3";
        int x = Integer.valueOf(nom);              
        ArrayList <String> listNom = new ArrayList<>();
        listNom.add("Kante");
        listNom.add("Cisse");
        listNom.add("Koita");
        listNom.add("Konte");
        for (int i = 0; i < listNom.size(); i++) {
        System.out.println(listNom.get(i));    
        }
        
    }
  
    
}
