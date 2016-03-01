package fr.jojo.generateur.data;

import java.util.Date;

public class Beneficiaire {
	/** Nom de l'individu */
	protected String nom;
	/** Prénom de l'individu */
	protected String prenom;
	/** identifiant unique de l'individu */
	protected String nir;
	/** Date de naissance */
	protected Date dtn;
	/** qualité du bénéficiaire : Assuré, Conjoint, Conjoint séparé, ...*/
	protected String qualite;
	/** Sexe de l'individu : Homme/Femme */
	protected String sexe;
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNir() {
		return nir;
	}
	public void setNir(String nir) {
		this.nir = nir;
	}
	public Date getDtn() {
		return dtn;
	}
	public void setDtn(Date dtn) {
		this.dtn = dtn;
	}
	public String getQualite() {
		return qualite;
	}
	public void setQualite(String qualite) {
		this.qualite = qualite;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	

}
