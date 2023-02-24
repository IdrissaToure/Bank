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
public class ClasseString {
    public static void main(String[] args) {
        String str1 = new String("Bonsoir"+" ");
        String str2 = new String("le classe");
        String  str = str1.concat(str2);
        boolean verif = str1.equals(str2);
        // if(verif){
          //  System.out.println("Les 2 chaine sont identiques");
      //}else{
          //  System.out.println("Les 2 chaine ne sont pas identiques");
        //}
        //System.out.println(str);
        //System.out.println(str1.contains(""));
        char []tab= str1.toCharArray();
        System.out.println(tab[0]+" "+tab[3]+" "+tab[2]);
        int a =5;
        int b =11;
        int tmp;
         tmp =b;
         b=a;
         a=tmp;
         System.out.println("a = "+a);
         System.out.println("b = "+b);
    }
    
}
