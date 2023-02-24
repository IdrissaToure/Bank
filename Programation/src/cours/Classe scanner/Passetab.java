/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.util.ArrayList;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Passetab {
    public static void main(String[] args) {
        ArrayList<Utilisateur> listuser= new ArrayList<>();
        listuser.add(new Utilisateur("TOURE","Idrissa",24,"test0","test1"));
        listuser.add(new Utilisateur("SOGODOGO","Adama",25,"test2","test3"));
        listuser.get(0).changepasse("010203");
        listuser.get(0).changepasse("001122");
//        //Modifie l'ensenmble des elemment de la list
//        listuser.forEach((t) -> {
//            t.changepasse("001122");
//        });
//        System.out.println(listuser.get(0).password);
//        
//        listuser.forEach((t) -> {
//            t.changepasse("010203");
//        });
//        System.out.println(listuser.get(1).password);
        //parcourir l'ensemble des element de la list 
        //for (int i = 0; i < listuser.size(); i++) {
           // System.out.println(listuser.get(i));
        //}
        //
        //for (Utilisateur user : listuser) {
          //  System.out.println(user.nom);
        //}
    }
    
}
