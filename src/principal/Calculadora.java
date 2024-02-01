package principal;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;

public class Calculadora{
    
	/**
	 * Importa el menu y las operaciones de las clases "Operaciones" y "Menu".
	 * @see operaciones.Operaciones
	 * @see menu.Menu
	 */
	private static final Logger LOGGER = Logger.getLogger("LOG1");
	
	public static void main(String[] args) throws SecurityException, IOException {   
		LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);
		int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Handler consoleHandler = new ConsoleHandler();
        Handler fileHandler = null;
        consoleHandler.setLevel(Level.WARNING);
        
        LOGGER.addHandler(consoleHandler);
        
        try {
        	fileHandler=new FileHandler("./logs/ficheroLog.log", true);
        	LOGGER.addHandler(fileHandler);
        }catch(SecurityException except) {
        	except.printStackTrace();
        }catch(IOException except) {
        	except.printStackTrace();
        }
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            	LOGGER.log(Level.FINE, "Suma correcta.");
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            	LOGGER.log(Level.FINE, "Resta correcta.");
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            	LOGGER.log(Level.FINE, "Multiplicación correcta.");
            } else if (operacion.equalsIgnoreCase("/")) {
            	try {
            		resultado = operaciones.dividir(operandos[0], operandos[1]);
            		LOGGER.log(Level.FINE, "Division realizada correctamente.");
            	}catch(ArithmeticException e) {
            		LOGGER.log(Level.WARNING, "ERROR! Se ha intentado dividir por cero");
            		resultado=0;
            	}
            	System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, "Operación de resto correcta.");
            } else {
                System.out.println ("Operaci�n no v�lida");
            }
        }   while (menu.repetir());
    }
}