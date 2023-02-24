/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.TabMatiere;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class TabMatiere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 /*int age=18;
if(age>=18){
    System.out.println("Vous étè Majeur");
}else{
    System.out.println("Vous étè Mineur");
}
switch (age){
    case 18:System.out.println("Votre age est egale a 18");
    break;
    case 20: System.out.println("age est egale a 20");
    default:System.out.println("age inconnue");
}
*/
 String [] tabMatiere={
     "Math",
     "Physiqe",
     "Chimie",
     "ECM",
     "EPS"};
 String [] tabNote={"12","14","16","11","17"};
 int index=0;
 while(index<tabMatiere.length && index<tabNote.length){
        System.out.println(tabMatiere[index]+" "+tabNote[index]);
        index++;
    }

    }
    
}
