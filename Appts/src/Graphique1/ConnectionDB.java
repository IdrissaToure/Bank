/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphique1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class ConnectionDB {
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
