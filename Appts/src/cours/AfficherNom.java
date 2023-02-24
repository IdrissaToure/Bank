
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLOG INFORMATIQUE
 */
public class AfficherNom {
    public static void main(String[] args) {
        Scanner nombre= new Scanner(System.in);
        System.out.println("Saisir votre première nombre:");
        double x= nombre.nextDouble();
        System.out.println("Saisir votre deuxième  nombre:");
        double y=nombre.nextDouble();
        if(x>y) {
            System.out.println("parmi les deux nombre " +x+" et"+y +" x est le maximum ");
        } else if (y>x){
            System.out.println("parmi les deux nombre " +x+" "+y +"y est le maximum ");
        } else
            System.out.println("Le nombre est egaux veiller saisi une nombre correcte");
            System.out.println("Saisir votre première nombre:");
        double x1= nombre.nextDouble();
        System.out.println("Saisir votre deuxième  nombre:");
        double y1=nombre.nextDouble();
        if(x1>y1) {
            System.out.println("parmi les deux nombre " +x1+" "+y1 +" x est le maximum ");
        } else if (y1>x1){
            System.out.println("parmi les deux nombre " +x1+" "+y1 +"y est le maximum ");
        }
       
       
        
//	System.out.println("Veuillez saisir le premier nombre :");
//	//récupération de la saisie clavier à l'aide de la classe Scanner
//		Scanner sc1=new Scanner(System.in);
//		float x=sc1.nextFloat();
//		//affichage à l'écran d'un message demandant à l'utilisateur de taper le premier nombre
//			System.out.println("Veuillez saisir le 2 ème nombre :");
//			//récupération de la saisie clavier à l'aide de la classe Scanner
//			Scanner sc2=new Scanner(System.in);
//			float y=sc2.nextFloat();		
////comparaison des deux nombres
//		if(x<=y){
//System.out.println("Le maximum des deux nombres "+x+" et "+y+" est égale à  " + y);
//		}
//	else{ 
//			
//System.out.println("Le maximum des deux nombres "+x+" et "+y+" est égale à  " + x);		
//		}
//		sc1.close() ; 
//		sc2.close(); 

//			
		
    }
    
}
