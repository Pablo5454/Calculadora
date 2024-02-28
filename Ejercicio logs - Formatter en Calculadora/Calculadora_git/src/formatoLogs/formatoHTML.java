package formatoLogs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class formatoHTML extends Formatter {
	@Override
	public String format(LogRecord record) {
		String mensaje = record.getMessage();
		System.out.println("Mensaje del registro: " + mensaje);
//		String[] celdas = new String [4];
		String[] celdas = new String[4];
		String[] aux = mensaje.split(",");
		for (int i = 0; i < celdas.length; i++) {
			
			celdas[i]= aux[i];
		}
		
		String operacion = celdas[0];
		String operando1 = celdas[1];
		String operando2 = celdas[2];
		String resultado = celdas[3];
		
		return "<tr>\n" + "<td>\n" + operacion + "\n</td>\n" + "<td>\n" + operando1 + "\n</td>\n" + 
				"<td>\n" + operando2 + "\n</td>\n" + "<td>\n" + resultado + "\n</td>\n" + "</tr>\n";
				
	}

	@Override
	public String getHead(Handler h) {
		return "<html>\r\n"
				+ "	<head>\r\n"
				+ "		<link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "	</head>\r\n"
				+ "	<body>\r\n"
				+ "		<table>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>Operación</th>\r\n"
				+ "				<th>Operando 1</th>				\r\n"
				+ "				<th>Operando 2</th>\r\n"
				+ "				<th>Resultado</th>\r\n"
				+ "			</tr>"
				;
		
	}

	@Override
	public String getTail(Handler h) {
		return " 	</table>\r\n"
				+ "	</body>\r\n"
				+ "</html>\n";
	}
}
