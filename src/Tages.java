//In dieser Klasse werden die Informationen �ber Ukraine an jeden Tagen ausgegeben.
import java.util.Scanner;

public class Tages {
	//Neue Instanzen f�r die Klasse SpielerInformation, ChortyziaDorf, und Scanner wird erzeugt.
	Scanner sc = new Scanner(System.in);
	SpielerInformation info = new SpielerInformation();
	ChortyziaDorf haupt = new ChortyziaDorf(info.getName());
	//Die Variabeln d und s werden die Werte von getD und getS deklariert und initialisiert.
	String d = haupt.getD();
	String s = haupt.getS();
	
	public void erstesThema() {
		/* Hier werden die Informationen �ber ukrainische Essen (1. TAG) berichtet.
		 * Author : @Arianne.
		 */
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben(); //Die Anzahl des Spielerslebens wird ausgegeben durch den Aufruf dieser Methode.
		
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println(s + "Hmm schon morgen.");
		sc.nextLine();
		System.out.println("*Sie stehen auf und sehen eine Suppe auf dem Tisch. Sie lesen eine Notiz daneben*");
		System.out.println("'Essen Sie das Okroschka'");
		sc.nextLine();
		System.out.println(s + "Hmm.. In dieser Suppe gibt es bestimmt Kwas! Sehr lecker. Aber warum ist es kalt?");
		sc.nextLine();
		System.out.println(d + "Hallo, " + info.getName() + ". So, heute ist das Thema Essen. Wie gef�llt Ihnen unseres Okroschka?");
		sc.nextLine();
		System.out.println(d + "Keine Antwort ben�tigt, es ist bestimmt lecker! Eine Besonderheit der ukrainischen K�chen ist"
							+ " die Vielfalt der verwendeten Lebensmittel.");
		sc.nextLine();
		System.out.println(d + "Jetzt, hier ist das zweite Essen.");
		sc.nextLine();
		System.out.println(s + "Andere Suppe? Und WOW was ist das?");
		sc.nextLine();
		System.out.println(d + "Das ist Speck von Schweine mit Knoblauch und Borschtsch Gem�se Suppe mit Roter Bete!"
							+ " Unsere beliebste traditionelle Essen.");
		System.out.println(d + "Sie sind normalerweise zusammen serviert. Manchmal auch mit schwarzem Brot.");
		sc.nextLine();
		System.out.println(s + "Wie interessant..");
		sc.nextLine();
		System.out.println(d + "Und hier Ihres letzte Essen. Holodets!");
		System.out.println(d + "Ein gekochtes..");
		sc.nextLine();
		System.out.println(s + "Fleisch im Br�hegelee, oder? Ich kenne diese K�che! Eines meiner Lieblingsessen.");
		sc.nextLine();
		System.out.println(d + "Hahaha gut dann! Ich lasse Sie Ihr Lieblingsessen genie�en. Bis morgen, " + info.getName() + ".");
		sc.nextLine();
		System.out.println(s + "Super! Ukrainische Leute haben so viele tolle Essen.");
		System.out.println(s + "Ich habe heute viel gelernt, ich hoffe in sieben Tagen kann ich mich noch daran erinnern.");
		sc.nextLine();
	}
	
