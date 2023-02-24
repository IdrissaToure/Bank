/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

/**
 *
 * @author Geni Sgo
 */
public class Run {
    public static void main(String[] args) {
      
        //String textCode = Crypt.coder("Adama"); 
        //System.out.println( textCode );
       // System.out.println(Crypt.decoder("QWRhbWE="));
        //Ajouter une ligne dans la base de donner 
        //Filemanager.addLine(textCode);
        //new User("Adama", "Diarra", "adDiarra", "PasDia").inscription();
        //new User("Oumar", "Ouattara", "oubi", "pd5252").inscription();
        Filemanager.updateDb(); //mise a jours
        //System.out.println(User.dbusers.get(0).toString());
        
        //connexion a la plateforme 
        User login = User.connexion("adDiarra", "PasDia"); 
        if(login==null){
            System.out.println("Le nom d'utilisateur ou le mot de passe incorrect");
        }else{
            System.out.println("Bienvenu "+login.toString());
        }
        
    }
}
