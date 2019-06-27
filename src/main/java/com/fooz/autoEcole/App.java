package com.fooz.autoEcole;

import java.time.LocalDateTime;
import java.util.List;

import com.fooz.autoEcole.bdd.AccessBdd;
import com.fooz.autoEcole.entities.Client;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);

		AccessBdd accessBdd = new AccessBdd();
		List<Client> clientList = accessBdd.getAllClient();
		for (Client client : clientList) {
			System.out.println(client.getNom()+ " "+ client.getPrenom());
		}


	}
}
