/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class ConnexionBD {
    public static Connection con =null;
    public static Connection connecter(){
        try {
            // charger le pilote
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgtech","root", "");
             if (con!=null){
                System.out.println("Connextion établie");
                return con;
            }else{
                System.out.println("Echec de Connexion");
                return con;
            }
        } catch (ClassNotFoundException | SQLException e) {
         System.out.println(e);  
        }
    return con;    
    }
    
}
