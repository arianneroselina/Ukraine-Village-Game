/* Die Hauptklasse, wo die Main-Methode steht.
 * Hier stehen die gebrauchte Methoden (leben, setLeben, getLeben, minLeben, tod, gewinnen, getClear, setClear,
 * addClear, getD, getS, getG).
 * Author : @Arianne.
 */

public class ChortyziaDorf {
	/* Hier werden die Variablen clear (für das Clearing der Console)
	 * und leben (zum Zeigen der Anzahl des Lebens) als static int deklariert.
	 * Variablen d, s, g (für das Ausgaben von 'Dorfhäuptling', 'Sie' und, 'Geist'),
	 * und Attribut name (für das Speichern des Spielersnames) werden auch deklariert.
	 */
	static int clear, leben;
	String d, s, g, name;

	public ChortyziaDorf(String nam) {
	//In dieser Konstruktor wird das Attribut name als Parameter übergeben. 
		name = nam;
	}
	
	public static void main(String[] args) {
		SpielerInformation intro = new SpielerInformation(); //Eine Instanz für die Klasse SpielerInformation wird erzeugt.
		//Die Methode Information für die Instanz wird aufgerufen.
		intro.information();
		
	}
	
	public void leben() {
		//In dieser Methode wird das Leben des Spielers ausgegeben.
		String a = "LEBEN = ";
		
		//Hier werden Leerzeichen ausgegeben, damit das Leben rechts von der Console ausgegeben werden kann.
		while (a.length()+1 <= 120) {
			a = " " + a;
		}
		System.out.println(a + getLeben());

		//Wenn das Leben gleich Null ist, dann ist der Spieler verloren und wird sterben.
		if (getLeben() == 0) {
			tod();
		}
	}

	public void setLeben(int lb) {
		//Beim Aufruf dieser Methode wird der Wert des Lebens geändert.
		leben = lb;
	}
	
	public int getLeben() {
		//Beim Aufruf dieser Methode wird der Wert des Lebens gegeben.
		return leben;
	}
	
	public void minLeben(int lb) {
		//Beim Aufruf dieser Methode wird der Wert des Lebens mit 1 subtrahiert.
		leben -= lb;
	}
	
	public void tod() {
		/* Diese Methode wird aufgerufen, wenn das Leben gleich Null ist. Dann endet das Spiel. 
		 * Author : @Sofia.
		 */

		System.out.println("\nSCHADE! IHNEN GEHEN DIE LEBEN AUS. SIE SIND GETÖTET.\nVIEL GLÜCK NÄCHSTES MAL!");
		//Schädel, wenn der Spieler verliert.
		System.out.println("           ______\r\n" + 
				"        .-\"      \"-.\r\n" + 
				"       /            \\\r\n" + 
				"      |              |\r\n" + 
				"      |,  .-.  .-.  ,|\r\n" + 
				"      | )(__/  \\__)( |\r\n" + 
				"      |/     /\\     \\|\r\n" + 
				"      (_     ^^     _)\r\n" + 
				"       \\__|IIIIII|__/\r\n" + 
				"        | \\IIIIII/ |\r\n" + 
				"        \\          /\r\n" + 
				"         `--------`\r\n" + 
				"");
		System.exit(0);
	}
	
	public void gewinnen() {
		/* Diese Methode wird aufgerufen, wenn der Spieler das Spiel gewonnen hat und die Schatztruhe bekommt.
		 * Author : @Sofia.
		 */
		
		System.out.println("\nSIE HABEN GEWONNEN. HIER IST IHRE SCHATZTRUHE!");
		//Truhe mit dem Schatz, wenn der Spieler gewinnt.
		System.out.println(
				"\r\n" + 
				"                            _.--.\r\n" + 
				"                        _.-'_:-'||\r\n" + 
				"                    _.-'_.-::::'||\r\n" + 
				"               _.-:'_.-::::::'  ||\r\n" + 
				"             .'`-.-:::::::'     ||\r\n" + 
				"            /.'`;|:::::::'      ||_\r\n" + 
				"           ||   ||::::::'     _.;._'-._\r\n" + 
				"           ||   ||:::::'  _.-!oo @.!-._'-.\r\n" + 
				"           \\'.  ||:::::.-!()oo @!()@.-'_.|\r\n" + 
				"            '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\r\n" + 
				"              `>'-.!@%()@'@_%-'_.-o _.|'||\r\n" + 
				"               ||-._'-.@.-'_.-' _.-o  |'||\r\n" + 
				"               ||=[ '-._.-\\U/.-'    o |'||\r\n" + 
				"               || '-.]=|| |'|      o  |'||\r\n" + 
				"               ||      || |'|        _| ';\r\n" + 
				"               ||      || |'|    _.-'_.-'\r\n" + 
				"               |'-._   || |'|_.-'_.-'\r\n" + 
				"                '-._'-.|| |' `_.-'\r\n" + 
				"                    '-.||_/.-'\r\n" + 
				"");
		System.exit(0);
	}
	
	public int getClear() {
		//Beim Aufruf dieser Methode wird der Wert von clear gegeben.
		return clear;
	}
	
	public void setClear(int cl) {
		//Beim Aufruf dieser Methode wird der Wert von clear geändert.
		clear = cl;
	}
	
	public void addClear(int clear1) {
		//Beim Aufruf dieser Methode wird der Wert von clear mit 1 addiert.
		clear+=clear1;
	}
	
	public String getD() {
		//Dieses Getter ist für die Ausgabe "Dorfhäuptling".
		d = "Dorfhäuptling	: ";
		return d;
	}
	
	public String getS() {
		//Dieses Getter ist für die Ausgabe "Sie".
		s = "Sie		: ";
		return s;
	}
	
	public String getG() {
		/* Dieses Getter ist für die Ausgabe "Geist".
		 * Author : @Brady.
		 */
		g = "Geist         : ";
		return g;
	}

}

