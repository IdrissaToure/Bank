/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messager.code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Contact {
    String nom;
    String prenom;
    String tel; 
    public static ArrayList<Contact> listcontact = new ArrayList<>();

    public Contact() {
    }
    
    public Contact(String nom, String prenom, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }
    String getContact (){ return this.tel;}
    
    static boolean  ajoute(){
        boolean test =false;
        Scanner sc = new Scanner(System.in);
        Contact ncontact = new Contact();
        System.out.print("Nom:");
        ncontact.nom = sc.nextLine();
        System.out.print("Prenom:");
        ncontact.prenom = sc.nextLine();
        System.out.print("Tel:");
        ncontact.tel = sc.nextLine();
        listcontact.add(ncontact);
          test=true;
          return test;
    }
    static void afficheList(){
        if(listcontact.isEmpty()) 
            System.out.println("La liste est vide \n veuillez ajouter un contact dans option 0");
        else
            for (int i = 0; i < listcontact.size(); i++) {
            System.out.println(listcontact.get(i).toString());}
    }
    @Override
    public String toString() {
        return "Nom:"+this.nom+" "+this.prenom+  " tel:"+this.tel; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
