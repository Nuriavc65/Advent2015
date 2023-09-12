package dos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("inputs/day2.txt");
		Scanner scanner = new Scanner(file);
		
		ArrayList<String> datos = new ArrayList<>();
		while(scanner.hasNextLine()) {
			datos.add(scanner.nextLine());
		}
		int resultado = 0;
		int resultadoDos = 0;
		int ancho = 0;
		int largo = 0;
		int fondo = 0; 
		for(int i=0;i<datos.size();i++) {
			String n =datos.get(i);
			String [] e = n.split("x");
			ancho = Integer.parseInt(e[0]);
			largo = Integer.parseInt(e[1]);
			fondo = Integer.parseInt(e[2]);
			resultado += (2*ancho*largo)+(2*largo*fondo)+(2*fondo*ancho); 
			int minimo = Math.min((ancho*largo),Math.min((fondo*ancho), (largo*fondo)));
			resultado += minimo;
			
			resultadoDos += ancho*largo*fondo;
			int mini1 = Math.min(ancho, largo);
			int mini2 = Math.min(fondo, Math.max(ancho, largo));
			resultadoDos += mini1*2+mini2*2;
		}
		System.out.println("parte 1: " + resultado);
		System.out.println("parte 2: " + resultadoDos);
	}

}
