package clases;

/**
 * <h3>Clase que contiene los m�todos relacionados con dividir de la calculadora.</h3>
 * <h3>Esta clase ser� usada para el funcionamiento de la calculadora.</h3>
 * 
 * @version <b>1.0</b>
 * @author <b>DAVID G�MEZ</b>
 */
public class Clase_4_Cociente {

	/**
	 * <b>M�todo que recibe 2 n�meros reales y devuelve la divisi�n del primero entre el segundo.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que sera el dividendo.</b>
	 * @param numero2 <b>Segundo n�mero que sera el divisor.</b>
	 * @return <b>Resultado de la divisi�n.</b>
	 */
	public double dividirDosNumerosReales(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		return resultado;
	}

	/**
	 * <b>M�todo que recibe 2 n�meros enteros y devuelve la divisi�n del primero entre el segundo.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que sera el dividendo.</b>
	 * @param numero2 <b>Segundo n�mero que sera el divisor.</b>
	 * @return <b>Resultado de la divisi�n.</b>
	 */
	public int dividirDosNumerosEnteros(int numero1, int numero2) {
		int resultado = numero1 / numero2;
		return resultado;
	}

	/**
	 * <b>M�todo que recibe 1 n�mero real y devuelve el inverso.</b>
	 * 
	 * @param numero1 <b>N�mero al que se calculara el inverso.</b>
	 * @return <b>Resultado de la inversi�n.</b>
	 */
	public double inversoUnNumeroReal(double numero1) {
		double resultado = 1 / numero1;
		return resultado;
	}

	/**
	 * <b>M�todo que recibe 1 n�mero y devuelve la ra�z cuadrada.</b>
	 * 
	 * @param numero1 <b>N�mero al que se calculara la ra�z cuadrada.</b>
	 * @return <b>Resultado de la ra�z cuadrada.</b>
	 */
	public double raizCuadrada(double numero1) {
		double resultado = Math.sqrt(numero1);
		return resultado;
	}
}