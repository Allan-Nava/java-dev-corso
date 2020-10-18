package main;

import java.util.Scanner;

public class GeometriaInput 
{
	public static void main(String[] args) 
	{
		// Chiedere all'utente come si chiama
		// Chiedere all'utente la misura della base e 
		// dell'altezza del rettangolo. 
		// Calcolare e stampare la misura dell'area
		
		// Dichiarazione
		
		Scanner tastiera;
		String nomeUtente;
		double baseRettangolo, area;
		int altezzaRettangolo;
		String risposta;
		
		// Inizializzazione
		
		tastiera = new Scanner(System.in);
		risposta = "";
		
		System.out.println("Come ti chiami?");
		
		nomeUtente =tastiera.nextLine();
		
		System.out.println("Ciao " + nomeUtente + " inserisci il valore della base in cm!");
		baseRettangolo = Double.parseDouble(tastiera.nextLine());
		
		System.out.println("La base del rettangolo � " + baseRettangolo + ". Inserisci il valore dell'altezza in cm!");
		altezzaRettangolo = Integer.parseInt(tastiera.nextLine());
		
		System.out.println("L'altezza del rettangolo � " + altezzaRettangolo);
		
		// Calcolo
		
		area = baseRettangolo * altezzaRettangolo;
		
		// Output
		
		risposta = "L'area del rettangolo di base " + baseRettangolo + " e altezza " + altezzaRettangolo + " �: " + area;
		
		System.out.println(risposta);
		
		// Chiudo ascolto input
		
		tastiera.close();
	}
}
