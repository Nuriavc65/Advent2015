package cinco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("inputs/DAY5.txt");
		Scanner scanner = new Scanner (file);
		
		ArrayList <String> data = new ArrayList <>();
		while (scanner.hasNextLine()) {
			data.add(scanner.nextLine());
		}
		int resultado = 0;
		int resultaDos = 0;
		for (int i =0;i<data.size();i++) {
			String linea = data.get(i);
			boolean pruebaUno = uno(linea);
			boolean pruebaDos = dos(linea);
			boolean pruebaTres = tres(linea);
			boolean pruebaCuatro = cuatro(linea);
			boolean pruebaCinco = cinco(linea);
			if(pruebaUno && pruebaDos && pruebaTres) {
				resultado++;
			}
			if(pruebaCuatro && pruebaCinco) {
				resultaDos++;
			}
		}
		System.out.println(resultado);
		System.out.println(resultaDos);
		
		
	}
	public static boolean uno (String linea) {
		int vocales = 0;
		for(int n=0;n<linea.length();n++) {
			String letra = "" + linea.charAt(n);
			if("aeiou".contains(letra) ) {
				vocales++;
			}
			if(vocales == 3) {
				return true;
			}
		}
		return false;
	}
	public static boolean dos (String linea) {
		for(int n=0;n<linea.length()-1;n++) {
			char letra = linea.charAt(n);
			char letraDos = linea.charAt(n+1);
				if(letra==letraDos) {
					return true;
				}
		}
		return false;
	}
	public static boolean tres (String linea) {
		for(int n=0;n<linea.length();n++) {
			if(linea.contains("ab") || linea.contains("cd")||linea.contains("pq")||linea.contains("xy")) {
				return false;
			}
		}
		return true;
	}
	public static boolean cuatro (String linea) {
		Pattern regex = Pattern.compile("(\\w{2}).*\\1");
		Matcher match = regex.matcher(linea);
		if(match.find()) {
			return true;
		}
		
		return false;
	}
	public static boolean cinco (String linea) {
		Pattern regex = Pattern.compile("(\\w).\\1");
		Matcher match = regex.matcher(linea);
		if(match.find()) {
			return true;
		}
		return false;
	}
}
