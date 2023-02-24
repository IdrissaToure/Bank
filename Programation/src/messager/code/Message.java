/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messager.code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Message {
    Contact sender; 
    Contact recever ; 
    String message; 
    static ArrayList<Message> listmessage= new ArrayList<>();

    public Message() {
    }
   
    public Message(Contact sender, Contact recever, String message) {
        this.sender = sender;
        this.recever = recever;
        this.message = message;
    }
    public Message(Contact sender, Contact recever) {
        this.sender = sender;
        this.recever = recever;
        
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
   public static boolean sender(Contact emetter){
       boolean test =false;
       Message sms = new Message();
       Scanner sc = new Scanner(System.in);
       System.out.print("List contact disponible");
       Contact.afficheList();
       System.out.println("\n\n Choisissez un contact (0-"+(Contact.listcontact.size()-1)+"):");
       sms.recever = Contact.listcontact.get(sc.nextInt());
         System.out.print("Ecrie message:");
       sms.message = sc.nextLine();
       sms.message = sc.nextLine();
       Message.listmessage.add(sms);
       test =true; 
       return test; 
   }
    
}
