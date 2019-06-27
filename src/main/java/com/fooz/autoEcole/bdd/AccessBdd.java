package com.fooz.autoEcole.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fooz.autoEcole.entities.Client;

public class AccessBdd {

	//Variables qui permettent d'interagir avec la BDD
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	//Variables qui permettent de se connecter au serveur de la BDD
	private String user = "root";
	private String mdp = "root";
	final String url = "jdbc:mysql://localhost:3306/auto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	/**
	 *
	 * @return la liste de tous les clients depuis la BDD
	 */
	public List<Client> getAllClient() {

		List<Client> clientList = new ArrayList<>();

		try {
			//Chargement du Driver Mysql
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			//Paramètre et établit la connection
			this.connect = DriverManager.getConnection(this.url, this.user, this.mdp);

			//Création du Statement pour l'execution des requêtes
			this.statement = this.connect.createStatement();

			//Execute et stocke les résultats de la requête
			this.resultSet = this.statement.executeQuery("SELECT * FROM client");

			//Boucle pour parcourir le resultSet et instancier les objets clients, puis les ajouter à la liste
			while(this.resultSet.next()) {

				//Set les resultats de la requête dans les variables locales
				int id = this.resultSet.getInt("clientId");
				String nom = this.resultSet.getString("nom");
				String prenom = this.resultSet.getString("prenom");
				LocalDate dateNaissance = this.resultSet.getDate("dateNaissance").toLocalDate();
				String adresse = this.resultSet.getString("adresse");

				//Création du client et ajout dans la liste
				Client client = new Client(id, nom, prenom, adresse, dateNaissance);
				clientList.add(client);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {

			if (this.connect != null) {
				try {
					this.connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (this.statement != null) {
				try {
					this.statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (this.resultSet != null) {
				try {
					this.resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return clientList;
	}
}
