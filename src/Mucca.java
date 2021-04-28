/**
 * Classe che descive una mucca allevata in una <i>Stalla</i>
 * @author Jacopo Molle
 * @version 1.0
 */
public class Mucca extends Animale {
	
	
	/**
	 * Latte prodotto in una giornata
	 */
	private float latte;
	
	/**
	 * Biada giornaliera
	 */
	private float biada;

	
	/**
	 * Costruttore della classe <i>Mucca</i>
	 * 
	 * @param cod 	Codice identificativo della mucca
	 * @param e		Età della mucca
	 * @param bia	Biada giornaliera
	 * @param la	Latte prodotto giornalmente
	 */
	public Mucca(String cod, int e, float bia, float la) {
		super(cod, e);
		latte = la;
		biada=bia;
	}

	/**
	 * 	Metodo che calcola il costo di mantenmento della <i>Mucca</i>
	 */
	@Override
	public float costoGiornaliero() {

		return biada * 20;
	}

	
	/**
	 * Metodo <i>toString</i>
	 */
	public String toString() {
		String s = "Codice: " + codice + "  Età: " + eta + "  Biada: " + biada;
		s += "\n\tLatte: " + latte + " litri\n";
		return s;
	}
	/**
	 * Test della classe <i>Mucca</i>
	 * @param args	Argomenti da linea di comando
	 */
	public static void main(String[] args) {
		Mucca mu = new Mucca("nocn", 12, 2, 1.5f);
		System.out.println(mu);
	}

}
