/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.TestVariable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Application {
    int etatconnexionTelphone =0;
    void Demarrer(){
        try {
            connexion con =new connexion(etatconnexionTelphone);  
            con.seconnecter();
        } catch (Exception ex) {
            System.out.println("Fermeture de l'application \n La connexion est indisponible");
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
