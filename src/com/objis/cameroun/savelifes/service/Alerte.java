package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;

/**
 
 * La classe Alerte contient toutes les m�thodes li�es 
 * � l'envoi des alertes aux donneurs
 * @author Ngon Joel 
 * @date 21/09/2018
 */
public class Alerte {
	
	/**
	 * Cette m�thode traite les informations � envoyer 
	 * aux eventuels donneurs
	 * @param client
	 */
	public void affichAlerte(Demandeur client){
System.out.println(" \n" +
		"Une Alerte va �tre envoy�e � des donneurs de groupe sanguin " + client.getBloodDesire() + " \n" +
		"Le patient ayant besoin de donneurs se trouve intern� � l'h�pital " + client.getHopital() + " \n" +
		"Ledit h�pital se trouve dans la ville de " + client.getVilleHopital() + " \n" +
				" \n" +
				"Veuillez v�rifier ces informations et choisir une action  \n" +
				"R = Rectifier       A = Annuler Et Sortir       S = Suivant"); 
	}
	
	/**
	 * Cette m�thode permet la confirmation de l'envoi de notifications d'alertes 
	 * @param confirm
	 */
	public void confirmAlerte(Demandeur confirm){
		System.out.println("Une alerte a �t� envoy�e � de diff�rents donneurs  de groupes sanguin " + confirm.getBloodDesire() + " pr�sents � " + confirm.getVilleHopital() + " et ses environs \n" +
				"AUREVOIR  \n" +
				"===ONE REGISTER - ONE LIFE SAVE===");
	}

}	
