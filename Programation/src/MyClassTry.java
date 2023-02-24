
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class MyClassTry {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
                      String  [] pc = {"Acer", "Azus","Hp"};
	 try{ /*ici on demande à Java de faire seulement un essai de traiter ce code et de 
	 l'ignorer en cas d'erreur pour passer au 2ème code qui se trouve dans le bloc catch */ 
	   
	    System.out.println (pc [4]); // Erreur!
			  }
                           
	 catch(Exception e){/*Java traitera ce code seulement si le code qui 
	 se trouve dans le bloc try contient une erreur !  */
             System.out.println("Votre choix n'est pas valide !");
              JOptionPane.showMessageDialog(null, "Ce Pc est dans le produit");
             
	    
              JOptionPane.showMessageDialog(null, "Ce Pc n'est pas dans le produit");
		   	}
	    System.out.println ("L'exécution du programme se poursuit maintenant !");
      
	    
                     }
                        
}
