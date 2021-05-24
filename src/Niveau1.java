/* In dieser Klasse muss der Spieler f�nf zuf�llige Auswahlfragen richtig beantworten.
 * Author : @Brady.
 */
import java.util.Scanner;

public class Niveau1 {
	/* Hier werden die gebrauchte Variablen deklariert und initialisiert.
	 * Neue Instanzen f�r die Klasse SpielerInformation, ChortyziaDorf, und Scanner wird erzeugt.
	 */
	Scanner sc = new Scanner(System.in); 
	SpielerInformation info = new SpielerInformation();
	ChortyziaDorf haupt = new ChortyziaDorf(info.getName());
	String d = haupt.getD();
	String s = haupt.getS();
	String g = haupt.getG();
	
	public void auswahlFrage() {
		/*Hier werden 5 aus 7 Fragen ausgew�hlt und in zuf�llige Ordnung gegeben.
		 * Durch eine int variable, die eine zuf�llige Wert haben, wird eine Frage gew�hlt.
		 * In der do - while Methode, wird diese Zahl durch toString gespeichert als 
		 * eine String variable, damit derselbe Frage nicht wiederholt.
		 */
		sc.nextLine();
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		System.out.println(g + "Hallo, ich bin der H�hlegeist.");
		sc.nextLine();
		System.out.println(g + "In dieser H�hle wird deine Kenntnisse �ber Ukraine erprobt.");
		sc.nextLine();
		System.out.println(g + "Hier m�ssen Sie die richtige Antwort f�r 5 Frage gew�hlt.");
		sc.nextLine();
		System.out.println(g + "Wenn Sie richtig antworten, dann ......");
		sc.nextLine();
		System.out.println(g + "wird nichts passiert.");
		sc.nextLine();
		System.out.println(g + "Aber wenn Sie falsche Antwort geben, dann ....");
		sc.nextLine();
		System.out.println(g + "werden Sie eine schlechte Zeit haben. \n\t\tAlso, Ihr Leben wird verringern.");
		sc.nextLine();
		System.out.println(g + "Viel Gl�ck!");
		sc.nextLine();

		haupt.leben();
		
		System.out.println("NIVEAU 1 --- AUSWAHLFRAGE");
		
		String lhaw = "";//Die schon gegebenen Zahlen werden hier gespeichert.
		int count = 1;
		int wahl = (int)(7 * Math.random() + 1);//Die zuf�llige Zahl.
		
		//Schleifen f�r die f�nf zuf�lligen Ausgeben der Fragen.
		do {
			lhaw = Integer.toString(wahl) + lhaw; //Hier werden die schon benutzten Zahlen gespeichert.
			System.out.print(count + ". ");
			if(wahl == 1) {
				System.out.println("Welche ist eine Gem�sesuppe von Ukraine?");
				System.out.println("a. Rendang \t\t\t b. Borschtsch \nc. Okroschka \t\t\t d. Holodets");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw1 = sc.next(); //Scanner f�r das Lesen der Antwort.
				//If-Anweisung f�r Pr�fen, ob die Antwort richtig ist oder nicht.
				if(anw1.equals("b")) {
					System.out.println("Richtig, Sie sind nicht dumm.");
					haupt.leben();
				}
				else { 	
					System.out.println("Richtig");
					sc.nextLine();
					System.out.println("Ah, es tut mir leid. Ich habe 'falsch' gemeint.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}else if(wahl==2) {
				System.out.println("Welche Vorwahl hat Ukraine?");
				System.out.println("a. +38 \t\t\t b. +83 \nc. +338 \t\t d. +387");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw2 = sc.next();
				if(anw2.equals("a")) {
					System.out.println("Richtig. Auf geht's die N�chste.");
					haupt.leben();
				}else {
					System.out.println("Falsch, ich bin sehr stolz auf Sie.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}else if(wahl==3) {
				System.out.println("Die Kleidung von M�nner in Ukraine ist �hnlich wie andere ______ L�nder");
				System.out.println("a. russich \t\t\t b. deutsch \nc. slavisch	\t\t d. amerikanisch");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw3 = sc.next();
				if (anw3.equals("c")){
					System.out.println("Richtig. Warum antworten Sie diese Frage richtig?");
					haupt.leben();
				}
				else {
					System.out.println("Sie haben falsch geantwortet. Gib mir Ihr Leben.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}else if(wahl==4) {
				System.out.println("Welche ist ein ukrainishcer Feiertag");
				System.out.println("a. Kupala Tag \t\t\t b. Weihnachten \nc. Halloween \t\t\t d. Nyepi");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw4 = sc.next();
				if(anw4.equals("a")) {
					System.out.println("Richtig, schade.");
					haupt.leben();
				}else {
					System.out.println("Falsch. Sag 'Tschuss' zu deinem Leben.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}else if(wahl==5) {
				System.out.println("Aus welchem Fluss stammt die Quelle Paniya?");
				System.out.println("a. Nil \t\t\t b. Thames \nc. Kapuas \t\t d. Auzun - Uzen");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw5 = sc.next();
				if(anw5.equals("d")) {
					System.out.println("Leider ist Ihre Antwort richtig.");
					haupt.leben();
				}else {
					System.out.println("Ups! Ich denke, dass eines Ihrer Leben verschwindet.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}else if(wahl==6) {
				System.out.println("Welche ist ein ukrainischer Philosoph?");
				System.out.println("a. Socrates \t\t\t b. Gregory Skovoroda \nc. Ivan Marchuk \t\t d. Aristotle");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw6 = sc.next();
				if(anw6.equals("b")) {
					System.out.println("Richtig. Ich werde erwarten, wann Sie falsch antworten.");
					haupt.leben();
				}else {
					System.out.println("HAHAHA, vielleicht hast du falsch getippt.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}else if(wahl==7) {
				System.out.println("Was ist die Hauptstadt von Ukraine");
				System.out.println("a. Dnipro \t\t\t b. Lviv \nc. Odesa \t\t\t d. Kyiv");
				System.out.println("Tippen Sie Ihre Antwort ein:");
				String anw7 = sc.next();
				if(anw7.equals("d")) {
					System.out.println("Ich bin sehr traurig, ack, ich meine, gl�cklich, wenn Sie richtig antworten.");
					haupt.leben();
				}else {
					System.out.println("Richtig,");
					sc.nextLine();
					System.out.println("wird ich nicht sagen, weil Sie falsch geantwortet haben.");
					haupt.minLeben(1);
					haupt.leben();
				}
			}
				count++;
	
			/* Hier wird das Programm �berpr�ft, ob die neue zuf�llige Zahl schon 
			 * gegeben oder nicht ist.
	  		 */
			do {
				wahl = (int)(7 * Math.random() + 1);
			}while(lhaw.contains(Integer.toString(wahl)));
			
		}while(count <= 5);
		
	}
}
