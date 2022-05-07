/*
 *@author <Simos> 
 *
 *@version 1.0
 */

public class Trapezio {

	float base1;
	float base2;
	float altezza;

	/*
	 * @param <base1 attributo> per la base 1
	 * @param <base2 attributo> per la base 2
	 * @param <altezza attributo> per l'altezza
	 */
	public Trapezio(float base1, float base2, float altezza) {
		super();
		this.base1 = base1;
		this.base2 = base2;
		this.altezza = altezza;
}
/*
 * @return ritorna la misura dell'area
 */
	
	public float calcoloArea () {
		return((base1 + base2) * altezza / 2);
	}

	public static void main(String[] args) {
	
		Trapezio t = new Trapezio( 5.0f , 6.0f, 4.5f );
		System.out.println(t.calcoloArea());
		
		
	}
}
