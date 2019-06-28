package com.fooz.autoEcole;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.fooz.autoEcole.bdd.AccessBdd;
import com.fooz.autoEcole.entities.Client;
import com.fooz.autoEcole.entities.SeanceCode;

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


		List<SeanceCode> seanceCodeList = accessBdd.getAllSeanceCode();
		for (SeanceCode seanceCode : seanceCodeList) {
			System.out.println(seanceCode.getSeanceId()+ " "+ seanceCode.getLieu()+" "+ seanceCode.getSeanceDate()+" "+ seanceCode.getSeanceHeure());
		}

		LocalDate myDateSeance = LocalDate.of(2019, 6, 5);
		LocalTime myTimeSeance = LocalTime.of(11, 30);
		SeanceCode seanceCode = new SeanceCode(0, myDateSeance, myTimeSeance, "Tokyo", false);
		accessBdd.addSeanceCode(seanceCode);
	}
}
