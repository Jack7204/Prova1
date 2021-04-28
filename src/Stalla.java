import java.util.ArrayList;

/**
 * Classe che descrive una <i>Stalla</i>
 * 
 * @author Jacopo Molle
 * @version 1.0 gitHub
 */
public class Stalla {

	/**
	 * ArrayList di <i>Animali</i>
	 */
	private ArrayList<Animale> vett;

	/**
	 * Nome della <i>Stalla</i>
	 */
	private String nome;

	/**
	 * Costruttore della <i>Stalla</i>
	 * 
	 * @param no Nome della <i>Stalla</i>
	 */
	private Stalla(String no) {
		vett = new ArrayList<Animale>();
		nome = no;
	}

	/**
	 * Metodo che aggiunge un nuovo <i>Animale</i> all' ArrayList
	 * 
	 * @param a Nuovo <i>Animale</i> da Aggiungere
	 */
	private void addAnimale(Animale a) {
		vett.add(a);
	}

	/**
	 * Metodo che elimina un <i>Animale</i> dall'ArrayList dato il codice identificativo
	 * 
	 * @param s Codice dell'<i>Animale</i>
	 * @return Ritorna un valore <b>true</b> se la rimozione è avvenuta con successo, <b>false</b>
	 *         in caso contrario
	 */
	private boolean delAnimale(String s) {
		for (int i = 0; i < vett.size(); i++)
			if (vett.get(i).getCodice().compareToIgnoreCase(s) == 0) {
				vett.remove(i);
				return true;
			}
		return false;
	}

	/**
	 * Metodo che calcola il costo giornaliero complessivo di tutti gli <i>Animali</i>
	 * 
	 * @return Ritorna il valore del costo di mantenimento giornaliero di tutti gli <i>Animali</i>
	 */
	public float calcoloCosto() {
		float c = 0;
		for (Animale a : vett)
			c += a.costoGiornaliero();
		return c;
	}

	/**
	 * Metodo che ritorna un ArrayList contenente tutti i <i>Cavalli</i> da corsa presenti nella <i>Stalla</i>
	 * @return	Ritorna un ArrayList contenente tutti i <i>Cavalli</i> da corsa presenti nella <i>Stalla</i>
	 */
	public ArrayList<Animale> visCavalliCorsa() {
		ArrayList<Animale> cav = new ArrayList<Animale>();
		for (Animale a : vett)
			if (a instanceof Cavallo && ((Cavallo) a).isCorsa())
				cav.add(a);
		return cav;
	}

	/**
	 * Metodo che calcola il costo giornaliero complessivo dei <i>Cavalli</i> da corsa
	 * 
	 * @return Ritorna il valore del costo di mantenimento giornaliero di tutti i <i>Cavalli</i> da corsa
	 */
	public float costoCavalliCorsa() {
		float c = 0;
		for (Animale a : vett)
			if (a instanceof Cavallo && ((Cavallo) a).isCorsa())
				c += a.costoGiornaliero();
		return c;
	}

	/**
	 * Metodo <i>toString</i>
	 */
	public String toString() {
		String s = "Nome della stalla: " + nome + "\n";
		for (Animale a : vett)
			s += a;
		return s;
	}
	
	/**
	 * Main del programma 
	 * @param args	Argomenti da linea di comando
	 */
	public static void main(String[] args) {
		Stalla st = new Stalla("Stalla Pokémon");
		Cavallo ca = new Cavallo("xocb", 14, 2.5f, "Pegaso", true);
		Cavallo ca2 = new Cavallo("cnwo", 10, 30f, "Pegaso", false);
		Cavallo ca3 = new Cavallo("cniu", 9, 1.5f, "Pegaso", true);
		Mucca mu = new Mucca("nocn", 12, 2, 1.5f);

		st.addAnimale(ca);
		st.addAnimale(mu);

		st.addAnimale(ca2);
		st.addAnimale(ca3);

		System.out.println("Costo complessivo: " + st.calcoloCosto());
		System.out.println("1)------------------------------------|");
		System.out.println("Costo cavalli da corsa: " + st.costoCavalliCorsa());

		System.out.println("2)------------------------------------|");

		ArrayList<Animale> an = st.visCavalliCorsa();
		System.out.println("Cavalli da corsa");
		for (Animale a : an)
			System.out.println(a + "\n");

		System.out.println("3)------------------------------------|");
		System.out.println(st);

		st.delAnimale("xocb");

		System.out.println("4)------------------------------------|");
		System.out.println(st);

	}

}
