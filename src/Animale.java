/**
 * Classe che descive un <i>Animale</i> generico
 * @author Jacopo Molle
 * @version 1.0
 */
public abstract class Animale {
	/**
	 * Codice identificativo dell'<i>Animale</i>
	 */
	protected String codice;
	
	/**
	 * Età dell'<i>Animale</i>
	 */
	protected int eta;

	/**
	 * Costruttore della classe
	 * @param cod 	Codice identifictivo dell'<i>Animale</i>
	 * @param e		Età dell'<i>Animale</i>
	 */
	public Animale(String cod, int e) {
		codice = cod;
		eta = e;
	}
	
	/**
	 * Metodo che ritorna il codice identificativo dell'<i>Animale</i>
	 * @return Il codice identificativo dell'<i>Animale</i>
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * Metodo che ritorna l'età dell'<i>Animale</i>
	 * @return l'età dell'<i>Animale</i>
	 */
	public int getEta() {
		return eta;
	}
	
	/**
	 * Metodo astratto che ritorna il costo giornaliero dell'<i>Animale</i> 
	 * @return il costo giornaliero dell'<i>Animale</i>
	 */
	public abstract float costoGiornaliero();
}
