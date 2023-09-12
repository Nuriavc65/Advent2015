package tres;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("inputs/day3.txt");
		Scanner scanner = new Scanner(file);
		
		String datos = "";
		while(scanner.hasNextLine()) {
			datos = scanner.nextLine();
		}
		int [] coordenadas ={0,0};
		int [] coorDos = {0,0};
		Set<String> valores = new HashSet<>();
		valores.add(Arrays.toString(coordenadas));
		Set<String> valoresDos = new HashSet<>();
		valoresDos.add(Arrays.toString(coordenadas));
		for (int i=0;i<datos.length();i++) {
			switch(datos.charAt(i)){
			case '^': 
				coordenadas[1]+=1;
				break;
			case 'v':
				coordenadas[1]-=1;
				break;
			case '>':
				coordenadas[0]+=1;
				break;
			case '<':
				coordenadas[0]-=1;
				break;
			}
			valores.add(Arrays.toString(coordenadas));
		}
			
			coordenadas[0] = 0;
			coordenadas[1] = 0;
			for (int i=0;i<datos.length();i++) {
				if(i%2==0) {
					switch(datos.charAt(i)){
					case '^': 
						coordenadas[1]+=1;
						break;
					case 'v':
						coordenadas[1]-=1;
						break;
					case '>':
						coordenadas[0]+=1;
						break;
					case '<':
						coordenadas[0]-=1;
						break;
					}
					valoresDos.add(Arrays.toString(coordenadas));
				}else {
					switch(datos.charAt(i)){
					case '^': 
						coorDos[1]+=1;
						break;
					case 'v':
						coorDos[1]-=1;
						break;
					case '>':
						coorDos[0]+=1;
						break;
					case '<':
						coorDos[0]-=1;
						break;
					}
					valoresDos.add(Arrays.toString(coorDos));
				}
				
			}
			System.out.println( "resultadoUno: " +valores.size());
			System.out.println("resultadoDos: " +valoresDos.size());
		}
		

	}

