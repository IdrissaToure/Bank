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
public class Professeur extends Personne{
    int codProf;
    String domaine;
     public Professeur(String nom , String prenom , int age ,char sexe, int codProf, String domaine){
         super(nom,prenom,age,sexe);
         this.codProf=codProf;
         this.domaine=domaine;
     }

    
   

    @Override
    void verifiAge() {
        if(this.age>25){
            System.out.println("Profeesseur est Valide");
        }else{
            System.out.println("Professeur est no Valide");
        }
    }
   
}
