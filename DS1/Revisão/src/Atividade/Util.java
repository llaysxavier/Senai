package Atividade;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
	public static String FormatarData(LocalDate Data) {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatar.format(Data);
	}
	
	public static String FormatarMoeda(double moeda) {
		NumberFormat formatar = NumberFormat.getCurrencyInstance();
		return formatar.format(moeda);
	}
}