package menu;

import java.util.Scanner;

public class Menu {
	private static Scanner teclado = new Scanner(System.in);

	/**
	 * Pide al usuario que introduzca los operandos por teclado y los introduce en
	 * el array.
	 * 
	 * @return Devuelve el array con los parámetros introducidos.
	 */

	public int[] pedirNumeros() {
		int[] ret = new int[2];
		System.out.print("Operando 1: ");
		ret[0] = teclado.nextInt();
		System.out.print("Operando 2: ");
		ret[1] = teclado.nextInt();
		return ret;
	}

	/**
	 * Pide al usuario que introduzca el signo de la operación a realizar.
	 * 
	 * @return devuelve la operación que se debe realizar.
	 */

	public String menuOpciones() {
		String ret = "";
		do {
			System.out.print("Operaciones [+, -, *, /, %]: ");
			ret = teclado.next();
		} while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) || (ret.equalsIgnoreCase("*"))
				|| (ret.equalsIgnoreCase("/")) || (ret.equalsIgnoreCase("%"))));
		return ret;
	}

	/**
	 * Pide al usuario si desea repetir la operación.
	 * 
	 * @return devuelve el contenido de la variable ret, con un "true" en caso de
	 *         introducir "s".
	 */

	public boolean repetir() {
		boolean ret = false;
		String respuesta;
		do {
			System.out.print("�Desea continuar trabajando con la calculadora? [s / n]");
			respuesta = teclado.next();
		} while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))));

		if (respuesta.equalsIgnoreCase("s")) {
			ret = true;
		}
		return ret;
	}
}