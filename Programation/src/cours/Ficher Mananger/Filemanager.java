/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author Geni Sgo
 */
public class Filemanager {
    static File db = new File("db.user");
    
    //ecrir le ficher 
    
    static boolean addLine(String line){
        try {
           
            //verification si exist
            String coder = Crypt.coder(line);
            if(!db.exists()) db.createNewFile(); 
            Files.write(db.toPath(), coder.concat("\r").getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (Exception e) {
            System.err.print(e.getMessage());
            return false; 
        }
    }
    static void updateDb(){
        try {
             User.dbusers.clear(); //vider la liste
             Scanner sc = new Scanner(db);
             while (sc.hasNext()) {
                String textuser = sc.next();
                String decode =Crypt.decoder(textuser);
                String tab[] = decode.split("\\|");
                //remplire 
                 User.dbusers.add(new User(tab[0], tab[1], tab[2], tab[3]));
                 
            }
        } catch (Exception e) {
        }
    }
}
