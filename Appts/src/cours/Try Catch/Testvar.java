/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.TestVariable;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Testvar {
    public static void main(String[] args) {
        int x=0;
        int y=2;
        try{
            System.out.println(y/x);
        }catch(ArithmeticException e){
            System.out.println("La division par zero est impossible");
             System.out.println(e.getMessage());
        }
    }
    
}
