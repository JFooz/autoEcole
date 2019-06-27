package com.fooz.autoEcole;

import java.time.LocalDate;
import java.util.List;

import com.fooz.autoEcole.bdd.AccessBdd;
import com.fooz.autoEcole.entities.Client;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args ) {

		AccessBdd accessBdd = new AccessBdd();
		List<Client> clientList = accessBdd.getAllClient();
		for (Client client : clientList) {
			System.out.println(client.getNom()+ " "+ client.getPrenom());
		}

		LocalDate myDate = LocalDate.of(1965, 5, 5);
		Client client = new Client(0, "john", "doe", "n/a", myDate);
		accessBdd.addClient(client);
	}
}
