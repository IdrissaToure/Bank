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
public class Utilisateur {
    String nom;
    String prenom;
    int age;
    String username;
    String password;

    public Utilisateur(String nom, String prenom, int age, String username, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    void changepasse(String newpassword) {
        this.password=newpassword;
    }
    
 
}
