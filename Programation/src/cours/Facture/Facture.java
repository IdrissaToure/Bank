/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.Facture;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Facture {
String Designation="Sucre";
int prix_a=0;
int prix_v=0;
int stock=10;
public Facture(){
    System.out.println("une Facture est créé");
}
 public Facture(String nom, int prix_a, int prix_v, int stock){
  this.Designation=nom;
  this.prix_a=prix_a;
  this.prix_v=prix_v;
  this.stock=stock;
  
}
public void sous(){
    System.out.println(this.prix_v-this.prix_a);   
}
public void multip(){
    System.out.println(this.prix_v+" "+this.prix_a*this.stock);
}
    
}
