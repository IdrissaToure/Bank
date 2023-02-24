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
public class Objet {
    public static void main(String[] args) {
        String tabnom  [] ={"Sogodogo","Touré","Diarra","Sangare"};
        int  age []= {23,10,18,17};
        
        for (int i = 0; i < 4; i++) {
            if(age[i]<18){
  System.out.println(tabnom[i]+" "+age[i]);             
            }
   
        }
        
    }
}