	public void zweitesThema() {
		/* Hier werden die Informationen �ber interessante Fakten von Ukraine (2. TAG) berichtet.
		 * Author : @Arianne.
		 */
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
		
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println(s + "Neuen Tag. Was soll ich heute tun?");
		sc.nextLine();
		System.out.println(s + "Hmm.. Wie lautet die Telefonnummer des B�rgermeisters? Ah! +38017583****");
		sc.nextLine();
		System.out.println(d + "Hallo! Heute werden Sie �ber interessante Fakten von Ukraine erfahren. Jetzt los!");
		sc.nextLine();
		System.out.println(d + "�brigens wenn Sie etwas kaufen m�chten, k�nnen Sie mit diesem Hrywnja Geld kaufen.\n\t\t  Das ist die W�hrung des Geldes.");
		sc.nextLine();
		System.out.println("*Sie gehen spazieren und sehen eine blaue und gelbe Flagge, die Flagge von Ukraine*");
		System.out.println("*Daneben gibt es ein Plakat und Sie lesen es*");
		sc.nextLine();
		System.out.println(s + "Einwohnerzahl : 42.101.650. Hmm...");
		sc.nextLine();
		System.out.println(s + "Es gibt drei Wege, ich muss w�hlen.");
		System.out.println("M�chten Sie links, rechts, oder geradeaus gehen? Passen Sie auf!");
		System.out.println("Die Information, die Sie brauchen, ist nur in zwei von diesen drei Wegen erfahrt werden kann.");
		String weg = sc.next();
		
		/* Der Spieler muss w�hlen, ob er links, rechts, oder geradeaus gehen m�chte.
		 * Hier wird diese Wahl gepr�ft und die passende Anweisungen werden dann ausgef�hrt.
		 */
		if (weg.equals("links") || weg.equals("geradeaus") || weg.equals("Links") || weg.equals("Geradeaus")) {
			System.out.println("*Sie gehen " + weg + " und sehen eine U-Bahnstation*");
			sc.nextLine();
			System.out.println(s + "Arsenalnaja, Kiew. Ist das wo ich bin?");
			sc.nextLine();
			System.out.println(s + "*Sie lesen anderes Plakat* Die tiefste U-Bahnstation in der Welt (105 meter)");
			sc.nextLine();
		}
		else {
			if (weg.equals("rechts") || weg.equals("Rechts")) {
				System.out.println("*Sie gehen " + weg + " und sehen viele Leute singen*");
				sc.nextLine();
			}
			else {
				System.out.println("*Sie haben nichts gew�hlt, so gehen Sie rechts und sehen viele Leute singen*");
				sc.nextLine();
			}
			System.out.println(s + "Das muss die Nationalhymne von Ukraine sein. Was ist der Titel?");
			sc.nextLine();
			System.out.println(s + "*Sie suchen es in Internet* Schtsche ne wmerla Ukrajiny. Wie k�nnte man das sagen..");
			sc.nextLine();
			}
	
		System.out.println(s + "Wow Ukraine hat bestimmt einige Besonderheiten. Ich habe auch geh�rt,\n\t\t  dass"
							+ " der geographische Mittelpunkt von Europa liegt in Ukraine.");
		sc.nextLine();
		System.out.println(s + "Okay es ist fast 20 Uhr. Ich muss Zuhause gehen. Ich hoffe sie waren die Informationen, die ich brauche.");
		sc.nextLine();
	}
	
	public void drittesThema() {
		/* Hier werden die Informationen �ber ukrainische Kleidungen (3. TAG) berichtet.
		 * Author : @Brady.
		 */
		
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
		
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println("*Sie haben wegen lautes L�rms aufgestanden*");
		sc.nextLine();
		System.out.println(s + "Ugggh.... Wie sp�t ist es? Warum ist es so laut?");
		sc.nextLine();
		System.out.println(s + "Und warum tragen alle die Dorfbewohner und die Dorfbewohnerinnen gleichartige Kleidung?");
		sc.nextLine();
		System.out.println(d + "Ah, guten Morgen " + info.getName() + ". Es tut mir leid.");
		sc.nextLine();
		System.out.println(d + "Eigentlich feiern wir heute meinen Geburtstag. Hahaha");
		sc.nextLine();
		System.out.println(s + "Ach so, also, alles Gute zum Geburtstag.");
		sc.nextLine();
		System.out.println(d + "Wir k�nnen diese Chance benutzen.");
		sc.nextLine();
		System.out.println(d + "Sie haben die gleichartige Kleidungen gesehen, oder?");
		sc.nextLine();
		System.out.println(s + "Ja, sind sie eure traditionellen Kleidungen?");
		sc.nextLine();
		System.out.println(d + "100 Punkte, richtig clever. Die Frauen tragen einen langen Rock, Bluse, oder Tunika,\n\t\t  und letztlich Kopfbedeckungen.");
		sc.nextLine();
		System.out.println(s + "Ach so, und die M�nner tragen Leinenhemd und -hose.");
		sc.nextLine();
		System.out.println(s + "Wenn ich das sehe, erinnere mich an andere slavische L�nder. Hahaha");
		sc.nextLine();
		System.out.println(s + "Es gibt etwas auf die Kleidungen der Frauen. Ist das Ausschm�ckung?");
		sc.nextLine();
		System.out.println(d + "Gute Augen. Diese ausgeschm�ckten Kleidungen hei�en Ryshniki.");
		sc.nextLine();
		System.out.println(d + "Die Ausschm�ckung sind ein paganischer Glaube f�r Sch�tzungen.");
		sc.nextLine();
		System.out.println(d + "Ich denke, dass diese Informationen genug sind. Los! Lass uns feiern!");
		sc.nextLine();
		System.out.println("*Wir haben den ganzen Tag feiern.*");
		sc.nextLine();
		
	}
	
