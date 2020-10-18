package main;
import java.util.Scanner;

public class MutuoInput 
{
	public static void main(String[] args) 
	{
		// 1 - Chiedere a utente la misura delle stanze:
		//		- Camera da letto: quadrata
		//  	- Salotto: rettangolare
		//		- Bagno: quadrato
		// 2- Calcolare i mq
		// 3- Impostare un costo a mq e calcolare il costo totale del mutuo
		// 4- Stampare il costo totale e chiedere all'utente numero rate
		// 5- Stampare valore singola rata
		
		// Dichiarazione
		
		double latoSalotto1, latoSalotto2;
		double latoCamera;
		double latoBagno;
		double numRate;
		double valMq;
		double mqTot;
		
		// Cose da stampare
		
		double mutuo, rataMutuo;
		
		// Inizializzazione prime var
		
		Scanner tastiera = new Scanner(System.in);
		valMq = 3000;
		
		// Calcolo mq tot
		
		System.out.println("Calcoliamo quanto vale la tua casa, inserisci la lunghezza del lato della tua camera da letto quadrata:");
		latoCamera= Double.parseDouble(tastiera.nextLine());
		mqTot = (latoCamera * latoCamera);
		System.out.println("\n" + "La tua camera da letto misura " + (latoCamera * latoCamera) + " Mq.");
		
		System.out.println("\n" + "Passiamo al salotto rettangolare, inserisci la dimensione del primo lato");
		latoSalotto1= Double.parseDouble(tastiera.nextLine());
		System.out.println("\n" + "Inserisci il secondo lato del salotto rettangolare:");
		latoSalotto2= Double.parseDouble(tastiera.nextLine());
		mqTot += (latoSalotto1 * latoSalotto2);
		System.out.println("\n" + "Il tuo salotto misura " + (latoSalotto1 * latoSalotto2) + " Mq.");
		
		System.out.println("\n" + "Passiamo al bagno quadrato, inserisci la dimensione del lato");
		latoBagno= Double.parseDouble(tastiera.nextLine());
		mqTot += (latoBagno * latoBagno);
		System.out.println("\n" + "Il tuo bagno misura " + (latoBagno * latoBagno) + " Mq.");
		
		// Calcolo mutuo
		
		mutuo = mqTot * valMq;
		System.out.println("\n" + "La tua casa misura " + mqTot + " Mq. e vale in totale " + mutuo + "�" );
		
		// Calcolo rate
		
		System.out.println("\n" + "Inserisci ora il numero di rate in cui vuoi dividere il mutuo");
		numRate = Double.parseDouble(tastiera.nextLine());
		
		rataMutuo = mutuo / numRate;
		System.out.println("\n" + "Il costo di una rata �: " + rataMutuo + "�");
		
		// Chiudo lettura input
		
		tastiera.close();
	}
}
