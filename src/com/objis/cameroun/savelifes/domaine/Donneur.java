package com.objis.cameroun.savelifes.domaine;

/**
 * La classe Donneur contient toutes les propri�t�s utilis�es
 * pour la gestion de l'utilisateur donneur de sang
 * @author Ngon Joel
 * @date 21/09/2018
 */
public class Donneur {
	//D�claration des variables
	String nomDonneur;
	String prenomDonneur;
	String sexeDonneur;
	String ageDonneur;
	String sangDonneur;
	String telephone;
	String adresseMail;
	String villeResidence;
	
	
	/**
	 * Constructeur de la classe Donneur avec param�tres
	 * @param nomDonneur
	 * @param prenomDonneur
	 * @param sexeDonneur
	 * @param ageDonneur
	 * @param sangDonneur
	 * @param telephone
	 * @param adresseMail
	 * @param villeResidence
	 */
	public Donneur(String nomDonneur, String prenomDonneur, String sexeDonneur,
			String ageDonneur, String sangDonneur, String telephone,
			String adresseMail, String villeResidence) {
		super();
		this.nomDonneur = nomDonneur;
		this.prenomDonneur = prenomDonneur;
		this.sexeDonneur = sexeDonneur;
		this.ageDonneur = ageDonneur;
		this.sangDonneur = sangDonneur;
		this.telephone = telephone;
		this.adresseMail = adresseMail;
		this.villeResidence = villeResidence;
	}

	
	/**
	 * Retourne le nom du donneur
	 * @return nomDonneur
	 */
	public String getNomDonneur() {
		return nomDonneur;
	}

	
	/**
	 * D�finit le nom du donneur
	 * @param nomDonneur
	 */
	public void setNomDonneur(String nomDonneur) {
		this.nomDonneur = nomDonneur;
	}

	
	/**
	 * Retourne le pr�nom du donneur
	 * @return prenomDonneur
	 */
	public String getPrenomDonneur() {
		return prenomDonneur;
	}

	
	/**
	 * D�finit le pr�nom du donneur
	 * @param prenomDonneur
	 */
	public void setPrenomDonneur(String prenomDonneur) {
		this.prenomDonneur = prenomDonneur;
	}

	
	/**
	 * Retourne le sexe du donneur
	 * @return sexeDonneur
	 */
	public String getSexeDonneur() {
		return sexeDonneur;
	}

	
	/**
	 * D�finit le sexe du donneur
	 * @param sexeDonneur
	 */
	public void setSexeDonneur(String sexeDonneur) {
		this.sexeDonneur = sexeDonneur;
	}

	
	/**
	 * Retourne l'�ge du donneur
	 * @return ageDonneur
	 */
	public String getAgeDonneur() {
		return ageDonneur;
	}

	
	/**
	 * D�finit l'�ge du donneur
	 * @param ageDonneur
	 */
	public void setAgeDonneur(String ageDonneur) {
		this.ageDonneur = ageDonneur;
	}

	
	/**
	 * Retourne le groupe sanguin du donneur
	 * @return
	 */
	public String getSangDonneur() {
		return sangDonneur;
	}

	
	/**
	 * D�finit le groupe sanguin du donneur
	 * @param sangDonneur
	 */
	public void setSangDonneur(String sangDonneur) {
		this.sangDonneur = sangDonneur;
	}
	
	
	/**
	 * Retourne le num�ro de t�l�phone du donneur
	 * @return telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	
	/**
	 * D�finit le num�ro de t�l�phone du donneur
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	/**
	 * Retourne l'adresse mail du donneur
	 * @return adresseMail
	 */
	public String getAdresseMail() {
		return adresseMail;
	}

	
	/**
	 * D�finit l'adresse mail du donneur
	 * @param adresseMail
	 */
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	
	/**
	 * Retourne la ville de r�sidence du donneur
	 * @return villeResidence
	 */
	public String getVilleResidence() {
		return villeResidence;
	}

	
	/**
	 * D�finit la la ville de r�sidence du donneur
	 * @param villeResidence
	 */
	public void setVilleResidence(String villeResidence) {
		this.villeResidence = villeResidence;
	}

}	
 
 
