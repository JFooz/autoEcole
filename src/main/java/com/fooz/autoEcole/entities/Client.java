package com.fooz.autoEcole.entities;

import java.time.LocalDate;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private LocalDate naissanceDate;

	public Client() {
	}

	public Client(int id, String nom, String prenom, String adresse, LocalDate dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.naissanceDate = dateNaissance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [id=");
		builder.append(this.id);
		builder.append(", nom=");
		builder.append(this.nom);
		builder.append(", prenom=");
		builder.append(this.prenom);
		builder.append(", adresse=");
		builder.append(this.adresse);
		builder.append(", naissanceDate=");
		builder.append(this.naissanceDate);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.adresse == null) ? 0 : this.adresse.hashCode());
		result = prime * result + this.id;
		result = prime * result + ((this.naissanceDate == null) ? 0 : this.naissanceDate.hashCode());
		result = prime * result + ((this.nom == null) ? 0 : this.nom.hashCode());
		result = prime * result + ((this.prenom == null) ? 0 : this.prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Client other = (Client) obj;
		if (this.adresse == null) {
			if (other.adresse != null) {
				return false;
			}
		} else if (!this.adresse.equals(other.adresse)) {
			return false;
		}
		if (this.id != other.id) {
			return false;
		}
		if (this.naissanceDate == null) {
			if (other.naissanceDate != null) {
				return false;
			}
		} else if (!this.naissanceDate.equals(other.naissanceDate)) {
			return false;
		}
		if (this.nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!this.nom.equals(other.nom)) {
			return false;
		}
		if (this.prenom == null) {
			if (other.prenom != null) {
				return false;
			}
		} else if (!this.prenom.equals(other.prenom)) {
			return false;
		}
		return true;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public LocalDate getNaissanceDate() {
		return this.naissanceDate;
	}

	public void setNaissanceDate(LocalDate naissanceDate) {
		this.naissanceDate = naissanceDate;
	}
}
