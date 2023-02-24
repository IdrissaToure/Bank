/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Master;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author hp
 */
public class EntreetSorties {
    public static void main(String[] args) {
 //Flux d'entre ce contenue de ficher ver le programme
//        File f= new File("C:\\Users\\hp\\Desktop\\LOGO.png");
        File h= new File("C:\\Users\\hp\\Desktop\\h.txt");
//        try {
//            FileInputStream fis = new FileInputStream(f);
//            int caractereLu =fis.read();
//            while (caractereLu != -1 ){
//                System.out.print(caractereLu+"|");
//                caractereLu =fis.read();
//            }
//            System.out.println();
//        } catch (Exception e) {
//            System.out.println(e);
//            
//        }
 //Flux d'entre ce contenue de  programme  ver le ficher 
        try {
            FileOutputStream fos =new FileOutputStream(h);
            String msg = "Bonjour à tous."+"Comment allez-vous ?";
       //Ca ce tableau de byte pour ecrire un il et appretien a un objet ex:"ABC"
            byte []b =msg.getBytes();
//            System.out.println(b[0]);
              String s = "ABC";
            byte [] tab =s.getBytes();
            System.out.println((char)tab[0]);
            fos.write(b);
//            fos.write(65);
//            fos.write(66);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
