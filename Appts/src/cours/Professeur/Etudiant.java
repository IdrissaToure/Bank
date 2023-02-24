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
public class Etudiant {
String nom;
String prenom;
int age; 
//Constriqeteur sans parametre
public Etudiant(){
    System.out.println("Un etudiant est créé");
}
//Constriqeteur avec parametre
public Etudiant(String nomx, String prenomx, int agex){
    this.nom =nomx;
    this.prenom=prenomx;
    this.age=agex;
}// Fonctions
public void infos(){
    System.out.println(this.prenom+" "+this.nom+" "+this.age);
}
    
}
