/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Modibo
 */
public class Personnel {
    private String prenom;
    private String nom;
    private int age;

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public Personnel() {
    }

    public Personnel(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    
    public Personnel(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    
    public String sePresenter(){
        return "Je m'appelle : "+this.getPrenom()+" "+this.getNom()+". J'ai "+this.getAge()+" an(s)";
    } 
}
