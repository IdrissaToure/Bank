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
public class Calculatrice {
    int x=0;
    int y=0;
public Calculatrice(int x,int y){
    this.x=x;
    this.y=y;
}
public void add(){
    System.out.println(this.x+this.y);
}    
public void sous(){
    System.out.println(this.x-this.y);
}
public void multip(){
    System.out.println(this.x*this.y);
}
}
