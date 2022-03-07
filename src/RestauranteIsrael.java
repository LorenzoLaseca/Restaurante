/**
 * 
 * @author Lorenzo
 *@version 1.0
 */
public class RestauranteIsrael {
	/**representa la cantidad de papas*/
	public int p;
	public int c;
	/**representa la cantidad de chocos*/
	
	/**
	 * 
	 * @param a Introducir la cantidad de papas que hay en stock
	 * @param b Introducir la cantidad de chocos que hay en stock
	 */
	public RestauranteIsrael(int a, int b) {
		
		this.p = a;
		this.c = b;
	}

	int cantidadPapas() {
		int a = this.p * 3;
		return a;
	}

	int cantidadChocos() {
		int ch = this.c * 6;
		return ch;
	}
	/** Añade una cantidad de chocos al stock actual
	 * @param c Cantidad de chocos para añadir al stock
	 */

	public void addChocos(int c) {
		this.c = this.c + c;
	}
	/** Añade una cantidad de chocos al stock actual 
	 * @param Cantidad de chocos a añadir al stock
	 * */
	public void addPapas(int d) {
		this.p = this.p + d;
	}
	/** Añade una cantidad de papas al stock actual 
	 * * @param Cantidad de papas a añadir al stock
	 * */
	
	/** @hidden**/

	public static void main(String[] args) {
		RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
		System.out.println("Numero de chocos: " + r1.c);
		System.out.println("Numero de papas: " + r1.p);

		if (r1.cantidadPapas() <= r1.cantidadChocos()) {
			System.out.println("Israel puede dar de comer a " + r1.cantidadPapas() + " personas");
		} else {
			System.out.println("Israel puede dar de comer a " + r1.cantidadChocos() + " personas");
		}
	}

}