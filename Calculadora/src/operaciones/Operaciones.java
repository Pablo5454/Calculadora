package operaciones;
public class Operaciones{
    
	/**
	 * Realiza la operación "sumar".
	 * @param Recibe un número entero desde la variable "valor1"
	 * @param Recibe un número entero desde la variable "valor2"
	 * @return Devuelve la suma de ambos
	 */
	
	public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
	/**
	 * Realiza la operación "restar".
	 * @param Recibe un número entero desde la variable "valor1"
	 * @param Recibe un número entero desde la variable "valor2"
	 * @return Devuelve la resta de ambos
	 */
	
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }

    /**
	 * Realiza la operación "multiplicar".
	 * @param Recibe un número entero desde la variable "valor1"
	 * @param Recibe un número entero desde la variable "valor2"
	 * @return Devuelve la multiplicación de ambos
	 */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
	 * Realiza la operación "dividir".
	 * @param Recibe un número entero desde la variable "valor1"
	 * @param Recibe un número entero desde la variable "valor2"
	 * @return Devuelve la división de ambos
	 */
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
	 * Realiza la operación "resto".
	 * @param Recibe un número entero desde la variable "valor1"
	 * @param Recibe un número entero desde la variable "valor2"
	 * @return Devuelve el resto de ambos
	 */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}