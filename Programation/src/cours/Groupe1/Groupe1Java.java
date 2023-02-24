/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.Groupe1;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Groupe1Java {
public static void main(String[]args)
{
   int age= 20;
    int age1=18;
    int age3=19;
    int age4=18;
       //condition 20<=20
       //Opeurqteur logiaue et=(&&), ou=(||)
    if(age3>=age1 &&age1<=age4&& age>=20 || age<=age4 &&age3<=age4 || 
           age>age4&& age<=20){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    
}
}
