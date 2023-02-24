package courss;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Table_de_Mulittiple {
    public static void main(String[] args) {
    /*int n=0;
    int i=0;
    while(n<20)
        n++;
    System.out.println("la table de mulitiplication par"+n);
  while(i<10){
        System.out.println(n+" x "+i+" = "+n*i);
        i++;
}
*/
int x=1;
while(x<20){
    
System.out.println("Table de multpl de :"+x);
    x++;
 int n=1;
 while(n<=10){
    System.out.println(x+" x "+n+" = "+(n*x));
    n++;
    if(x%2==0){
        System.out.println("paire "+x);
   }else
         System.out.println("impaire "+x);
  }
} 

 }
    
}
