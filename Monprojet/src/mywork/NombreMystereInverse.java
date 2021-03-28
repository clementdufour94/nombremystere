package mywork;

public class NombreMystereInverse {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);	
	
	public static void main(String[] args) {
		
		System.out.println("Nombre Mystere inversé");
		System.out.println("L'ordinateur a mis " + nombreMystere() + " essais pour decouvrir le nombre mystere");

	}

	public static int nombreMystere() {

	        int limitesuperieur = 9999; 
	                              
	        int limitesinferieur = 0; 
	                            
	        int compteur = 0; 
	        int guess = 0; //
	        int previousGuess = 0; 
	        char input = ' ';
	        
	        while (input != '=') {
	        	if (compteur <=9) {
	        		 
		            if (input == '+') limitesinferieur = guess + 1; 
		            						
		            						 
		            else if (input == '-') limitesuperieur = guess - 1 ;
		            
		           
		            previousGuess = guess;
		            guess = limitesinferieur + ((limitesuperieur - limitesinferieur) / 2);
		            
		            if (previousGuess == guess) {
		            	System.out.println("");
		                System.out.println("Vous vous êtes trompé !");
		                System.out.println("");
		               
		                return compteur;
		            }
		            
		           
	        		
	        	}else {
	        		System.out.println("");
	        		System.out.println("Vous avez gagné l'ordinateur n'a pas deviné votre nombre mystere !" );
	        		System.out.println("");
        			Menu.main(null);
	        		
	        	}
	        	 compteur ++;
	        	   System.out.println(" \n Vous en êtes à "+ compteur    +" essaies \n");
		           System.out.println(" \n Est-ce que " + guess + " est votre nombre mystere ? \n");  
		           input = lireCharPlusMoinsEgal();   
	        	
	        
	                   
	        }
	        
	        
		return compteur;
	}
	
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;

		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1))
								+ valeurMinimale;
		return resultat;
	}
    
    public static char lireCharPlusMoinsEgal() {
        char input = '3';
        while (input != '+' && input != '-' && input != '=') {
            System.out.print("Entrez '+', '-' ou '=' : ");
            input = scanner.next().charAt(0);
        }
        
        return input;
    }
}
