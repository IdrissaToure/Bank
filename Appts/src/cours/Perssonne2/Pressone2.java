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
public abstract class Pressone2 {
    String nom;
    String prenom; 
    int age; 
    String adress; 
    char sex='M';
    public Pressone2(String nom, String prenom , int age ,char sex, String adress){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.adress=adress;
        this.sex=sex;

    }
    boolean verifiAge(){
      return false;  
    }
}
