package mywork;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		int userChoice;
		
		int selection2;
		
		userChoice = menu ();
		
		
		if(userChoice == 1) {
			nombremystere.main(args);
			Menu.main(args);
			
		}
		if(userChoice == 2) {
			NombreMystereInverse.main(args);
			Menu.main(args);
			
		}
		
		
		if(userChoice == 3) {
			System.out.println("R�gles du jeu");
			System.out.println("--------------------------------\n");
			System.out.println("Nomre myst�re : ");
			System.out.println("Il  vous faut deviner le nombre myst�re de l'ordinateur en moins de 10 essaies.");
			System.out.println("Pour cela il faut rentrer un nombre et l'ordinateur vous dira plus ou moins.");
			System.out.println("--------------------------------\n");
			System.out.println("Nomre myst�re Inverse : ");
			System.out.println("Il faut que l'ordinateur r�ussisse � deviner votre nombre en moins de 10 essaies. ");
			System.out.println("Pour cela l'ordinateur vous affiche des nombres et vous devez �crire +,- ou = .");
			System.out.println("--------------------------------\n");
			System.out.println("Appuyer sur 1 pour revenir au menu .");
			
			Scanner input = new Scanner(System.in);
			selection2 = input.nextInt();
			if(selection2 == 1) {
				System.out.println("-\n");
				Menu.main(args);
				
			}
			
		}if(userChoice == 4) {
			System.exit(0);
			
			
		}
		
		
		
		
	}
	public static int menu() {
		int selection;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choisissez entre ces quatres choix");
		System.out.println("--------------------------------\n");
		System.out.println("1- Nombre myst�re joueur devine");
		System.out.println("2- Nombre myst�re ordinateur devine");
		System.out.println("3- R�gles");
		System.out.println("4- Quitter");
		
		selection = input.nextInt();
		return selection;
		
	}

		
}
	


