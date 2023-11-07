package arrays;

public class Ejercicio_74 {
public static void main(String[] args) {


    int[] numeros = new int[10 * (10 + 1) / 2];
    int index = 0;

    for (int i = 1; i <= 10; i++) {
        for (int j = 0; j < i; j++) {
            numeros[index] = i;
            index++;
        }
    }

    for (int value : numeros) {
        System.out.print(value + " ");
    }
}
}
