/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Vol {
  //Quand on dit dans un class que certin chosse ne varie pas on mettre final entre private et public avec int et string   
  //on laisse le reste en private ou public
   private final int num;
   private final String source;
   private final String destination;
   private final String compagnie_aer;
   public String date;
   public int heure_depart;
   public int dure;
   public int nbvoyage;

    public Vol(int num, String source, String destination, String compagnie_aer, String date, int heure_depart, int duree, int nbvoyage) {
        this.num = num;
        this.source = source;
        this.destination = destination;
        this.compagnie_aer = compagnie_aer;
        this.date = date;
        this.heure_depart = heure_depart;
        this.dure = duree;
        this.nbvoyage = nbvoyage;
    }

    public int getNum() {
        return num;
    }

    
    public String getSource() {
        return source;
    }

    

    public String getDestination() {
        return destination;
    }

   

    public String getCompagnie_aer() {
        return compagnie_aer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(int heure_depart) {
        this.heure_depart = heure_depart;
    }

    public int getDuree() {
        return dure;
    }

    public void setDuree(int duree) {
        this.dure = duree;
    }

    public int getNbvoyage() {
        return nbvoyage;
    }

    public void setNbvoyage(int nbvoyage) {
        this.nbvoyage = nbvoyage;
    }
   
    public String GetInfo(int escale){
       this.dure=escale;
      
        if(escale>4){
            System.out.println("escale");
        }else{
            System.out.println("sans escale");
        }
        String con = "Le vol " +this.dure+ " numero " +this.num+" d'" +this.compagnie_aer +" part de "+
               this.source +" à "+this.destination+ " le "+this.date+" à "+this.heure_depart +" voyageur "+this.nbvoyage;
        System.out.println(con);
       return con;
    }
}
