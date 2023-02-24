
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Run {
    public static void main(String[] args) {
   
   Vol v = new Vol(1234,"Bamako", "Charle de gaulle", "air Mali", "06 Novembre 2022", 10, 4, 100);
  v.setDate(" LE 19 Novembre 2022");
  v.setDuree(5);
  v.setHeure_depart(10);
  v.setNbvoyage(45);
  v.getNum();
  v.getDestination();
  v.getCompagnie_aer();
  v.getDate();
  v.getDuree();
  v.getNbvoyage();
  v.getHeure_depart();
  
  
    v.GetInfo(10);
    }
    
}
