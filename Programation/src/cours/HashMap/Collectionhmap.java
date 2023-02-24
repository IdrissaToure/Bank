/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class Collectionhmap {
    public static void main(String[] args) {
        ArrayList<Integer> age =new ArrayList<>();
        age.add(20);
        age.add(30);
        age.add(40);
        ArrayList<String> listnom = new ArrayList<>();
        listnom.add("OUmar Ouattara");
        listnom.add("Seydou Sangare");
        listnom.add("Adama Kone");
        HashMap<String,ArrayList> db =new HashMap<>();
        db.put("age", age);
        db.put("nom", listnom);
        int moyenne =0;
        for (int i = 0; i < db.get("nom").size() && i<db.get("age").size(); i++) {
            System.out.println(db.get("nom").get(i)+" "+db.get("age").get(i));
        }
    }
    
}