	public void viertesThema() {
		/*Hier werden die Informationen �ber ukrainische Feiertage (4. TAG) berichtet.
		 * Author : @Sofia.
		 */
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
	
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println(s+ "Ein neuen Tag,was kann mich heute erwarten?");
		sc.nextLine();
		System.out.println("*Sie sehen ein Buch auf dem Tisch*");
		sc.nextLine();
		System.out.println(d+"Hallo, hast du schon das Kobsar von Taras Schewtschenko gesehen, f�r Ukrainer es ist so wie Bibel! \n\t\t  Heute erz�hle ich dir �ber Literatur. Und �ber Schewtschenko - unser literarische Jesus.");
		sc.nextLine();
		System.out.println(s+"Wieso? Was hat er gemacht? ");		
		sc.nextLine();
		System.out.println(d+ "Er ist ein ber�hmtester ukrainischer Lyriker und Maler. ");
		sc.nextLine();
		System.out.println(s+ "Warum ist das sehr wichtig f�r euch?");
		sc.nextLine();
		System.out.println(d+ "Durch seine Werke war moderne ukrainische Sprache stark beeinflusst und entwickelt.");
		sc.nextLine();
		System.out.println(s+ "Und wessen Portr�t h�ngt hier bei der Regal?");
		sc.nextLine();
		System.out.println(d+ "Das ist Gregory Skoworoda, er konnte sehr viele Sachen machen.");
		sc.nextLine();
		System.out.println(s+ "Konnte er singen?");
		sc.nextLine();
		System.out.println(d+ "Ja, bestimmt! ");
		sc.nextLine();
		System.out.println(s+ "War er auch ein Lyriker?");
		sc.nextLine();
		System.out.println(d+ "Nicht nur, er war auch bekannter Federdichter, Philosopher und beeinflusst die ganze ostslawische Kultur!");
		sc.nextLine();
		System.out.println(d+"Jetzt muss ich leider gehen aber wir sehen uns noch heute Abend.");
		sc.nextLine();
		System.out.println("*Sie haben den ganzen Tag Poesie von Schewtschenko und Skoworoda gelesen. Jemand kommt wieder rein.*");
		sc.nextLine();
		System.out.println(d+ "Ich bin wieder da, wie geht's beim Lesen.");
		sc.nextLine();
		System.out.println(s+ "Es ist sehr spannend und faszinierend! ");
		sc.nextLine();
		System.out.println(d+ "Ich habe Ihnen ein neues Buch mitgebracht. Es ist von Iwan Kotljarewsky. \n\t\t  Er ist ein Gr�nder der moderne ukrainischer literarische Schriftsprache.");
		sc.nextLine();
		System.out.println(s+"Hmmmm....Eneida, klingt interessant..\n\t\t  Aber warum sind alle so komisch umgekleidet auf dem Hardcover?");
		sc.nextLine();
		System.out.println(d+ "Weil er romischer klassischer Werke und auch die Werke von Homer und Vergil benutzt hat.");
		sc.nextLine();
		System.out.println(s+ "Aber wozu? Es gibt doch genug Ideen!");
		sc.nextLine();
		System.out.println(d+ "Durch griechiche Mythology wollte er die Vielf�ltigkeit ukrainischer Kultur zeigen! \n\t\t  Eneida ist seine ber�hmteste Werk mit viel Humor und wir schauen das heute!");
		sc.nextLine();
		System.out.println(s+ "Danke sch�n, Ich habe schon Kobsar und jetzt habe ich noch Eneida zur meinen Kollektion! ");
		sc.nextLine();
		System.out.println(d+ " Jetzt es w�re besser, wenn Sie gut essen und schlafen, weil morgen erwartet Sie viel!");
	
	}
	
