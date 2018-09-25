package com.objis.cameroun.savelifes.presentation;

import java.util.Scanner;

import com.objis.cameroun.savelifes.domaine.Demandeur;
import com.objis.cameroun.savelifes.domaine.Donneur;
import com.objis.cameroun.savelifes.service.Alerte;
import com.objis.cameroun.savelifes.service.Enregistrement;

/**
 * Cette classe contient toutes les instructions permettant l'interaction
 * du programme avec l'utilisateur
 * C'est la classe principale du programme   
 * @author Ngon Joel
 * @date 21/09/2018
 */
public class SaveLifes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Déclaration et initialisation des variables
		
		char choixUtilisateur;
		char reponseUser = 'C';
		char reponseClient = 'C';
		char decisionDemandeur = 'R';
		char terminer; 
		
		String nom = " ";
		String prenom = " ";
		String sexe = " ";
		String age = " ";
		String groupSang = " ";
		String groupeDesire = " ";
		String telephone = " ";
		String adresseMail = " ";
		String villeResidence = " ";
		String hopital = " ";
		String lieuHopital = " ";
		
		System.out.println("BIENVENU DANS SaveLifes, L'APPLICATION QUI VOUS PERMET DE SAUVER DES VIES \n" +
				"VOUS POUVEZ A PARTIR DE CETTE APPLICATION SAUVER DES VIES EN VOUS ENREGISTRANT EN TANT QUE DONNEURS DE SANG \n" +
				"OU EN ENVOYANT DES ALERTES DE DETRESSE A DE DONNEURS DE SANG PRESENTS DANS NOTRE BASE DE DONNEES  \n" +
				"  \n" +
				"En vous enregistrant vous pouvez sauver une vie  \n" +
				"En faisant un don de sang vous sauvez une vie \n" +
				"NOTRE SLOGAN:  \n" +
				"===ONE REGISTER - ONE LIFE SAVE===  \n" +
				"  \n" +
				"Veuillez faire un choix \n" +
				"1 = S'enregistrer en tant que donneur  \n" +
				"2 = Trouver un donneur");   
				
		choixUtilisateur = sc.nextLine().charAt(0);
		
		//Gestion du choix de l'option de l'utilisateur
		switch(choixUtilisateur)
		{	//Enregistrement comme donneur
			case '1':
			{	//Boucle pour corriger les informations entrées
				while(reponseUser == 'C')
				{
					System.out.println("Vous êtes sur le point de vous enregistrer en tant que donneur \n" +
							"Veuillez entrer votre nom:");
					nom = sc.nextLine();
				
					System.out.println("Veuillez entrer votre prenom:");
					prenom = sc.nextLine(); 
					
					System.out.println("Veuillez entrer votre sexe (M/F):");
					sexe = sc.nextLine(); 
				
					System.out.println("Veuillez entrer votre age:");
					age = sc.nextLine(); 
				
					System.out.println("Veuillez entrer votre groupe sanguin:");
					groupSang = sc.nextLine(); 
				
					System.out.println("Veuillez entrer votre numéro de téléphone:");
					telephone = sc.nextLine(); 
				
					System.out.println("Veuillez entrer votre adresse mail:");
					adresseMail = sc.nextLine(); 
				
					System.out.println("Veuillez entrer votre ville de résidence:");
					villeResidence = sc.nextLine();		 
				
					Donneur donneur = new Donneur(nom, prenom,sexe, age, groupSang, telephone, adresseMail, villeResidence);
					Enregistrement register = new Enregistrement();
					
					//Affichage des informations entrées par l'utilisateur
					register.affichDonneur(donneur);
					reponseUser = sc.nextLine().charAt(0);
				}
				switch(reponseUser)
				{	//Cas où l'utilisateur décide annuler les informations entrées
					case 'A':
					{
						System.out.println("MERCI AUREVOIR");
						break;
					}	//Cas où l'utilisateur décide "continuer"
					case 'S':
					{
						Donneur donneur = new Donneur(nom, prenom, sexe, age, groupSang, telephone, adresseMail, villeResidence);
						
						Enregistrement register = new Enregistrement();
						
						//Confirmation de la création du compte de l'utilisateur donneur
						register.confirmCreation(donneur);
						break;
					}
					default:
					{	//Cas où l'utilisateur entre un mauvais choix durant l'enregistrement
						System.out.println("DESOLE CE CHOIX N'EXISTE PAS");
					}
				}
				break;
			}
			//Recherche d'un donneur par l'utilisateur(demandeur) 
			case '2':
			{	
				System.out.println("VOUS ETES A LA RECHERCHE DE DONNEURS DE SANG  \n" +
					"Une notifiation leur sera envoyée \n" +
					" \n" +
					"Veuillez tout d'abord créer vous aussi votre compte SaveLives:" );
				//Boucle pour corriger les informations entrées
				while(reponseClient == 'C')
				{
					System.out.println("Veuillez entrer votre nom:");		
					nom = sc.nextLine();
				
					System.out.println("Veuillez entrer votre prénom:");
					prenom = sc.nextLine();
				
					System.out.println("Veuillez entrer votre sexe (M/F):");
					sexe = sc.nextLine();
				
					System.out.println("Veuillez entrer votre âge:");
					age = sc.nextLine();
				
					System.out.println("Veuillez entrer votre groupe sanguin: ");
					groupSang = sc.nextLine();
				
					System.out.println("Veuillez entrer votre numéro de téléphone:");
					telephone = sc.nextLine();
				
					System.out.println("Veuillez entrer votre adresse mail:");
					adresseMail = sc.nextLine();
				
					System.out.println("Veuillez indiquer votre ville de résidence:");
					villeResidence = sc.nextLine();
					
					Demandeur client = new Demandeur(nom, prenom,sexe, age, groupSang,  groupeDesire, telephone, adresseMail, villeResidence, hopital, lieuHopital);
					Enregistrement register = new Enregistrement();
					
					//Affichage des informations entrées par l'utilisateur(demandeur)
					register.affichDemandeur(client);
					
					reponseClient = sc.nextLine().charAt(0);
					
				}	
				switch(reponseClient)
				{	//Cas où l'utilisateur(demandeur) décide annuler les informations entrées
					case 'A':
					{
						System.out.println("MERCI AUREVOIR");
						break;
					}
					//Cas où l'utilisateur(demandeur) décide "continuer"
					case 'S':
					{	//Boucle pour corriger les informations relatives au malade
						while(decisionDemandeur == 'R')
						{
							System.out.println("A présent veuillez entrer le groupe sanguin que vous recherchez:");		
							groupeDesire = sc.nextLine();
						
							System.out.println("Veuillez entrer le nom de l'hôpital où se trouve le malade:");
							hopital = sc.nextLine();
						
							System.out.println("Veuillez préciser la ville où se trouve ledit hôpital: ");
							lieuHopital = sc.nextLine();
							
							Demandeur client = new Demandeur(nom, prenom,sexe, age, groupSang,  groupeDesire, telephone, adresseMail, villeResidence, hopital, lieuHopital);
							Alerte alerte = new Alerte();
					
							alerte.affichAlerte(client);
							decisionDemandeur = sc.nextLine().charAt(0);
							
						}
						//Cas où l'utilisateur(demandeur) d'annuler les informations relatives au malade
						if(decisionDemandeur == 'A')
						{	
							System.out.println("AUREVOIR");
						}
						//Cas où l'utilisateur(demandeur) decide poursuivre la procédure 
						else if(decisionDemandeur == 'S')
						{
							Demandeur client = new Demandeur(nom, prenom,sexe, age, groupSang,  groupeDesire, telephone, adresseMail, villeResidence, hopital, lieuHopital);
							Enregistrement register = new Enregistrement();
					
							register.confirmCompte(client);
							System.out.println("  \n" +
									"Taper Q pour terminer \n" +
									"Q = Terminer");
							terminer = sc.nextLine().charAt(0);
							if(terminer =='Q')
							{
								Alerte confirm = new Alerte();
								confirm.confirmAlerte(client);
							}
							
						}
						//Cas où l'utilisateur(demandeur) entre un choix qui n'existe pas
						else if(decisionDemandeur != 'C' && decisionDemandeur != 'A' && decisionDemandeur != 'S')
						{
							System.out.println("CE CHOIX N'EXISTE PAS!");
						}
						break;
					}
					//Cas où l'utilisateur(demandeur) entre un choix qui n'existe pas(reponseClient) 
					default:
					{
						System.out.println("DESOLE CE CHOIX N'EXISTE PAS");
					}
				}
				break;
			}
			//Cas où l'utilisateur(non spécifié) entre un choix d'option au menu qui n'existe pas(choix utilisateur)
			
			default:
			{
				System.out.println("DESOLE CE CHOIX N'EXISTE PAS  \n" +
					"AUREVOIR");
			}	
		};
	}
}
 

					