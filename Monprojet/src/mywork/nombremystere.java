package mywork;


 


public class nombremystere {
	
	

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);	

	public static void main(String[] args) {
    
		System.out.println("Nombre Mystere");
		System.out.println("Vous avez mis " + nombreMystere() + " essais pour decouvrir le nombre mystere");

	}

	
	
	public static int nombreMystere() {
		
	       
	        int compteur = 0; 
		int nombreMyst = hasard(0, 9999); 
	        int input = -2; 
	        System.out.println("\nC'est un nombre entre 0 et 9999!");
	       
	        	while (input != nombreMyst) {
	        		if (compteur <=9) {
	        			System.out.println("Vous en êtes à "+ compteur    +" essaies");
	        			System.out.print("Essayez de deviner : ");
		        		input = scanner.nextInt();
		        		System.out.println();
		            
		        		if (input > nombreMyst) { 
		        			System.out.println("Mon nombre est plus petit.\n");
		        			
		                
		        		} else if (input < nombreMyst) { 
		        			System.out.println("Mon nombre est plus grand.\n");
		        			
		        			
		        		} else { System.out.println("Vous avez gagné !"); }
		        
		        		compteur ++;
	        			
	        		}else {
	        			
	        			System.out.println("Vous avez perdu le nombre était " + nombreMyst);
	        			Menu.main(null);
	        			
	        		}
	        		
	        	}
	        	
	        
	        	
	        	
	        
	        		        
		return compteur;
	}
	
	


	public static int hasard (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;

		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1))
								+ valeurMinimale;
		return resultat;
	}
    
}
