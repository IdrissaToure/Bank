/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Date;

/**
 *
 * @author Modibo
 */
public class TestPersonnel {
    public static void main(String[] args) {
       // int n = 5;
        //Personne p1 = new Personne("Issa","Daou",34);
        //Personne p2 = new Personne("Ali", "Guindo", 65);
        //Personne p3 = new Personne("Moussa", "Kanté", 65);
        
//        p1.setPrenom("Youssouf");
//        System.out.println(p1.getPrenom());
          //p1.setPrenom("Samba");         
        //System.out.println(p1.sePresenter());
        //System.out.println(p2.sePresenter());
        //System.out.println(p3.sePresenter());
        Personnel [] tab ={
            new Personnel("Issa","Daou",34),
            new Personnel("Ali","Guindo",65),
            new Personnel("Moussa","Kante",30)
        };
        for(Personnel p:tab){
            System.out.println(p.sePresenter());
        }
        
    }
}
