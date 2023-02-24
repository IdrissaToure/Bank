/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.Professeur;

/**
 *
 * @author BLOG INFORMATIQUE
 */
// Ici ce Executeur de Code
public class Executeur {
    public static void main(String[] args) {
        //Executeur pour Etudiant
        Etudiant e1 =new Etudiant();
        Etudiant e2 =new Etudiant("Toure","Idrissa",25 );
        Etudiant e3 =new Etudiant("Sogodogo","Adama",22);
        e1.infos();
        e2.infos();
        e3.infos();
    
      /*Calculatrice calc = new Calculatrice(5, 8);
      calc.add();
      calc.sous();
      calc.multip();
   */ }
    
}
