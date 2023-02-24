/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courss.TestVariable;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class connexion {
    int etat;
    public connexion (int etat){
        this.etat =etat;
    }
    public void seconnecter()throws Exception{
        if(etat==1){
            throw new Exception("Connexion indisponible");
        }else{
            System.out.println("connexion est disponible vous pouvais navigeur");
        }
    }
}
