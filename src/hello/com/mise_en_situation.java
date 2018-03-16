package hello.com;

import java.util.Scanner;

/**
 * 
 * @author Nicolas
 *
 */
/* Le contexte consiste à demander le nom de l'utilisateur 
									prenom
									age 
									date de naissance 
									Afficher les informations? 
									Si mageur : afficher il est majeur 
									*/
public class mise_en_situation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		String prenom;
		String nom;
		String datedenaissance;

		String anneeDeNaissance ;
		System.out.println("Entrer votre prenom:");

		prenom = clavier.nextLine();
		System.out.println("Entrer votre Nom:");

		nom = clavier.nextLine();

		System.out.println("Entrer votre jour et mois de naissance:");

		datedenaissance = clavier.nextLine();
		System.out.println("Entrer votre année de naissance:");

		anneeDeNaissance = clavier.nextLine();
		;

		System.out.println("Bonjour c'est " + prenom + " " + nom + " je juis né le:" + datedenaissance + "/" + anneeDeNaissance );

		
		
		int MonAge, anneAujourd;
		anneAujourd = 2018;
		
		String myString = anneeDeNaissance;
		int Age = Integer.parseInt(myString);
		
		MonAge =  anneAujourd-Age;
		System.out.println("J'ai "+MonAge+ " ans"+" et ");
		
		if (MonAge >= 18) {

			System.out.println("Je suis majeur");

		} else {
			System.out.println("je suis mineur");
		}
		
		

	}

}
