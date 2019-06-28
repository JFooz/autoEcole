package com.fooz.autoEcole.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class SeanceCode {

	private int seanceId;
	private LocalDate seanceDate;
	private LocalTime seanceHeure;
	private String lieu;
	private boolean estExamen;

	public SeanceCode() {
	}

	public SeanceCode(int seanceId, LocalDate seanceDate, LocalTime seanceHeure, String lieu, boolean estExamen) {
		super();
		this.seanceId = seanceId;
		this.seanceDate = seanceDate;
		this.seanceHeure = seanceHeure;
		this.lieu = lieu;
		this.estExamen = estExamen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SeanceCode [seanceId=");
		builder.append(this.seanceId);
		builder.append(", seanceDate=");
		builder.append(this.seanceDate);
		builder.append(", seanceHeure=");
		builder.append(this.seanceHeure);
		builder.append(", lieu=");
		builder.append(this.lieu);
		builder.append(", estExamen=");
		builder.append(this.estExamen);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.estExamen ? 1231 : 1237);
		result = prime * result + ((this.lieu == null) ? 0 : this.lieu.hashCode());
		result = prime * result + ((this.seanceDate == null) ? 0 : this.seanceDate.hashCode());
		result = prime * result + ((this.seanceHeure == null) ? 0 : this.seanceHeure.hashCode());
		result = prime * result + this.seanceId;
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
		SeanceCode other = (SeanceCode) obj;
		if (this.estExamen != other.estExamen) {
			return false;
		}
		if (this.lieu == null) {
			if (other.lieu != null) {
				return false;
			}
		} else if (!this.lieu.equals(other.lieu)) {
			return false;
		}
		if (this.seanceDate == null) {
			if (other.seanceDate != null) {
				return false;
			}
		} else if (!this.seanceDate.equals(other.seanceDate)) {
			return false;
		}
		if (this.seanceHeure == null) {
			if (other.seanceHeure != null) {
				return false;
			}
		} else if (!this.seanceHeure.equals(other.seanceHeure)) {
			return false;
		}
		if (this.seanceId != other.seanceId) {
			return false;
		}
		return true;
	}

	public int getSeanceId() {
		return this.seanceId;
	}

	public void setSeanceId(int seanceId) {
		this.seanceId = seanceId;
	}

	public LocalDate getSeanceDate() {
		return this.seanceDate;
	}

	public void setSeanceDate(LocalDate seanceDate) {
		this.seanceDate = seanceDate;
	}

	public LocalTime getSeanceHeure() {
		return this.seanceHeure;
	}

	public void setSeanceHeure(LocalTime seanceHeure) {
		this.seanceHeure = seanceHeure;
	}

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public boolean isEstExamen() {
		return this.estExamen;
	}

	public void setEstExamen(boolean estExamen) {
		this.estExamen = estExamen;
	}



}
