package clases;

/**
 * <h3>Clase que contiene los m�todos relacionados con multiplicar de la calculadora.</h3>
 * <h3>Esta clase ser� usada para el funcionamiento de la calculadora.</h3>
 * 
 * @version <b>1.0</b>
 * @author <b>DAVID G�MEZ</b>
 */
public class Clase_3_Producto {
	
	/**
	 * <b>M�todo que recibe 2 n�meros reales y devuelve la multiplicaci�n.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que se va a multiplicar.</b>
	 * @param numero2 <b>Segundo n�mero que se va a multiplicar.</b>
	 * @return <b>Resultado de la resta.</b>
	 */
	public double multiplicarDosNumerosReales(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * <b>M�todo que recibe 2 n�meros enteros y devuelve la multiplicacion.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que se va a multiplicar.</b>
	 * @param numero2 <b>Segundo n�mero que se va a multiplicar.</b>
	 * @return <b>Resultado de la multiplicaci�n.</b>
	 */
	public int multiplicarDosNumerosEnteros(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * <b>M�todo que recibe 3 n�meros reales y devuelve la multiplicaci�n.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que se va a multiplicar.</b>
	 * @param numero2 <b>Segundo n�mero que se va a multiplicar.</b>
	 * @param numero3 <b>Tercer n�mero que se va a multiplicar.</b>
	 * @return <b>Resultado de la multiplicaci�n.</b>
	 */
	public double multiplicarTresNumerosReales(double numero1, double numero2, double numero3) {
		double resultado = numero1 * numero2 * numero3;
		return resultado;
	}

	/**
	 * <b>M�todo que recibe 2 n�meros y devuelve la potencia del primero elevado al segundo.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que sera la base.</b>
	 * @param numero2 <b>Segundo n�mero que sera el exponente.</b>
	 * @return <b>Resultado de la potencia.</b>
	 */
	public double potencia(double numero1, double numero2) {
		double resultado = Math.pow(numero1, numero2);
		return resultado;
	}
}