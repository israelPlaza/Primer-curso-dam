package ejercico_obligatorio_menu;

import java.util.Scanner;

public class Ejercicio_obligatorio_1 {
	private static Scanner teclado = new Scanner(System.in);
	
public static void main(String[] args) {
	opcionMenu(0);
	
}	
	
public static void menu () {
	System.out.println("");
	System.out.println("1. Rellenar un array con los 100 primeros números enteros y\n"
			+ "los muestre en pantalla en orden ascendente.");
	System.out.println("2. Rellenar un array con los 100 primeros números enteros y\n"
			+ "los muestre en pantalla en orden descendente");
	System.out.println("3. Rellenar un array con los números pares comprendidos entre 1 y 100 y\n"
			+ "los muestre en pantalla en orden ascendente.");
	System.out.println("4. Rellenar un array con los números impares comprendidos\n"
			+ "entre 1 y 100 y los muestre en pantalla en orden ascendente.");
	System.out.println("5. Rellenar un array con los números primos comprendidos entre 1 y 100 y\n"
			+ "los muestre en pantalla en orden ascendente");
	System.out.println("6. Leer 10 números por teclado, los almacene en un array y muestre la\n"
			+ "suma, resta, multiplicación y división de todos.");
	System.out.println("7. Leer 10 números por teclado, los almacene en un array y los ordene de\n"
			+ "forma ascendente.");
	System.out.println("8. Leer 10 números por teclado, 5 para un array y 5 para otro\n"
			+ "array distinto. Mostrar los 10 números en pantalla mediante un solo array.");
	System.out.println("9. Leer 5 números por teclado, los copie a otro array multiplicados por 2 y\n"
			+ "muestre el segundo array ordenado.");
	System.out.println("10. Leer 5 números por teclado, los copie a otro array\n"
			+ "multiplicados por 2 y los muestre todos ordenados usando un tercer\n"
			+ "array.");
	System.out.println("11. Rellenar un array con los 100 primeros números pares y muestre su\n"
			+ "suma.");
	System.out.println("12. Leer 10 números por teclado, los almacene en un array y muestre la\n"
			+ "media.");
	System.out.println("13. Almacenar en un array una cantidad de números dados\n"
			+ "(tanto positivos como negativos) y mostrarlos ordenados.");
	System.out.println("14. Rellenar un array con 20 números y luego busque un número concreto.");
	System.out.println("15. Construir un programa en java que permita encontrar el número\n"
			+ "mayor y el número menor de una serie de números ingresados por\n"
			+ "teclado, como primera entrada se le dará el tamaño del arreglo y luego\n"
			+ "los datos, también se debe indicar cuantas veces se repiten tanto el\n"
			+ "mayor como el menor.");
	System.out.println("16. Crea un programa que cree un array de tamaño 30 y lo rellene con\n"
			+ "valores aleatorios entre 0 y 9 (utiliza Math.random()*100). Luego ordena los\n"
			+ "valores del array y los mostrará por pantalla");
	System.out.println("17. Necesitamos crear un programa para mostrar el ranking de puntuaciones\n"
			+ "de un torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que\n"
			+ "introduzca las puntuaciones de todos los jugadores (habitualmente valores\n"
			+ "entre 100 y 280,de tipo entero) y luego muestre las puntuaciones en\n"
			+ "orden descendente (de la más alta a la más baja).");
	System.out.println("18. Crea un programa que pida dos cadenas de texto por teclado y luego\n"
			+ "indique si son iguales, además de si son iguales sin diferenciar entre\n"
			+ "mayúsculas y minúsculas.");
	System.out.println("19. Función que pida 7 palabras por teclado y las muestre ordenadas\n"
			+ "alfabeticamente");
	System.out.println("Escribe cero ( 0 ) para salir: ");
	
}

public static void opcionMenu(int opcion) {
	
do {
	menu();	
	System.out.println("Escribe el número de la opción que quieras");
	opcion=teclado.nextInt();
	elijeOpcion(opcion);
} while (opcion!=0);
System.out.println("***********SALIENDO**************");
}

public static void elijeOpcion (int opcion) {
	
	switch (opcion) {
	case 1: arrayAs1(); break;
	case 2:	arrayDes2(); break;
	case 3: arrayPar3(); break;
	case 4: arrayImpar4(); break;
	case 5: arrayPrimo5(); break;
	case 6: arrayOperaciones6(); break;
	case 7: arrayOrden7(); break;
	case 8:	break;
	case 9: arrayMultiplicacion9(); break;
	case 10: break;
	case 11: arrayCienPrimos11(); break;
	case 12: arrayMedia12(); break;
	case 13: break;
	case 14: arrayBuscar14(); break;
	case 15: arrayMayorMenor15(); break;
	case 16: arrayRamdom16(); break;
	case 17: arrayAjedrez17(); break;
	case 18: cadenaComparar18(); break;
	case 19: palabrasOrden19(); break;
	
	default:	break;
	}
	
}

public static void arrayAs1() {
	int [] array= new int[100];
	int llenado=1;
	for (int i = 0; i < array.length; i++) {
		array[i]=llenado++;
		System.out.print(array[i]);
		System.out.print(" : ");
		
	}
	siguiente();
}

public static void arrayDes2() {
	int [] array= new int[100];
	int llenado=1;
	for (int i = 0; i < array.length; i++) {
		array[i]=llenado++;
		
	}
	for (int i =array.length-1; i>=0; i--) {
		System.out.print(array[i]);
		System.out.print(" : ");
	}
	siguiente();
}

public static void arrayPar3() {
	int [] par= new int[50];
	int llenado=2;
	for (int i = 0; i < par.length; i++) {
		par[i]=llenado;
		llenado+=2;	
	}
	for (int i = 0; i < par.length; i++) {
		System.out.print(par[i]);
		System.out.print(" : ");	
	}
	siguiente();
}

public static void arrayImpar4() {
	int [] impar= new int[50];
	int llenado=1;
	for (int i = 0; i < impar.length; i++) {
		impar[i]=llenado;
		llenado+=2;	
	}
	for (int i = 0; i < impar.length; i++) {
		System.out.print(impar[i]);
		System.out.print(" : ");	
	}
	siguiente();
}

public static void arrayPrimo5() {
	int limite=100,contador=0;
	int[] primos  = new int[25];
	
	for (int numero = 2; numero <= limite; numero++) {
		boolean primo=true;
			for (int i = 2; i < numero; i++) {
				if (numero % i==0) {
					primo=false;
					break;
				}
			}
			if (primo) {
			primos[contador]=numero;
			contador++;
			}
	}
	for (int i = 0; i < contador; i++) {
		System.out.print(primos[i]);
		System.out.print(" : ");
	}
	siguiente();
}

public static void arrayOperaciones6() {
	int[] operaciones=new int[10];
	int suma =0;
	int resta=0;
	int multi=1;
	int division=0;
	int indice=1;
	int auxMul=0;
	int auxDiv=0;
	for (int i = 0; i < operaciones.length; i++) {
		
		System.out.println("["+indice+"]"+" "+"Escriba el número que quieras: ");
		 operaciones[i]=teclado.nextInt();
		 suma+=operaciones[i];
		 resta-=operaciones[i];
		 auxMul=operaciones[i]*operaciones[i];
		 multi*=auxMul;
		 auxDiv=operaciones[i]/operaciones[i];
		 division/=auxDiv;
		 indice++;
	}
	
	System.out.println("La suma es: "+suma);
	System.out.println("La resta es: "+resta);
	System.out.println("La multiplicación es: "+multi);
	System.out.println("La división es: "+division);
	
	
	siguiente();
}

public static void arrayOrden7() {
	int[] orden=new int[10];
	int indice=1;
	
	for (int i = 0; i < orden.length; i++) {
		System.out.println("["+indice+"]"+" "+"Escriba el número que quiera");
		 orden[i]=teclado.nextInt();
		indice++;	
	}
	for (int i = 0; i < orden.length; i++) {
		for (int j = 0; j < orden.length; j++) {
			if (orden[j]>orden[i]) {
				int aux= orden[j];
				orden[j]=orden[i];
				orden[i]=aux;
			}
		}
	}
	for (int i = 0; i < orden.length; i++) {
		System.out.print(orden[i]);
		System.out.print(" : ");	
	}
	siguiente();
}

public static void arrayMultiplicacion9() {
	int[] array=new int[5];
	int[] multiplicacion=new int[5];
	int indice=1;
	
	for (int i = 0; i < array.length; i++) {
		System.out.println("["+indice+"]"+" "+"Escriba el número que quieras: ");
		 array[i]=teclado.nextInt();
		 multiplicacion[i]=array[i]*2;
		indice++;	
	}
	
	for (int i = 0; i < multiplicacion.length; i++) {
		for (int j = 0; j < multiplicacion.length; j++) {
			if (multiplicacion[j]>multiplicacion[i]) {
				int aux= multiplicacion[j];
				multiplicacion[j]=multiplicacion[i];
				multiplicacion[i]=aux;
			}
		}
	}
	for (int i = 0; i < multiplicacion.length; i++) {
		System.out.print(multiplicacion[i]);
		System.out.print(" : ");	
	}
	siguiente();
}

public static void arrayCienPrimos11() {
	int [] par= new int[100];
	int llenado=2;
	int aux=0;
	for (int i = 0; i < par.length; i++) {
		par[i]=llenado;
		llenado+=2;	
		aux+=par[i];
	}
	
	for (int i = 0; i < par.length; i++) {
		System.out.print(par[i]);
		System.out.print(" : ");
	
	}
	System.out.println(" ");
	System.out.println("La suma es: "+aux);
	
	siguiente();
}

public static void arrayMedia12() {
	int[] orden=new int[10];
	int indice=1;
	int suma=0;
	
	for (int i = 0; i < orden.length; i++) {
		System.out.println("["+indice+"]"+" "+"Escriba el número que quieras: ");
		 orden[i]=teclado.nextInt();
		indice++;
		suma+=orden[i];
	}
	for (int i = 0; i < orden.length; i++) {
		System.out.print(orden[i]);
		System.out.print(" : ");
	}
	
	System.out.println(" ");
	System.out.println("La media es: "+(suma/10));
	
	siguiente();
}

public static void arrayBuscar14() {
	int[] orden=new int[20];
	int numero=0;
	int igual=0;
	
	for (int i = 0; i < orden.length; i++) {
		orden[i]=(int) (Math.random() * 20+1);	
	}
	
	System.out.println("Escriba el número que quieres encontrar: ");
	numero=teclado.nextInt();
	
	for (int i = 0; i < orden.length; i++) {
		if (numero!=orden[i]) {
			
		}else if(numero==orden[i]){
			igual=+1;
			}
	}	
	for (int i = 0; i < orden.length; i++) {
		System.out.print(orden[i]);
		System.out.print(" : ");
	}
	if (igual>=1) {
		System.out.println(" ");
		System.out.println("Número encontrado");
	} else {
		System.out.println(" ");
		System.out.println("Número no encontrado");
	}
	siguiente();
}

public static void arrayMayorMenor15() {
	int tamanio=0;
	int indice=1;
	int mayor=0;
	int menor=99999999;
	int contadorMax=0;
	int contadorMin=0;
	
	System.out.println("Escribe el tamaño: ");
	tamanio=teclado.nextInt();
	
	int[] miArray =new int[tamanio];
	
	for (int i = 0; i < miArray.length; i++) {
		System.out.println("["+indice+"]"+" "+"Escriba el número que quieras: ");
		 miArray[i]=teclado.nextInt();
		indice++;
	}
	
	for (int i = 0; i < miArray.length; i++) {
		menor=Math.min(miArray[i], menor);
		mayor=Math.max(miArray[i], mayor);
	}
	
	for (int i = 0; i < miArray.length; i++) {
		if (mayor==miArray[i]) {
			contadorMax++;
		} else if (menor==miArray[i]){
			contadorMin++;
		}
	}
	
	System.out.println("El número mayor es: "+mayor);
	System.out.println("Ha aparecido: "+ contadorMax);
	System.out.println("El número menor es: "+menor);
	System.out.println("Ha aparecido: "+ contadorMin);
	
	siguiente();
}

public static void arrayRamdom16() {
	
	int[] orden=new int[30];
	
	for (int i = 0; i < orden.length; i++) {
		orden[i]=(int) (Math.random() * 9+0);
	}
	
	for (int i = 0; i < orden.length; i++) {
		for (int j = 0; j < orden.length; j++) {
			if (orden[j]>orden[i]) {
				int aux= orden[j];
				orden[j]=orden[i];
				orden[i]=aux;
			}
		}
	}
	
	for (int i = 0; i < orden.length; i++) {
		System.out.print(orden[i]);
		System.out.print(" : ");
	}
	siguiente();	
}

public static void arrayAjedrez17() {
	
	int[] orden=new int[8];
	int indice=1;
	int puntucion=0;
		

	for (int i = 0; i < orden.length; i++) {
		System.err.println("La puntuación tiene que estar comprendida entre 100 y 280");
		System.out.print("Jugador: "+" "+indice+" "+" "+"escriba la puntación: ");
		puntucion=teclado.nextInt();
		
		if (puntucion>=100 && puntucion<=280) {
			orden[i]=puntucion;
		}else {
			System.out.println("Puntuación equivocada");
			indice--;
			i--;
		}
		indice++;
	}
	
	for (int i = 0; i < orden.length; i++) {
		for (int j = 0; j < orden.length; j++) {
			if (orden[j]<orden[i]) {
				int aux= orden[j];
				orden[j]=orden[i];
				orden[i]=aux;
			}
		}
	}
	System.out.println("La puntuación ha sido: ");
	for (int i = 0; i < orden.length; i++) {
		System.out.print(orden[i]);
		System.out.print(" : ");
	}
	siguiente();
}

public static void cadenaComparar18() {
	String palabra1="a";
	String palabra2="A";
	
	System.out.println("Escriba la frase que quieras: ");
	palabra1=teclado.next();
	System.out.println("Escriba la frase a comparar: ");
	palabra2=teclado.next();
	
	if (palabra2.equalsIgnoreCase(palabra1) ) {
		System.out.println("Las frases son iguales");
	} else  {
		System.out.println("Las frases son distintas");
	}
	siguiente();
}

public static void palabrasOrden19() {
	String[] palabras =new String[7];
	int indice=1;
	
		for (int i = 0; i <palabras.length; i++) {
			
			System.out.println("Escribe la "+ indice+" palabra");
			palabras[i]=teclado.next();
			
		indice++;
		}
	
		for(int i=1; i<=palabras.length; i++) {  
			for(int j=0; j<palabras.length-i; j++) { 
				if( palabras[j].compareTo( palabras[j+1] ) > 0 ) { 
					String aux   = palabras[j]; 
					palabras[j]  = palabras[j+1]; 
					palabras[j+1]= aux; 
            }    
        } 
    }
	
		for (int i = 0; i < palabras.length; i++) {
		System.out.print(palabras[i] + ", ");
		}
		siguiente();
}	

public static void siguiente( ) {
	System.out.println("");
	System.out.println("¿ Quiéres continuar ?");
	System.out.println("Pulsa S/N");
	String pulsa=teclado.next();
	
	if (pulsa.equalsIgnoreCase("s")) {
		menu();
	} else {
		
		
	}

}

}
