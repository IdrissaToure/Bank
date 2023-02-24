
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class ClassScanne {
    public static void main(String[] args) {
        String listContc[][]={{"Bouba"},{"74000102"},{"Moussa"},{"65653030"}};
//        int tabnum[]={63728943,50232425,64661899};
        Scanner scn = new Scanner(System.in);
        System.out.println("choisisez votre Contact :");
        String num= scn.nextLine();
        System.out.println("Votre numero est prêt :"+num);
        System.out.println("Ecrir votre Messages");
        String sms= scn.nextLine();
        System.out.println("Le Message est envoyer avec succes :"+sms);
        
        
    }
}
