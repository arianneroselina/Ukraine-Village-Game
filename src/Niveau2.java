/* In dieser Klasse werden Lückentexte über Ukraine gegeben.
 * Author : @Sofia.
 */
import java.util.Scanner;
/* Hiermit öffen wir Scanner,damit wir den Text eingeben können
 * In dieser Klasse werden Dialogen von Dorfhäuptling ausgegeben, Fragen bezüglich angegebene hauptrmation gestellt
 * und Text-Art als das Ergebnis von gesammelte Punkte ausgegeben */

public class Niveau2 {
	/* Hier werden die gebrauchte Variablen deklariert und initialisiert.
	 * Neue Instanzen für die Klasse SpielerInformation, ChortyziaDorf, und Scanner wird erzeugt.
	 */
	Scanner sc = new Scanner(System.in);
	SpielerInformation info = new SpielerInformation();
	ChortyziaDorf haupt = new ChortyziaDorf(info.getName());
	String d = haupt.getD();
	String s = haupt.getS();
	String g = haupt.getG();

	public void lückenText() {

		sc.nextLine();
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}

		System.out.println(g + "Woah Sie haben ziemlich gut gemacht!");
		sc.nextLine();
		System.out.println(g + "In diesem Niveau müssen Sie einige Lückentexte ausfüllen.");
		sc.nextLine();
		System.out.println(g + "Dieselbe Regel gilt auch hier. Ich hoffe, Sie erinnern noch an allen der Hauptinformationen, die Sie gelernt haben.");
		sc.nextLine();
		System.out.println(g + "Viel Glück!");
		sc.nextLine();

		haupt.leben();
		
		System.out.println("NIVEAU 2 --- LÜCKENTEXT");
		
		//Print-Anweisung mit dem Text von der Frage
		System.out.print("1. ______ Schewtschenko ist der berühmteste und bedeutendste ukrainische Lyriker und war auch als maler bekannt. "
				+"\nSeine Poesie hat stark moderne ukrainische Sprache beeindruckt und entwickelt. ");
		String lyriker = sc.next(); //Hier wird eine Variable deklariert und Wert von der Eingabe des Spielers gegeben.
		
		/* Wenn die Antwort in der Variable gleich mit dem Wort in Klammern ist, dann ist es richtig.
		 * Wenn nicht, dann ist es falsch.
		 */
		if(lyriker.equals("Taras") || lyriker.equals("taras")){
			System.out.println("Wow! Ihre Antwort ist richtig.");
			haupt.leben();
		}
		else {
			System.out.println("Kein Wunder, es ist falsch.");
			haupt.minLeben(1);
			haupt.leben();
		}

		System.out.println("2. ______ ist eine belibigste Vorspeise ukrainischer Küche und ist mit viel Knoblauch gemacht");
		String vorspeise = sc.next();
		if(vorspeise.equals("Speck") || vorspeise.equals("speck")) {
			System.out.println("Hmm.. haben Sie irgendwo die Antwort gesehen? Es ist richtig.");
			haupt.leben();
		}
		else {
			System.out.println("Die Antwort ist LEIDER falsch.");
			haupt.minLeben(1);
			haupt.leben();
		}

		System.out.println("3. Die Natur der Ukraine ist sehr vielseitig. Es gibt sogar ein Canyon in ______");
		String canyon = sc.next();
		if(canyon.equals("Crimea") || canyon.equals("crimea")) {
			System.out.println("Richtig, Sie sind nicht dumm.");
			haupt.leben();
		}	
		else {
			System.out.println("Wollen Sie sterben?");
			haupt.minLeben(1);
			haupt.leben();
		}

		System.out.println("4. ______ ist ein traditionelles Fest am Ende des Winters, das eine Woche dauert"
				+ "und während welcher werden auch Pfankuchen gerne gegessen");
		String fest = sc.next();
		if(fest.equals("Masleniza") || fest.equals("masleniza")) {
			System.out.println("Gut, richtig.");
			haupt.leben();
		}
		else {
			System.out.println("Sie haben falsch antwortet. Gib mir Ihr Leben.");
			haupt.minLeben(1);
			haupt.leben();
		}

		System.out.println("5. Das Gericht, ______, ist ein gekochtes Fleisch im Brühegelee.");
		String gericht = sc.next();
		if(gericht.equals("Holodets") || gericht.equals("holodets")) {
			System.out.println("Richtig. Ich werde erwarten, wann Sie falsch antworten.");
			haupt.leben();
		}
		else {
			System.out.println("Falsch, ich bin sehr stolz auf Sie.");
			haupt.minLeben(1);
			haupt.leben();
		}

		System.out.println("6. Der geografische _______ Europas liegt in der Ukraine. Was liegt da?");
		String mitte = sc.next();
		if(mitte.equals("Mittelpunkt") || mitte.equals("mittelpunkt")) {
			System.out.println("Warum haben Sie richtig geantwortet?");
			haupt.leben();
		}
		else {
			System.out.println("HAHAHA, vielleicht hast du falsch getippt.");
			haupt.minLeben(1);
			haupt.leben();
		}

		System.out.println("7. Die Farben von ukrainischer Flagge sind ganz einfach. Die sind Gelb und ______");
		String flagge = sc.next();
		if(flagge.equals("Blau") || flagge.equals("blau")){
			System.out.println("Richtig, schade.");
			haupt.leben();
		}
		else {
			System.out.println("Sie sind nicht so schlau, oder?");
			haupt.minLeben(1);
			haupt.leben();
		}
	}

}
