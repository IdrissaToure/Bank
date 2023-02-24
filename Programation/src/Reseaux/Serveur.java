/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reseaux;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author hp
 */
public class Serveur {
    public static void main(String[] args) {
        int port=12345;
        try {
            ServerSocket serveur = new ServerSocket(12345);//Le Serveur écoute sur le port 12345
            Socket client = serveur.accept();//Attente d'une connexion entr
            BufferedReader in =new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            String Ligne;
            while((Ligne = in.readLine()) !=null){ //
                System.out.println(Ligne);
                out.println("J'ai reçu :"+Ligne);
            }
            client.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
