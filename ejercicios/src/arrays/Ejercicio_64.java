package arrays;

import java.util.Random;

public class Ejercicio_64 {

	public static void main(String[] args) {
		int[] numeros = new int[20];

        // Generar 20 números enteros aleatorios entre 1 y 100
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        int[] resultado = new int[20];
        int indicePares = 0;
        int indiceImpares = 0;

        // Separar los números en pares e impares y combinar en resultado
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                resultado[indicePares] = numero;
                indicePares++;
            } else {
                resultado[19 - indiceImpares] = numero;
                indiceImpares++;
            }
        }

        // Imprimir el array resultante
        System.out.println("Números reorganizados:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + resultado[i]);
        }
    }
}
	
