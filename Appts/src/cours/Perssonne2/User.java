/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class User extends Pressone2 implements NetworkException {
    String username;
    String password;

    public User(String nom , String prenom, int age , char sex,String adress) {
        super(nom, prenom, age, sex, adress);
    }
    
    void inscription(String username,String password){
        this.username=username;
        this.password=password;
       if(verifiAge()&& noAccesNetwork()&&noArgumentValid()){
           System.out.println("inscription effectué avec succes");
       }else{
           System.out.println("inscription a echouer");
       }
    }

    @Override
    boolean verifiAge() {
        if(this.age>18){
            System.out.println("L'utilisateur esr majeur");
            return true;
        }else{
            System.out.println("L'utilisatuer est mineur");
            return false;
        }
    }
    
    @Override
    public boolean noAccesNetwork() {
        boolean test=true;
        System.out.println("connexion internet indisponible");
        return test;
    }

    @Override
    public boolean noChargingNetwork(){
        
        return true;
    }

    @Override
    public boolean noArgumentValid() {
        if(this.nom.isEmpty() || this.prenom.isEmpty()){
                    System.out.println("Il ya arguments non valide");
                    return false;

        }else{
            return true;
        }
        
    }
    
}
