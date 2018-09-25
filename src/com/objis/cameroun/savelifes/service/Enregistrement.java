package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;
import com.objis.cameroun.savelifes.domaine.Donneur;

/**
 * @author Ngon Joel
 * @date 21/09/2018
 * Cette classe contient toutes les m�thodes li�es � l'enregitrement des utilisateurs
 *
 */
public class Enregistrement {

	/**
	 * Cette m�thode traite les informations d'enregistrement 
	 * et permet leur v�rification avant enregistrement
	 * @param affiche
	 */
	public void affichDonneur(Donneur affiche){
		System.out.println(" \n" +
				"Les informations que vous venez d'entrer sont les suivantes:  \n" +
				"NOM: " + affiche.getNomDonneur() +  " \n" +
				"PRENOM: " + affiche.getPrenomDonneur() + " \n" +
				"SEXE: " + affiche.getSexeDonneur() + " \n" +
				"AGE: "	 + affiche.getAgeDonneur() + " ans  \n" +
				"GROUPE SANGUIN: " + affiche.getSangDonneur() + " \n" +
				"NUMERO DE TELEPHONE: " + affiche.getTelephone() + " \n" +						
				"ADRESSE MAIL: " + affiche.getAdresseMail() + " \n" +
				"FILLE DE RESIDENCE: " + affiche.getVilleResidence() + " \n" +
				" \n" );
		System.out.println("Veuillez les v�rifier et choisir: \n " +
				"C = Corriger      A = Annuler et Sortir     S = Suivant      ");
	}
	
	
	/**
	 * Cette m�thode g�n�re le nom d'utilisateur 
	 * du donneur
	 * @param affiche
	 * @return user
	 */ 
	public String userName(Donneur affiche){
		String prefixe = "don.";
		String surfixe = "@save";
		
		String user = prefixe + affiche.getNomDonneur().substring(0,3) + surfixe;
		return user;
	}
	
	/**
	 * Cette m�thode confirme l'ouverture du compte du donneur 
	 * et affiche les parametres du compte
	 * @param creation
	 * @param demande
	 */
	public void confirmCreation(Donneur creation){
		
		String compte = userName(creation);
		System.out.println("VOS INFORMATIONS ONT ETE ENREGISTREES AVEC SUCCES \n " +
				"Votre compte a �t� activ� avec succ�s \n" +
				" \n" +
				"VOTRE NOM D'UTILISATEUR EST: \n" +
				"USERNAME: " + compte + "  \n" +
				"  \n" +
				"Vous pouvez d�s maintenant recevoir des notifications d'alertes de personnes ayant besoin d'un don de sang  \n" +
				"Bien vouloir les contacter par le num�ro qui s'affichera au bas de la notification \n" +
				" \n" +
				"NB: TOUT DON DE SANG SE FAIT TROIS MOIS APRES LE DERNIER DON \n" +
				"(Bien vouloir respecter cette m�sure. Votre sant� en d�pend !!!)  \n" +
				" \n" +
				"EN FAISANT UN DON DE SANG VOUS SAUVEZ UNE VIE \n" +
				"		===ONE REGISTER - ONE LIFE SAVE==="); 		
	}
	
	/**
	 * Cette m�thode traite les informations d'enregistrement du demandeur
	 * et permet leur v�rification par celui - ci
	 * @param affiche
	 */
	public void affichDemandeur(Demandeur affiche){
		System.out.println(" \n" +
				"Les informations que vous venez d'entrer sont les suivantes:  \n" +
				"NOM: " + affiche.getNomDemandeur() +  " \n" +
				"PRENOM: " + affiche.getPrenomDemandeur() + " \n" +
				"SEXE: " + affiche.getSexeDemandeur() + " \n" +
				"AGE: "	 + affiche.getAgeDemandeur() + " ans  \n" +
				"GROUPE SANGUIN: " + affiche.getSangDemandeur() + " \n" +
				"NUMERO DE TELEPHONE: " + affiche.getTelephoneDemandeur() + " \n" +						
				"ADRESSE MAIL: " + affiche.getMailDemandeur() + " \n" +
				"FILLE DE RESIDENCE: " + affiche.getVilleDemandeur()); 
				
		System.out.println("Veuillez v�rifier ces informations et choisir une action: \n " +
				"C = Corriger        A = Annuler Et Sortir        S = Suivant      \n" +
				" \n");
	}
	
	/**
	 * Cette m�thode g�n�re le nom d'utilisateur
	 * du demandeur
	 * @param affiche
	 * @return user
	 */ 
	public String userName(Demandeur affiche){
		String prefixe = "don.";
		String surfixe = "@save";
		
		String user = prefixe + affiche.getNomDemandeur().substring(0,3) + surfixe;
		return user;
	}
	
	/**
	 * Cette m�thode confirme l'ouverture du compte demandeur
	 * et affiche ses parametres de compte
	 * @param creation
	 * @param demande
	 */
	public void confirmCompte(Demandeur creation){
		
		String compte = userName(creation);
		System.out.println("VOS INFORMATIONS ONT ETE ENREGISTREES AVEC SUCCES \n " +
				"Votre compte a �t� activ� avec succ�s \n" +
				" \n" +
				"VOTRE NOM D'UTILISATEUR EST: \n" +
				"USERNAME: " + compte + "  \n" +
				"  \n" +
				"Vous pouvez d�s maintenant recevoir des notifications d'alertes de personnes ayant besoin d'un don de sang  \n" +
				"Bien vouloir les contacter par le num�ro qui s'affichera au bas de la notification \n" +
				" \n" +
				"NB: TOUT DON DE SANG SE FAIT TROIS MOIS APRES LE DERNIER DON \n" +
				"(Bien vouloir respecter cette m�sure. Votre sant� en d�pend !!!)  \n" +
				" \n" +
				"EN FAISANT UN DON DE SANG VOUS SAUVEZ UNE VIE \n" +
				"===ONE REGISTER - ONE LIFE SAVE===");		 		
	}
}	
