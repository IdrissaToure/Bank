/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class LaClasseInteger {
    public static void main(String[] args) {
        //Sa ce Methode en String mais on va trensforme en int .
//        String s1="3";
//        String s2="4";
//        System.out.println(s1+s2);
//        //Sa ce Methode pour Transforme String en Int.
//        int a= Integer.parseInt(s1);
//        int b= Integer.parseInt(s2);
//        double racine =Math.sqrt(9);
//        System.out.println(a+b);
//        System.out.println(racine);
//        saluer();
        System.out.println(somme(2,5)*5);
    }
    public static void saluer() {
        System.out.println("Bonjoure tout le monde");
    }
    private static int somme(int x, int y){
        int s=x+y;
        return s; 
    }
}
