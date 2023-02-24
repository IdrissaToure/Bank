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
public abstract class Personne {
 String nom;
 String prenom;
 int age;
 char sexe;
 
 public Personne(String nom , String prenom , int age , char sexe){
     this.nom=nom;
     this.prenom=prenom;
     this.age=age;
     this.sexe=sexe;
    
 }
   abstract void verifiAge();
   public void verifiDonnees(){
       
   };
}
