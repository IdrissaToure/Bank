/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reseaux;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


/**
 *
 * @author hp
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",12345);//Le Serveur écoute sur le port 12345
            BufferedReader in =new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            out.println("Bonjour,serveur ! Nous sommes à CG-TECH");
            String reponse =in.readLine();
            System.out.println("Réponser du serveur :"+reponse);
            client.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
