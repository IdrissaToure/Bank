/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.Tabpasse;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Tabpasse {
    public static void main(String[] args) {
        char tabchar []={'a','b','c','d','e','f'};
        int x=0;
        String password="";
        while(x<tabchar.length){
            password+=tabchar[x];
            System.out.println( password);
            x++;
            if(password.length()<8 && x==6){
                x=x-2;
            }
                
        }
    }
    
}
