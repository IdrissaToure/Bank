/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.util.Scanner;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Classesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("quel est votre nom :");
        //Saisir votre nom
        String nom =sc.nextLine();
        System.out.print("Quel est votre prenom :");
        String Prenom =sc.nextLine();
        // Saisir votre prenom
        System.out.print("Quel est votre age :");
        String age =sc.nextLine();
        //Saisir votre age
        System.out.println("Ton nom et ton age est : "+Prenom+" "+nom+" "+age+"ans");
    }
    
}
