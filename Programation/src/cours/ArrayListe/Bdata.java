/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Bdata {
    public static void main(String[] args) {
        ArrayList<User>listuser =new ArrayList<>();
        listuser.add(new User("Diarra", "Moussa", 20, 'H', "Golf"));
        listuser.add(new User("Diawara", "Mamadou", 30, 'H', "Kayes"));
        File file= new File("list.txt");
        for (int i = 0; i <listuser.size(); i++) {
            try {
                User u =listuser.get(i);//recuperation de User a index i 
                System.out.println(u.nom+" "+u.prenom+" "+u.age+" "+u.sex+" "+u.adress);
                String line = String.valueOf(i)+": "+u.nom+" "+u.prenom+" "+u.age+" "+u.sex+" "+u.adress+"\r \n";
                if(!file.exists()) file.createNewFile();//crée si le ficher n'exist pas*
                  Files.write(file.toPath(), line.getBytes(), StandardOpenOption.APPEND);
            } catch (Exception e) {
            }
            
        }
      
    }
    
}