	public void f�nftesThema() {
		/* Hier werden die Informationen �ber ukrainische merkmale Wahrzeichen (5. TAG) berichtet.
		 * Author : @Brady.
		 */
		
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
		
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println(s + "Ich wundere mich �ber das Thema f�r heute.");
		sc.nextLine();
		System.out.println(s + "Hmm, wo ist der Dorfh�uptling? Vielleicht sollte ich nach seinem Haus gehen.");
		sc.nextLine();
		System.out.println("*Sie haben in das Haus des Dorfh�uptlings betreten.*");
		sc.nextLine();
		System.out.println(s + "Hallo? Sind Sie hier?");
		sc.nextLine();
		System.out.println(d + "Endlich sind Sie angekommen. Herzlich willkommen " + info.getName() + ".");
		sc.nextLine();
		System.out.println(d + "Ich habe Ihre Ankunft erwartet.");
		sc.nextLine();
		System.out.println(s + "Aber warum? Lerne ich das n�chste Thema hier?");
		sc.nextLine();
		System.out.println(d + "Sie haben Recht. Guck mal diesen Fotos an.");
		sc.nextLine();
		System.out.println(d + "Hier war ich im Nikitsky botanischen Garten.\n\t\t  Neben mir steht der gro�este Baum in Ukraine.");
		sc.nextLine(); 
		System.out.println(d + "Seine Umfang und H�he ist 10.32 m und 12 m hoch.");
		sc.nextLine(); 
		System.out.println(s + "Wow, ich muss dahin gehen. Gibt es noch andere merkmale Wahrzeichen?");
		sc.nextLine(); 
		System.out.println(d + "Nat�rlich. Es gibt Auzun - Uzen Fluss. Aus dem stammen mehrere Quelle, zum Beispiel, Paniya Quelle.");
		sc.nextLine(); 
		System.out.println(d + "Dieser Fluss ist im Canyon von Crimea.");
		sc.nextLine(); 
		System.out.println(s + "K�nnen Sie mir mehr Fotos zeigen?");
		sc.nextLine(); 
		System.out.println(d + "Nat�rlich.");
		sc.nextLine(); 
		System.out.println(d + "*Den ganzen Tag habe ich mit dem Dorfh�uptling �ber seine Fotos diskutiert.*");
		sc.nextLine(); 

	}
	
	public void sechstesThema() {
		/* Hier werden die Informationen �ber ukrainische Literaturen (6. TAG) berichtet.
		 * Author : @Sofia.
		 */
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
		
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println("*Durch das Schlaf h�ren Sie Musik und Lieder*");
		sc.nextLine();
		System.out.println("*Der Dorfh�uptling st�rmt in Ihrer Haus hinein*");
		sc.nextLine();
		System.out.println(d+"Auf, auf, wir haben heute viel zu tun.");
		sc.nextLine();
		System.out.println(s+"Warum ist es so laut, was ist heute?");
		sc.nextLine();
		System.out.println(d+"Heute ist Kupala Tag. Es ist ein traditionell gefeierte Fest der Sommersonnenwende.");
		sc.nextLine();
		System.out.println(s+"Was sollen wir machen?");
		sc.nextLine();
		System.out.println(d+"�ber das Feuer springen, baden, wahrsagen und nach Farnebl�me suchen.");
		sc.nextLine();
		System.out.println(s+"Aber Farne bl�hen doch nicht! Aber ich habe noch nie wahrgesagt..");
		sc.nextLine();
		System.out.println(d+"In Ukraine es ist geglaubt, dass wer heute Nacht Farnebl�me findet, wird f�r immer gl�cklich.");
		sc.nextLine();
		System.out.println(s+"Wie werden wir heute wahrsagen.");
		sc.nextLine();
		System.out.println(d+"Man stellt Kerzen auf den Bl�menkr�nze und legt das auf dem Flusswasser, so kann man zukunftige Mann oder Frau sehen!");
		sc.nextLine();
		System.out.println(s+"Soll ich traditionelle Ukrainische Hemd - Wyschiwanka anziehen?");
		sc.nextLine();
		System.out.println(d+"Nein, daf�r haben wir Wyschiwanka Tag.");
		sc.nextLine();
		System.out.println(s+"Den ganzen Tag nur f�r das Hemd?");
		sc.nextLine();
		System.out.println(d+"Ja, damit unterst�tzen wir alte Tradition der Kreation und Tragung der �ltesten ukrainischen Kleidungsst�ck!");
		sc.nextLine();
		System.out.println(s+"Gibt es Feste, die man mit dem Essen feiert?");
		sc.nextLine();
		System.out.println(d+"Pfff....Na klar, Masleniza.");
		sc.nextLine();
		System.out.println(s+"Wann ist es gefeiert?");
		sc.nextLine();
		System.out.println(d+"Am Ende des Winters und dauert eine Woche lang. Es ist eigentlich heidnisch ursprunglich.");
		sc.nextLine();
		System.out.println(s+"Was ist mit Essen?");
		sc.nextLine();
		System.out.println(d+"Traditionell werden Pfannkuchen mit verschiedenen F�llungen gegessen.\n\t\t  Und noch was!!Fast vergessen! Wir verbrennen auch eine Figur aus Stroh.");
		sc.nextLine();
		System.out.println(s+"Warum?");
		sc.nextLine();
		System.out.println(d+"Seit lange ist es geglaubt, dass durch die Verbrennung alle schlechte Geiste und Mi�geschicke weg gehen!");
		sc.nextLine();
		System.out.println(d+"Jetzt lass uns feiern, alles wartet auf uns");
	
	}
	
