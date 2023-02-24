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
public class LaClasseBinaire {
    public static void main(String[] args) {
        int dec =192;
        String bin =Integer.toBinaryString(dec);
        String hex =Integer.toBinaryString(dec);
        System.out.println(dec+"en binaire :"+bin);
        System.out.println(dec+"en hexadécimal :"+hex);  
    }
    
}
