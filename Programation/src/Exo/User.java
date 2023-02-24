/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo;

/**
 *
 * @author hp
 */
public class User {

    static User list(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String nom;
    String prenom;
    String userName;
    String userpassword;

    public User() {
    }
 
    public User(String nom, String prenom, String userName, String userpassword) {
        this.nom = nom;
        this.prenom = prenom;
        this.userName = userName;
        this.userpassword = userpassword;
    }
  static User [] list ={
        new User("Toure", "Lassana", "test", "11223"),
        new User("Traoré", "Modibo", "test1", "11224"),
        new User("Diarra", "Adama", "Text3", "11225"),
        new User("Sylla", "Ousmane", "Text4", "11226"),
          
        };    

   
            
    
}
