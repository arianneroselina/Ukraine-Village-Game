/* Diese Klasse ist das Beginn des Spiels. Hier werden das Intro und die Informationen über das Land gegeben.
 * Der Spieler kann wählen, ob er in Leicht, Mittel or Schwer spielen möchte.
 * Er muss auch entscheiden, ob er die Tage, wann er über Ukraine lernen kann, überspringen möchte oder nicht.
 * Author : @Arianne.
 */
import java.util.Scanner;

public class SpielerInformation {
	//Das Variable nam wird als static String deklariert.
	static String nam;
	static int count;
	Scanner sc = new Scanner(System.in); //Scanner für alle der Texteingaben.

	public void information() {
		/* In dieser Main Methode werden die Spieler Informationen von der Console gelesen.
		 * Neue Instanz für die Klasse Tages, Niveau1, Niveau2, und Niveau3 werden erzeugt.
		 */
		Tages tages = new Tages();
		Niveau1 niveau1 = new Niveau1();
		Niveau2 niveau2 = new Niveau2();
		Niveau3 niveau3 = new Niveau3(); 

		//Hier werden die Einleitung für das Game ausgegeben.
		System.out.println("Dorfhäuptling	: Laskawo Prosymo (Willkommen) in unserem ukrainischen Dorf, Chortyzia! Wie heißen Sie?");
		System.out.print("Sie		: ");
		nam = sc.next(); //Für das Lesen des Spielersnames.
		ChortyziaDorf haupt = new ChortyziaDorf(nam); //Eine neue Instanz für die Klasse ChortyziaDorf wird erzeugt.
		System.out.println(haupt.getD() + "Hallo " + getName() + "! Woher kommen Sie?");
		System.out.print(haupt.getS());
		String land = sc.next(); //Für das Lesen des Spielersherkunftland.
		System.out.println(haupt.getD() + "Ahh.. " + land + ". Schönes Land. Aber nicht so schön wie Ukraine!");

		sc.nextLine(); /*Dies wird verwendet, damit der Spieler 'Enter' drücken muss, um den nächsten Satz
		lesen zu können.*/
		System.out.println(haupt.getD() + "Und die Leute sind bestimmt nicht so großzügig wie in hier.");
		System.out.println("\nDrücken Sie 'Enter', um fortzufahren.");
		sc.nextLine();
		System.out.println(haupt.getD() + "Hier teilen wir unseren Schatz mit Ihnen, wenn Sie ihn finden können.");
		System.out.println(haupt.getD() + "Aber wenn Sie ihn nicht finden können, gibt es natürlich Konsequenzen!");
		sc.nextLine();
		System.out.println(haupt.getD() + "In welcher Schwierigkeitsgrad möchten Sie spielen? Leicht/Mittel/Schwer");
		System.out.print(haupt.getS());
		String spiel = sc.next();

		/* Hier werden geprüft, ob der Spieler leicht, mittel, oder schwer gewählt hat.
		 * Wenn leicht gewählt ist, dann ist leben gleich 10.
		 * Wenn mittel gewählt ist, dann ist leben gleich 5.
		 * Wenn schwer gewählt ist, dann ist leben gleich 3.
		 */
		if (spiel.equals("Schwer") || spiel.equals("schwer")) {
			haupt.setLeben(3);
			System.out.println(haupt.getD() + "Wow! Sind Sie sicher?");
			sc.nextLine();
		}
		else if (spiel.equals("Mittel") || spiel.equals("mittel")) {
			haupt.setLeben(5);
			System.out.println(haupt.getD() + "Hmm.. nur Mittel?");
			sc.nextLine();
		}
		else {
			if  (spiel.equals("Leicht") || spiel.equals("leicht")){
				System.out.println(haupt.getD() + "Was?! Leicht?");
			}
			else {
				//Wenn der Spieler nichts davon gewählt hat, dann wird leicht gewählt.
				System.out.println("*Sie haben nichts davon gewählt, deshalb machen wir es einfach für Sie.*");
				System.out.println(haupt.getD() + "Was?! Leicht?");
			}
			haupt.setLeben(10);
			sc.nextLine();
		}

		sc.nextLine();

		//Diese Schleife wird zur Reinigung der Console verwendet.
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}

