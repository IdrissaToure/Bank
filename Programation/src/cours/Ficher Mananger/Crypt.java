/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;

/**
 *
 * @author Geni Sgo
 */
public class Crypt {
    
  
    public static String coder(String text){
        //Base64 (pour chiffrer)
        Encoder encoder = Base64.getEncoder();
        String code = encoder.encodeToString(text.getBytes());
        return code; 
     
    }
    
    public static String decoder(String textCode){
        
        return new String (Base64.getDecoder().decode(textCode));
    }
    
}
