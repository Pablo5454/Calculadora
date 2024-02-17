package formatoLogs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class formatoHTML extends Formatter {
	@Override
	public String format(LogRecord record) {
		return "<tr>\n" + "<td>\n" + record.getMessage() + "\n</td>\n" + "<td>\n" + record.getMessage() + "\n</td>\n" + 
				"<td>\n" + record.getMessage() + "\n</td>\n" + "<td>\n" + record.getMessage() + "\n</td>\n" + "</tr>\n";
				
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
