/**
 * Classe che descrive un <i>Cavallo</i>
 * @author Jacopo Molle
 * @version 1.0
 */
public class Cavallo extends Animale {
	/**
	 * Razza del <i>Cavallo</i>
	 */
	private String razza;
	
	/**
	 * Indica se il <i>Cavallo</i> in questione è da corsa
	 */
	private boolean corsa;
	
	/**
	 * Biada giornaliera
	 */
	private float biada;

	/**
	 * Costruttore della classe <i>Cavallo</i>
	 * 
	 * @param cod 	Codice identificativo del Cavallo
	 * @param e		Età della mucca
	 * @param bia	Biada giornaliera
	 * @param ra	Razza del cavallo
	 * @param co	Da corsa
	 */
	public Cavallo(String cod, int e, float bia, String ra, boolean co) {
		super(cod, e);
		razza = ra;
		corsa = co;
		biada=bia;
	}

	/**
	 * 	Metodo che calcola il costo di mantenmento del <i>Cavallo</i>
	 */
	@Override
	public float costoGiornaliero() {
		return biada * 30 + ((corsa) ? 10f : 0);
	}

	/**
	 * Metodo <i>toString</i>
	 */
	public String toString() {
		String s = "Codice: " + codice + "  Età: " + eta + "  Biada: " + biada;
		s += "  Razza: " + razza + "\n\tDa corsa: " + ((corsa) ? "Sì" : "No");
		s += "  Costo: " + costoGiornaliero() + "\n";
		return s;
	}
	
	/**
	 * Metodo che ritorna un valore true se il <i>Cavallo</i> in questione è da corsa
	 * @return Ritorno valore <b>true</b> se il <i>Cavallo</i> è da corsa
	 */
	public boolean isCorsa() {
		return corsa;
	}
	
	/**
	 * Test della classe <i>Cavallo</i>
	 * @param args Argomenti da linea di comando
	 */
	public static void main(String[] args) {
		Cavallo ca = new Cavallo("xocb", 14, 2.5f, "Pegaso", true);
		System.out.println(ca);
	}

}
