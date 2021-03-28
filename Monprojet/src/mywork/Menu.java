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
			System.out.println("Règles du jeu");
			System.out.println("--------------------------------\n");
			System.out.println("Nomre mystère : ");
			System.out.println("Il  vous faut deviner le nombre mystère de l'ordinateur en moins de 10 essaies.");
			System.out.println("Pour cela il faut rentrer un nombre et l'ordinateur vous dira plus ou moins.");
			System.out.println("--------------------------------\n");
			System.out.println("Nomre mystère Inverse : ");
			System.out.println("Il faut que l'ordinateur réussisse à deviner votre nombre en moins de 10 essaies. ");
			System.out.println("Pour cela l'ordinateur vous affiche des nombres et vous devez écrire +,- ou = .");
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
		System.out.println("1- Nombre mystère joueur devine");
		System.out.println("2- Nombre mystère ordinateur devine");
		System.out.println("3- Règles");
		System.out.println("4- Quitter");
		
		selection = input.nextInt();
		return selection;
		
	}

		
}
	


