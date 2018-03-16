package hello.com;

import java.util.Scanner;

/**
 * premiere classe de programme.
 * @author Nicolas
 * 09:24:31
 */

public class miseEnsituation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] informationsUtilisateur = new Object[4][2];  // Creer un tableau à 2D pour rentrer les informations de l'utilisteur
		
		//Je creer mon clavier
		Scanner clavier = new Scanner(System.in);
		
		// Je declare sans initialiser 3 variables de meme types 
		String nom, prenom, dateDeNaissance;
		
		// Je fais une boucle pour creer mes deux utilisateur 
		// On connais les bornes de la boucles qui sont 0 jusqu'a 2. [0,2[
		for (int unilisateruCreer = 0; unilisateruCreer < 2; unilisateruCreer++) {
			prenom = recupererPrenom(clavier);
			
		}
	}
	
	/**
	 * Recuperer le prenom d'une personne 
	 * @param clavierCopie  // Object de type scanner 
	 * @return // Le prenom de l'utilisateur 
	 */
	String recupererPrenom(Scanner clavierCopie) {
		// Vérifier qu'un prenom est au bon format
		boolean verivicateur = false;
		String firstName;
		// On doit au moins rentrer une fois dan la boucles
		// On boucle tant que le verificateur est faux
		do {
			System.out.println();
			firstName = clavierCopie.nextLine(); 
			System.out.print("Entrer votre prénom");
			if (firstName.contains("^[A-Za-z](3,)$")) {
				System.out.println("Okay");
			}

		} while (verivicateur != true);
		
		
		// ^ == debut de chaine de caractere 
		// $ == fin de chaine de caractere
		return null;
	}
	
}
