/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class GestionFille {
    public static void main(String[] args) {
        File ficher= new File("user.txt");
        try {
            if(!ficher.exists()) ficher.createNewFile();//pour creé une ficher
            String donne ="Utilisateur : Toure";
            //Path ce le cemin de ficher
            Files.write(ficher.toPath(), donne.getBytes(), StandardOpenOption.APPEND);//APPEND sa ajoute linge 
//            Files.delete(ficher.toPath());//ici pour effacer le ficher
          } catch (Exception e) {
            System.out.println("Le ficher est cree avec succes");   
        }
    }
    
}
