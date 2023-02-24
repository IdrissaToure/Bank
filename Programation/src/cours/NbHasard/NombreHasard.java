/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.util.Random;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class NombreHasard {
    public static void main(String[] args) {
        int nb1=1;
        int nb2=100;
        Random ran =new Random();
        int x =ran.nextInt(nb2)+ nb1;
        System.out.println(x);
        
    }
    
}
