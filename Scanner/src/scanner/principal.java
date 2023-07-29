package scanner;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarar scanner
		Scanner leer = new Scanner(System.in);
		
		//declara variable
		String nombre;
		int edad;
		String imprimir;
		
		
		System.out.println("hola, ingrese su nombre: ");
		nombre= leer.nextLine();
		
		System.out.println("hola, ingrese su edad: ");
		edad= leer.nextInt();
		
		
		//cerramos el scanner es una buena practica
		leer.close();
		
		
		
		//condicion if 2-11= ni:o, 12-17=adolecente 18 mayor de edad
		
		if(edad>=2 && edad<=11) 
			System.out.println("hola, eres ni:o");
			else if(edad>=12 && edad<=18)
			System.out.println("hola, eres un adolecente");
			else if(edad>=19 && edad<=60)
			System.out.println("hola eres mayor de edad");
			else if(edad>=61 && edad<110)
			System.out.println("hola, eres adulto mayor");
		
		
		//hacer lo mismo del if, pero con switch
		
		switch (edad) {
		case 10 : imprimir="hola tienes 10 a;os";
				break;
		case 25 : imprimir="hola tienes 25 a:os";
				break;
		case 30 : imprimir="hola tienes 30 a:os";
				break;
		default : imprimir="tienes una edad diferente";
		}
		
		System.out.println(imprimir);
	}

}
