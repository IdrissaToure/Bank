/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Run {
     public static void main(String[] args) { 
        Person p1 = new Person("Alex", 25); 
          
        // Appeler le constructeur de copie
        Person p2 = new Person(p1);    
  
        /* Notez que la ligne suivante n'implique pas un appel de 
        constructeur de copie comme les variables non primitives 
        ne sont que des références. */
        Person p3 = p2;    
  
        // la méthode toString() est appelé ici
        System.out.println(p1); 
    } 
}
