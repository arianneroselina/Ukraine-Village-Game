/* In dieser Klasse wird das dritte Spiel durchgeführt.
 * Hier muss der Spieler einige Begriffe und Bedeutungen in den richtigen Paaren anordnen.
 * Author : @Arianne.
 */
import java.util.Scanner;

public class Niveau3 {
	/* Hier werden die gebrauchte Variablen deklariert und initialisiert.
	 * Neue Instanzen für die Klasse SpielerInformation, ChortyziaDorf, und Scanner wird erzeugt.
	 */
	Scanner sc = new Scanner(System.in);
	SpielerInformation info = new SpielerInformation();
	ChortyziaDorf haupt = new ChortyziaDorf(info.getName());
	String d = haupt.getD();
	String s = haupt.getS();
	String g = haupt.getG();
	
	
	public void paareAnordnung() {
		// In dieser Methode wird das dritte Spiel angefangen.

		sc.nextLine();
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		System.out.println(g + "Komisch dass Sie hier sind. Niemand hat es jemals so weit geschafft.");
		sc.nextLine();
		System.out.println(g + "Es gibt aber noch ein Niveau, bevor Sie den Schatz bekommen.");
		sc.nextLine();
		System.out.println(g + "Hier müssen Sie die Begriffe und die Bedeutungen in den richtigen Paaren anordnen.\n\t\tKlingt einfach, oder?");
		System.out.println(g + "Sie brauchen nicht alle Wörter zu schreiben, sondern nur die Buchstaben in der vorne.");
		sc.nextLine();
		System.out.println(g + "Viel Glück!");
		sc.nextLine();
		
		System.out.println("NIVEAU 3 --- PAAREN ANORDNEN");
		
		/* Hier werden 3 Arrays (die Begriffe, die Bedeutungen, und die Schlüssel) deklariert und initialisiert.
		 * Sie sind schon in der richtigen Reihenfolge, zum Beispiel Okroschka ist die Kalte Supper mit Kwas
		 * z.B. begriff[0] hat die Antwort bedeutung[0], so ist der Schlüssel auch schlüssel[0].
		 */
		String[] begriff = 		{"Okroschka", "Nikitsky", "Donetsk", "Ukrainisisch", "Wyschiwanka Tag", "Arsenalnaja",
								"Russisch", "Ryshniki", "Taras Schewtschenko", "Hrywnja"};
		String[] bedeutung =	{"Kalte Suppe mit Kwas", "Name eines Gartens, wo der größesten Baum in Ukraine liegt",
								"Name einer Stadt in Ukraine", "Meist benutzte Sprache in West Ukraine",
								"Ein Fest für Unterstützung von alter Tradition der Kreation",
								"Der Ort, wo die tiefste U-Bahnstation in der Welt (105 m) liegt",
								"Meist benutzte Sprache in Ost und Süd Ukraine", "Ausgeschmückte Kleidung",
								"Der Name des berühmten Lyrikers", "Die Währung von Ukraine"};
		char[] schlüssel =		{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		
		/* Hier werden Variablen print, ch, save, und save2 deklariert und ihre Startwerte gegeben.
		 * Variablen print2, print3, index, und index2 werden deklariert.
		 */
		int print = 0;
		int print2, print3, index, index2;
		char ch = 'a'; //Character für die Printanweisung.
		String save = "";
		String save2 = "";
		
		//Hier werden neue Arrays deklariert.
		char[] antwort = new char[10];
		int[] array = new int[10];
		int[] array2 = new int[10];
		
		//In diesen Schleifen werden die 10 Fragen für das Spiel in zufälligen Reihenfolgen ausgegeben.
		do {
			/* Hier werden die zufällige Zahl geprüft, ob sie bevor schon erschienen hat oder nicht.
			* Es wird durch die Vergleichen zwischen Variablen index und index2
			* und Variablen save und save2 getan.
			*/
			do {
				index = (int)(Math.random()*10);
				index2 = (int)(Math.random()*10);
			} 
			while (save.contains(Integer.toString(index)) == true ||
					save2.contains(Integer.toString(index2)) == true);
			
			//Hier wird jede Zeile ausgegeben.
			if (index == 8 || index == 4) {
			System.out.println(print+1 + ". " + begriff[index] + "\t\t\t\t" + ch + ". " + bedeutung[index2]);
			}
			else {
				System.out.println(print+1 + ". " + begriff[index] + "\t\t\t\t\t" + ch + ". " + bedeutung[index2]);
			}
			//Hier werden die neue Reihenfolge in den beiden Arrays gespeichert.
			array[print] = index;
			array2[print] = index2;
			
			//In Variablen save und save2 werden die schon erscheinende Zahlen als String gespeichert.
			save = save + Integer.toString(index);
			save2 = save2 + Integer.toString(index2);
			ch++;
			print++;
		} while (print < begriff.length);
		
		//In diesen Schleifen werden die neue Schlüssel angeordnet.
		for (print2 = 0 ; print2 < 10 ; print2++) {
			for (print3 = 0 ; print3 < 10 ; print3++) {
				if (array[print2] == array2[print3]) {
					antwort[print2] = schlüssel[print3];
				}
			}
		}
		
		haupt.leben();
		System.out.println("\nAntworten =");
		
		/* Hier werden geprüft, ob die Antwort des Spielers richtig ist oder nicht.
		 * Die Antworten werden als Character gespeichert und sie werden mit den Character in Array verglichen.
		 * Wenn es falsche Antwort gibt, wird die Methode wenigerLeben aufgerufen.
		 */
		for (print2 = 0 ; print2 < 10 ; print2++) {
			System.out.println(print2+1 + ".");
			char a = sc.next().charAt(0); //Hier werden die Antwort des Spielers als Character gelesen.
			if (a == antwort[print2]) {
				System.out.println("Wow, richtig!");
				haupt.leben();
			}
			else {
				System.out.println("Oops! Sie haben falsch geantwortet.");
				haupt.minLeben(1);
				haupt.leben();
			}
		}
		
		sc.nextLine();
		sc.close();
		haupt.gewinnen();
	}
}