		System.out.println(haupt.getD() + "Na gut lass uns los! Aber Sie müssen noch etwas wissen.");
		sc.nextLine();
		System.out.println(haupt.getD() + "Sie haben nur " + haupt.getLeben() + " Leben, das heißt Sie haben nur "
				+ haupt.getLeben() + " Chance, die Fragen falsch zu beantworten.");
		sc.nextLine();
		System.out.println(haupt.getD() + "Wenn Ihnen gehen die Leben aus, dann werden Sie töt sein!");
		sc.nextLine();
		System.out.println(haupt.getD() + "Einfach oder? :)");
		sc.nextLine();
		System.out.println(haupt.getD() + "Jetzt haben Sie 7 Tagen, hier zu wohnen, um unsere Kulturen zu verstehen."
				+ "\nALLES könnte wichtig sein, so erinnern Sie sich an jedes einzeilne Detail.");
		sc.nextLine();
		System.out.println("Glauben Sie, dass Sie genuge Kenntnisse über Ukraine haben?");
		System.out.println("Möchten Sie die 7 Tagen überspringen? Ja / Nein");
		String skip = sc.next();

		//Hier wird geprüft, ob der Spieler die Tage überspringen möchte oder nicht.
		if(skip.contentEquals("Ja") || skip.contentEquals("ja")) {
			System.out.println(haupt.getD() + "Genug sprechen. Ich werde Sie später sehen. Aufwiedersehen!");
			tages.achttenTag();
		}	
		else {
			if(skip.contentEquals("Nein") || skip.contentEquals("nein"))  {
				System.out.println(haupt.getD() + "Genug sprechen. Ich werde Sie später sehen. Aufwiedersehen!");
			}
			else {
				System.out.println("*Sie haben nichts davon gewählt, so überspringen Sie nicht.*");
				System.out.println(haupt.getD() + "Genug sprechen. Ich werde Sie später sehen. Aufwiedersehen!");
			}
			
			haupt.setClear(0);
			while (haupt.getClear() < 20) {
				System.out.println("");
				haupt.addClear(1);
			}
			
			haupt.leben();
			
			/* Hier werden die Wähle ausgegeben, damit der Spieler wählen kann, welches Thema er erfahren möchte.
			 * Author : @Brady.
			 */
			String dro = "";// Die schon gewählten Zahlen werden hier gespeichert.
			count = 0;
			System.out.println("\nWelches Thema möchten Sie heute lernen?");
			System.out.println("1. Essen");
			System.out.println("2. Interessante Fakten");
			System.out.println("3. Kleidung");
			System.out.println("4. Feiertage");
			System.out.println("5. Merkmale Gebäude");
			System.out.println("6. Literatur");
			System.out.println("7. Regierung und Städte");
			int ord = sc.nextInt();

			while (count < 7) {
				if (ord == 1 || ord == 2 || ord == 3 || ord == 4 || ord == 5 || ord == 6 || ord == 7) {
				dro = Integer.toString(ord) + ", " + dro;
				count++;
				}
				if(ord == 1) {
					tages.erstesThema();
				}
				else if( ord == 2) {
					tages.zweitesThema();
				}
				else if( ord == 3) {
					tages.drittesThema();
				}
				else if( ord == 4) {
					tages.viertesThema();
				}
				else if( ord == 5) {
					tages.fünftesThema();
				}
				else if( ord == 6) {
					tages.sechstesThema();
				}
				else if( ord == 7) {
					tages.siebtesThema();
				}
				if (count < 7) {
				do {
					System.out.println("\nWelches Thema möchten Sie heute lernen?");	
					sc.nextLine();
					System.out.println("1. Essen");
					System.out.println("2. Interessante Fakten");
					System.out.println("3. Kleidung");
					System.out.println("4. Feiertage");
					System.out.println("5. Merkmale Gebäude");
					System.out.println("6. Literatur");
					System.out.println("7. Regierung und Städte");
					System.out.println("Sie können nicht von den folgenden Thema wählen.");
					System.out.println(dro);
					ord = sc.nextInt();
				} while(dro.contains(Integer.toString(ord)));
				}
			}

			count++;
			tages.achttenTag();
		}

		//Diese Methoden (die Spiele) werden immer aufgerufen. 
		niveau1.auswahlFrage();
		niveau2.lückenText();
		niveau3.paareAnordnung();

		sc.close();

	}

	public String getName() {
		//Dieses Getter ist für die Ausgabe des Variables name.
		return nam;
	}
	
	public int getCount() {
		//Dieses Getter ist für die Ausgabe des Variables count.
		return count;
	}
}
