package com.objis.cameroun.savelifes.domaine;

/**
 * La classe Donneur contient toutes les propri�t�s utilis�es
 * pour la gestion de l'utilisateur (demandeur) recherchant des donneur de sang
 * @author Ngon Joel
 * @date 21/09/2018
 */
public class Demandeur {
//D�claration des variables	
String nomDemandeur;
String prenomDemandeur;
String sexeDemandeur;
String ageDemandeur;
String sangDemandeur;
String bloodDesire;
String telephoneDemandeur;
String mailDemandeur;
String villeDemandeur;
String hopital;
String villeHopital;


/**
 * Constructeur de la classe Demandeur avec param�tres
 * @param nomDemandeut
 * @param prenomDemandeur
 * @param sexeDemandeur
 * @param ageDemandeur
 * @param sangDemandeur
 * @param bloodDesire
 * @param telephoneDemandeur
 * @param mailDemandeur
 * @param villeDemandeur
 * @param hopital
 * @param villeHopital
 */
public Demandeur(String nomDemandeut, String prenomDemandeur,
		String sexeDemandeur, String ageDemandeur, String sangDemandeur,
		String bloodDesire, String telephoneDemandeur, String mailDemandeur,
		String villeDemandeur, String hopital, String villeHopital) {
	super();
	this.nomDemandeur = nomDemandeut;
	this.prenomDemandeur = prenomDemandeur;
	this.sexeDemandeur = sexeDemandeur;
	this.ageDemandeur = ageDemandeur;
	this.sangDemandeur = sangDemandeur;
	this.bloodDesire = bloodDesire;
	this.telephoneDemandeur = telephoneDemandeur;
	this.mailDemandeur = mailDemandeur;
	this.villeDemandeur = villeDemandeur;
	this.hopital = hopital;
	this.villeHopital = villeHopital;
}


/**
 * Retourne le nom du demandeur
 * @return nomDemandeur
 */
public String getNomDemandeur() {
	return nomDemandeur;
}


/**
 * D�finit le nom du demandeur
 * @param nomDemandeut
 */
public void setNomDemandeur(String nomDemandeut) {
	this.nomDemandeur = nomDemandeut;
}


/**
 * Retourne le pr�nom du demandeur
 * @return prenomDemandeur
 */
public String getPrenomDemandeur() {
	return prenomDemandeur;
}


/**
 * D�finit le pr�nom du demandeur
 * @param prenomDemandeur
 */
public void setPrenomDemandeur(String prenomDemandeur) {
	this.prenomDemandeur = prenomDemandeur;
}


/**
 * Retourne le sexe du demandeur
 * @return sexeDemandeur
 */
public String getSexeDemandeur() {
	return sexeDemandeur;
}


/**
 * D�finit le sexe du demandeur
 * @param sexeDemandeur
 */
public void setSexeDemandeur(String sexeDemandeur) {
	this.sexeDemandeur = sexeDemandeur;
}


/**
 * Retourne l'�ge du demandeur
 * @return ageDemandeur
 */
public String getAgeDemandeur() {
	return ageDemandeur;
}


/**
 * D�finit l'�ge du demandeur
 * @param ageDemandeur
 */
public void setAgeDemandeur(String ageDemandeur) {
	this.ageDemandeur = ageDemandeur;
}


/**
 * Retourne le groupe sanguin du demandeur
 * @return sangDemandeur
 */
public String getSangDemandeur() {
	return sangDemandeur;
}


/**
 * D�finit le groupe sanguin du demandeur
 * @param sangDemandeur
 */
public void setSangDemandeur(String sangDemandeur) {
	this.sangDemandeur = sangDemandeur;
}


/**
 * Retourne le groupe sanguin recherch�
 * @return bloodDesire
 */
public String getBloodDesire() {
	return bloodDesire;
}


/**
 * D�finit le groupe sanguin recherch�
 * @param bloodDesire
 */
public void setBloodDesire(String bloodDesire) {
	this.bloodDesire = bloodDesire;
}


/**
 * Retourne le num�ro de t�l�phone du demandeur
 * @return telephoneDemandeur
 */
public String getTelephoneDemandeur() {
	return telephoneDemandeur;
}


/**
 * D�finit le num�ro de t�l�phone du demandeur
 * @param telephoneDemandeur
 */
public void setTelephoneDemandeur(String telephoneDemandeur) {
	this.telephoneDemandeur = telephoneDemandeur;
}

 
/**
 * Retourne l'adresse mail du demandeur
 * @return mailDemandeur
 */
public String getMailDemandeur() {
	return mailDemandeur;
}


/**
 * D�finit l'adresse mail du demandeur 
 * @param mailDemandeur
 */
public void setMailDemandeur(String mailDemandeur) {
	this.mailDemandeur = mailDemandeur;
}


/**
 * Retourne la ville de r�sidence du demandeur
 * @return villeDemandeur
 */
public String getVilleDemandeur() {
	return villeDemandeur;
}


/**
 * D�finit la ville de r�sidence du demandeur
 * @param villeDemandeur
 */
public void setVilleDemandeur(String villeDemandeur) {
	this.villeDemandeur = villeDemandeur;
}


/**
 * Retourne le lieu d'hospitalisation du malade
 * @return hopital
 */
public String getHopital() {
	return hopital;
}


/**
 * D�finit le lieu d'hospitalisation du malade
 * @param hopital
 */
public void setHopital(String hopital) {
	this.hopital = hopital;
}


/**
 * Retourne le nom de la ville o� se trouve l'hopital
 * @return
 */
public String getVilleHopital() {
	return villeHopital;
}


/**
 * D�finit le nom de la ville o� se trouve l'h�pital
 * @param villeHopital
 */
public void setVilleHopital(String villeHopital) {
	this.villeHopital = villeHopital;
}

}
  
 
