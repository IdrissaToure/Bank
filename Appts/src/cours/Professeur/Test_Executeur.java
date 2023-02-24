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
public class Test_Executeur {
    public static void main(String[] args) {
        Professeur diarra = new Professeur("DIARRA", "SEYDOU",22, 'M', 0075 ,"java"); 
        Etudiant2 toure = new Etudiant2("Toure","Adama", 18,'M');
        diarra.verifiAge();
        toure.verifiAge();
    }
    
}
