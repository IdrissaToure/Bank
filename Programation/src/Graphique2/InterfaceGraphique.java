/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphique2;

import javax.swing.JOptionPane;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class InterfaceGraphique {
    public static void main(String[] args) {
        int a= JOptionPane.showConfirmDialog(null,"Voulais-vous supprimer ce ficher ?");
        if (a==0)
        System.out.println("Ficher supprimer");
        if (a==1)
        System.out.println("Ficher no supprimer");
        if (a==2)
        System.out.println("supprimer annulle");
          JOptionPane.showConfirmDialog(null, "Supprimer ?","Titre",JOptionPane.YES_NO_OPTION);
          String S =JOptionPane.showInputDialog("Siasir votre nom");
          System.out.println("Votre nom est :"+S);
//        int a= JOptionPane.showConfirmDialog(null,"Voulais-vous supprimer ce ficher ?");
        if (a==0)
        System.out.println("Ficher supprimer");
        if (a==1)
        System.out.println("Ficher no supprimer");
        if (a==2)
        System.out.println("supprimer annulle");
         JOptionPane.showConfirmDialog(null, "Supprimer ?","Titre",JOptionPane.YES_NO_OPTION);
         JOptionPane.showInputDialog("Message","Nom et ¨Prénom");
           JOptionPane.showMessageDialog(null,"Connexion echoue");
           JOptionPane.showMessageDialog(null,"Connexion echoue", "Information",JOptionPane.ERROR_MESSAGE);
    }
    
}
