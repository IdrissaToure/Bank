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
public class Etudiant2 extends Personne{
    public Etudiant2(String nom , String prenom, int age , char sexe ){
        super(nom, prenom, age ,sexe);
    }

    @Override
    void verifiAge() {
        if(this.age>16){
            System.out.println("Etudiant2 est valid");
      }else{
            System.out.println("Etudiant2 et no Valid , l'age est inferieur a 16 ");
        }
   }
    
}
