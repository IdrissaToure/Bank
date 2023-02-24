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
public class ClasseScan {
    public static void main(String[] args) {
        int pièce=0,monnaie=0,Pièce=0;
        Scanner clavier= new Scanner(System.in);
        do{
            while (Pièce<3){
                System.out.println("Bienveneu dans le cafe matein");
                System.out.println("Vous avais Besoin de cafe ok prene la place");
                System.out.print("Entre une pièce de Monnaie :");
                pièce=clavier.nextInt();
                if(pièce==1 || pièce==2 || pièce==5){
                    Pièce+=pièce;
                    if(Pièce<3){
                        System.out.println("pièce"+Pièce+"FCFA");
                    }else
                        if(Pièce>=3){
                    monnaie=Pièce-3;
                }
                }else{
                    System.out.println("Le distributeur n'accepts que le pièce 1,2 et 5");
                }
            }
        }while (pièce!=1 && pièce!=2 && pièce!=5);
        System.out.println("Tene votre café \n est tene votre monnaie");
    }
}
