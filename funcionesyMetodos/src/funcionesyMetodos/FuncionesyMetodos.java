package funcionesyMetodos;

import java.util.Scanner;

public class FuncionesyMetodos {

	public static void main(String[] args) {
		/*
		 * Debe diseñar un programa que reciba 3 números por consola y 
		 * determine cual de los 3 números es el mayor.
		 * 
		 * Plus: Imprimir los números ordenados de mayor a menor.
		 * Plus: Imprimir los números ordenados de menor a mayor.
		 */
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Este es un programa que va a recibir 3 numeros "+
		"y los ordenara de Mayor a menor y de menor a mayor");
		//float numeros[] = new float[3];
		float numeros[]= {0,0,0};
		
		
		System.out.println("Escribir el primer numero");
		numeros[0]= leer.nextFloat();
		System.out.println("Escribir el segundo numero");
		numeros[1]=leer.nextFloat();
		System.out.println("Escribir el tercer numero");
		numeros[2]=leer.nextFloat();
		System.out.println(mayor(numeros));
		System.out.println(ordenarMayor(numeros));
		System.out.println(ordenarMenor(numeros));
		
		leer.close();

	}
	
	public static String mayor(float numeros[]) {
		String esmayor="";
		float mayor=numeros[0];
		if(numeros[1]>mayor) {
			mayor=numeros[1];
		}
		if(numeros[2]>mayor) {
			mayor=numeros[2];
		}
		esmayor="El numero mayor es: " + mayor;
		return esmayor;
	}
	
	
	public static String ordenarMayor(float numeros[]) {
		String mayor="";
		int i;
		float aux;
		if(numeros[0]>numeros[1]) {
			aux=numeros[1];
			numeros[1]=numeros[0];
			numeros[0]=aux;
		}
		if(numeros[0]>numeros[2]) {
			aux=numeros[2];
			numeros[2]=numeros[0];
			numeros[0]=aux;
		}
		if(numeros[1]>numeros[2]) {
			aux=numeros[2];
			numeros[2]=numeros[1];
			numeros[1]=aux;
		}
		mayor="Los numeros ordenados del mayor al menor son: ";
		for(i=0;i<numeros.length;i++) {
			if(i==numeros.length-1) {
				mayor+= numeros[i] + ".";
			}else {
				mayor+= numeros[i] + " , ";
			}
			
		}
		return mayor;
	}
	
	public static String ordenarMenor(float numeros[]) {
		String menor="";
		int i;
		float aux;
		if(numeros[0]<numeros[1]) {
			aux=numeros[1];
			numeros[1]=numeros[0];
			numeros[0]=aux;
		}
		if(numeros[0]<numeros[2]) {
			aux=numeros[2];
			numeros[2]=numeros[0];
			numeros[0]=aux;
		}
		if(numeros[1]<numeros[2]) {
			aux=numeros[2];
			numeros[2]=numeros[1];
			numeros[1]=aux;
		}
		menor="Los numeros ordenados del menor al mayor son: ";
		for(i=0;i<numeros.length;i++) {
			if(i==numeros.length-1) {
				menor+= numeros[i] + ".";
			}else {
				menor+= numeros[i] + " , ";
			}
			
		}
		return menor;
	}

}
