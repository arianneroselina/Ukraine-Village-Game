/* Diese Klasse ist das Beginn des Spiels. Hier werden das Intro und die Informationen �ber das Land gegeben.
 * Der Spieler kann w�hlen, ob er in Leicht, Mittel or Schwer spielen m�chte.
 * Er muss auch entscheiden, ob er die Tage, wann er �ber Ukraine lernen kann, �berspringen m�chte oder nicht.
 * Author : @Arianne.
 */
import java.util.Scanner;

public class SpielerInformation {
	//Das Variable nam wird als static String deklariert.
	static String nam;
	static int count;
	Scanner sc = new Scanner(System.in); //Scanner f�r alle der Texteingaben.

	public void information() {
		/* In dieser Main Methode werden die Spieler Informationen von der Console gelesen.
		 * Neue Instanz f�r die Klasse Tages, Niveau1, Niveau2, und Niveau3 werden erzeugt.
		 */
		Tages tages = new Tages();
		Niveau1 niveau1 = new Niveau1();
		Niveau2 niveau2 = new Niveau2();
		Niveau3 niveau3 = new Niveau3(); 

		//Hier werden die Einleitung f�r das Game ausgegeben.
		System.out.println("Dorfh�uptling	: Laskawo Prosymo (Willkommen) in unserem ukrainischen Dorf, Chortyzia! Wie hei�en Sie?");
		System.out.print("Sie		: ");
		nam = sc.next(); //F�r das Lesen des Spielersnames.
		ChortyziaDorf haupt = new ChortyziaDorf(nam); //Eine neue Instanz f�r die Klasse ChortyziaDorf wird erzeugt.
		System.out.println(haupt.getD() + "Hallo " + getName() + "! Woher kommen Sie?");
		System.out.print(haupt.getS());
		String land = sc.next(); //F�r das Lesen des Spielersherkunftland.
		System.out.println(haupt.getD() + "Ahh.. " + land + ". Sch�nes Land. Aber nicht so sch�n wie Ukraine!");

		sc.nextLine(); /*Dies wird verwendet, damit der Spieler 'Enter' dr�cken muss, um den n�chsten Satz
		lesen zu k�nnen.*/
		System.out.println(haupt.getD() + "Und die Leute sind bestimmt nicht so gro�z�gig wie in hier.");
		System.out.println("\nDr�cken Sie 'Enter', um fortzufahren.");
		sc.nextLine();
		System.out.println(haupt.getD() + "Hier teilen wir unseren Schatz mit Ihnen, wenn Sie ihn finden k�nnen.");
		System.out.println(haupt.getD() + "Aber wenn Sie ihn nicht finden k�nnen, gibt es nat�rlich Konsequenzen!");
		sc.nextLine();
		System.out.println(haupt.getD() + "In welcher Schwierigkeitsgrad m�chten Sie spielen? Leicht/Mittel/Schwer");
		System.out.print(haupt.getS());
		String spiel = sc.next();

		/* Hier werden gepr�ft, ob der Spieler leicht, mittel, oder schwer gew�hlt hat.
		 * Wenn leicht gew�hlt ist, dann ist leben gleich 10.
		 * Wenn mittel gew�hlt ist, dann ist leben gleich 5.
		 * Wenn schwer gew�hlt ist, dann ist leben gleich 3.
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
				//Wenn der Spieler nichts davon gew�hlt hat, dann wird leicht gew�hlt.
				System.out.println("*Sie haben nichts davon gew�hlt, deshalb machen wir es einfach f�r Sie.*");
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

		System.out.println(haupt.getD() + "Na gut lass uns los! Aber Sie m�ssen noch etwas wissen.");
		sc.nextLine();
		System.out.println(haupt.getD() + "Sie haben nur " + haupt.getLeben() + " Leben, das hei�t Sie haben nur "
				+ haupt.getLeben() + " Chance, die Fragen falsch zu beantworten.");
		sc.nextLine();
		System.out.println(haupt.getD() + "Wenn Ihnen gehen die Leben aus, dann werden Sie t�t sein!");
		sc.nextLine();
		System.out.println(haupt.getD() + "Einfach oder? :)");
		sc.nextLine();
		System.out.println(haupt.getD() + "Jetzt haben Sie 7 Tagen, hier zu wohnen, um unsere Kulturen zu verstehen."
				+ "\nALLES k�nnte wichtig sein, so erinnern Sie sich an jedes einzeilne Detail.");
		sc.nextLine();
		System.out.println("Glauben Sie, dass Sie genuge Kenntnisse �ber Ukraine haben?");
		System.out.println("M�chten Sie die 7 Tagen �berspringen? Ja / Nein");
		String skip = sc.next();

		//Hier wird gepr�ft, ob der Spieler die Tage �berspringen m�chte oder nicht.
		if(skip.contentEquals("Ja") || skip.contentEquals("ja")) {
			System.out.println(haupt.getD() + "Genug sprechen. Ich werde Sie sp�ter sehen. Aufwiedersehen!");
			tages.achttenTag();
		}	
		else {
			if(skip.contentEquals("Nein") || skip.contentEquals("nein"))  {
				System.out.println(haupt.getD() + "Genug sprechen. Ich werde Sie sp�ter sehen. Aufwiedersehen!");
			}
			else {
				System.out.println("*Sie haben nichts davon gew�hlt, so �berspringen Sie nicht.*");
				System.out.println(haupt.getD() + "Genug sprechen. Ich werde Sie sp�ter sehen. Aufwiedersehen!");
			}
			
			haupt.setClear(0);
			while (haupt.getClear() < 20) {
				System.out.println("");
				haupt.addClear(1);
			}
			
			haupt.leben();
			
			/* Hier werden die W�hle ausgegeben, damit der Spieler w�hlen kann, welches Thema er erfahren m�chte.
			 * Author : @Brady.
			 */
			String dro = "";// Die schon gew�hlten Zahlen werden hier gespeichert.
			count = 0;
			System.out.println("\nWelches Thema m�chten Sie heute lernen?");
			System.out.println("1. Essen");
			System.out.println("2. Interessante Fakten");
			System.out.println("3. Kleidung");
			System.out.println("4. Feiertage");
			System.out.println("5. Merkmale Geb�ude");
			System.out.println("6. Literatur");
			System.out.println("7. Regierung und St�dte");
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
					tages.f�nftesThema();
				}
				else if( ord == 6) {
					tages.sechstesThema();
				}
				else if( ord == 7) {
					tages.siebtesThema();
				}
				if (count < 7) {
				do {
					System.out.println("\nWelches Thema m�chten Sie heute lernen?");	
					sc.nextLine();
					System.out.println("1. Essen");
					System.out.println("2. Interessante Fakten");
					System.out.println("3. Kleidung");
					System.out.println("4. Feiertage");
					System.out.println("5. Merkmale Geb�ude");
					System.out.println("6. Literatur");
					System.out.println("7. Regierung und St�dte");
					System.out.println("Sie k�nnen nicht von den folgenden Thema w�hlen.");
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
		niveau2.l�ckenText();
		niveau3.paareAnordnung();

		sc.close();

	}

	public String getName() {
		//Dieses Getter ist f�r die Ausgabe des Variables name.
		return nam;
	}
	
	public int getCount() {
		//Dieses Getter ist f�r die Ausgabe des Variables count.
		return count;
	}
}
