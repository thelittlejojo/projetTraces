package fr.jojo.generateur;

import java.util.Random;

/**
 * Identifiant NIR :
 * Ce numéro est composé de 13 chiffres : le sexe (1 chiffre), 
 * l'année de naissance (2 chiffres), le mois de naissance (2 chiffres) 
 * et le lieu de naissance (5 chiffres) departement 01 à 99 (simplifié) commune de  001 à 989. 
 * ensuite 3 chiffres entre 001 à 999 pour le n° d'ordre de naissance dans le mois et la commune. 
 * Une clé de contrôle à 2 chiffres de 01 à 97 complète le NIR.
 * @author johann
 *
 */
public class GenerateurIndividu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateurIndividu generator = new GenerateurIndividu();
		System.out.println("Sexe" + generator.genererSexe());
		System.out.println("Annee" + generator.genererAnnee());
		System.out.println("Mois" + generator.genererMois());
		System.out.println("Departement" + generator.genererDepartement());
		System.out.println("Commune" + generator.genererCommune());
//		Object[] number = new Object[1];
//		number[0] = new Integer(1);
//		System.out.println(String.format ("%02d", number));
		//String formattedString = String.format("Order with OrdId : %d and Amount: %d is missing", 40021, 3000);  
	}

	/**
	 * Cette méthode génère aléatoirement le sexe d'un individu
	 * sexe 1 = Homme ou 2 = Femme
	 */
	protected int genererSexe() {
		Random rand = new Random();
		return (rand.nextInt(2)+1);
	}
	
	/**
	 * Année de naissance
	 * de 00 à 99
	 */
	protected String genererAnnee() {
		Random rand = new Random();

		
		Object[] number = new Object[1];
		number[0] = new Integer(rand.nextInt(100));
		return String.format ("%02d", number);

	}
	
	/**
	 * Mois de naissance
	 */
	protected String genererMois() {
		Random rand = new Random();

		
		Object[] number = new Object[1];
		number[0] = new Integer(rand.nextInt(12)+1);
		return String.format ("%02d", number);

	}
	
	/**
	 * Departement de naissance
	 */
	protected String genererDepartement() {
		Random rand = new Random();

		
		Object[] number = new Object[1];
		number[0] = new Integer(rand.nextInt(100));
		return String.format ("%02d", number);

	}
	
	/**
	 * Commune de naissance
	 */
	protected String genererCommune() {
		Random rand = new Random();
		
		Object[] number = new Object[1];
		number[0] = new Integer(rand.nextInt(989)+1);
		return String.format ("%03d", number);

	}
	
	/**
	 * ordre naissance /commune/mois
	 */
	protected String genererOrdre() {
		Random rand = new Random();
		
		Object[] number = new Object[1];
		number[0] = new Integer(rand.nextInt(999)+1);
		return String.format ("%03d", number);

	}
	
	/**
	 * Cle du nir
	 */
	protected String genererCle() {
		Random rand = new Random();
		
		Object[] number = new Object[1];
		number[0] = new Integer(rand.nextInt(97)+1);
		return String.format ("%02d", number);

	}
}
