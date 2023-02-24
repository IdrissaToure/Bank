/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

import java.util.ArrayList;

/**
 *
 * @author Geni Sgo
 */
public class User {

    String prenom;
    String nom;
    String username;
    String password;
    static ArrayList<User> dbusers = new ArrayList<>(); 

    public User(String prenom, String nom, String username, String password) {
        this.prenom = prenom;
        this.nom = nom;
        this.username = username;
        this.password = password;
    }

    static User connexion(String rname , String rpass) {
        Filemanager.updateDb();
        
        for (User monuser : dbusers) {
            if(monuser.username.equals(rname)&&monuser.password.equals(rpass)){
                return monuser;
            }
        }
        return null;
    }

    boolean inscription() {
        if (!this.prenom.isEmpty() && !this.nom.isEmpty() && !this.username.isEmpty() && !this.password.isEmpty()) {
            return Filemanager.addLine(toString());
        } else {
            return false;
        }

    }

 
    @Override
    public String toString() {
        return this.prenom + "|" + this.nom + "|" + this.username + "|" + this.password;
    }

}
