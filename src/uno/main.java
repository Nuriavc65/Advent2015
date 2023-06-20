package uno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("inputs/dia1.txt");
		Scanner scanner = new Scanner(file);
		
		String datos="";
		while(scanner.hasNextLine()) {
			 datos = scanner.nextLine();
		}
		int resultado = 0;
		for(int i=0;i<datos.length();i++) {
			char simbolo = datos.charAt(i);
			if(simbolo == '(') {
				resultado++;
			}else{
				resultado--;
			}
		}
		System.out.println(resultado);
		
	}

}