	public void siebtesThema() {
		/* Hier werden die Informationen �ber ukrainische Regierung und St�dte 
		 * (7. TAG) berichtet.
		 * Author : @Brady.
		 */
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
		
		System.out.println("---" + info.getCount() + ". TAG---\n");
		
		System.out.println(s + "Neuen Tag. Ich hoffe, dass ich mich an die wichtige Information noch erinnere.");
		sc.nextLine();
		System.out.println("*Plotzlich h�ren Sie etwas.*");
		sc.nextLine();
		System.out.println(d + "Hallooooo, " + info.getName() + ". Hier ist dein letztes Thema.\n\t\t  Lies diese Zeitung.");
		sc.nextLine();
		System.out.println(s + "Eine Zeitung? Aber warum?");
		sc.nextLine();
		System.out.println(d + "Damit Sie besser verstehen, was in Ukraine los.");
		sc.nextLine();
		System.out.println(s + "Ah OK. Hmmm. Dieser Artikel sagt, dass die Bewohner in der Hauptstadt Kyiv Kupala Tag gefeiert haben.");
		sc.nextLine();
		System.out.println(s + "Leider gibt es auch einen Unfall in der Stadt Donetsk.");
		sc.nextLine();
		System.out.println(d + "K�nnen Sie alle verstehen? Diese Zeitung haben 2 Sprache.\n\t\t  Weil die s�de und �ste Teile von Ukraine sprechen auf Russisch und die weste Teile sprechen auf Ukrainisch.");
		sc.nextLine();
		System.out.println(s + "Ja, ich kann einfach lesen. Oooh, es gibt auch....");
		sc.nextLine();
		System.out.println(s + "*Der Rest des Tages lese ich viele andere Zeitungen.*");
		sc.nextLine();
		
	}
	
	public void achttenTag() {
		/* Hier werden die Chance zur Wiederholung der Informationen gegeben.
		 * Hier wird auch der Zugang der Niveaus gezeigt.
		 * Author : @Brady.
		 */
		
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		haupt.leben();
		
		System.out.println("---8. TAG---\n");
		
		System.out.println(s + "Endlich habe ich eine ganze Woche �ber Ukraine gelernt.");
		sc.nextLine();
		System.out.println(d + "Ja, Sie haben sich angestrengt. Aber sind Sie bereit?");
		sc.nextLine();
		System.out.println(d + "Gibt es irgendwelches Thema, den Sie wiederholen m�chten?");
		System.out.println("1. Essen");
		System.out.println("2. Interessante Fakten");
		System.out.println("3. Kleidung");
		System.out.println("4. Feiertage");
		System.out.println("5. Merkmale Geb�ude");
		System.out.println("6. Literatur");
		System.out.println("7. Regierung und St�dte");
		System.out.println("8. Nein");
		System.out.println(d + "Sie haben nur eine Chance.");
		String w = sc.next();
		
		//Hier wird das Variable w gepr�ft, ob es mit einem der Tagen entspricht, wenn nicht dann wird das Spiel fortgesetzt.
		if (w.equals("1") == true) {
			erstesThema();
		}
		else if (w.equals("2") == true) {
			zweitesThema();
		}
		else if (w.equals("3") == true) {
			drittesThema();
		}
		else if (w.equals("4") == true) {
			viertesThema();
		}
		else if (w.equals("5") == true) {
			f�nftesThema();
		}
		else if (w.equals("6") == true) {
			sechstesThema();
		}
		else if (w.equals("7") == true) {
			siebtesThema();
		}
		
		haupt.setClear(0);
		while (haupt.getClear() < 20) {
			System.out.println("");
			haupt.addClear(1);
		}
		
		System.out.println(s + "OK, jetzt bin ich bereit. Auf geht's!");
		
		
	}
}
