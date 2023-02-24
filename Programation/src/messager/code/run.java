/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messager.code;

import java.util.Scanner;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class run {
    public static void main(String[] args) {
        boolean exit =false ; 
        String options []={"Ajouter un contact","Envoyer un message","Historique message","Afficher liste de contact","quiter"}; 
        while(!exit){
            for (int i = 0; i < options.length ;i++) {
                System.out.println(i+":"+options[i]);
            }
            System.out.print("Option(0-"+(options.length-1)+"):");
            int choix = new Scanner(System.in).nextInt();
            switch(choix){
                case 0:
                    if(Contact.ajoute()) System.out.println("Contact ajouté avec succes");break;
                case 4: System.out.println("Aurevoir! ");exit=true ;break;
                case 1: Message.sender(new Contact("Traore", "Oumar", "20252532"));
            }
        }
    }
}
