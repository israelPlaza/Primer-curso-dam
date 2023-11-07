package tareas;

import java.util.Scanner;
public class TresNumeros_29 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int num1,num2,num3;
		
		System.out.println("Escribe los tres números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 ==num2 && num1 == num3) {
			System.out.println("Son iguales");
		}else if(num1 ==num2 && num1 !=num3) {
			if (num1> num3) {
				System.out.println("Número  "+ num1);
			}else {
				System.out.println("Número  "+num3);
		}	
	}else if(num1 != num2 && num1==num3) {
		if(num1>num2) {
			System.out.println("Numero " +num1);
		}else
			System.out.println("numero " +num2);
	}else if (num1 != num2 && num2 ==num3) {

		if(num2 >num1) {
			System.out.println("numero "+num2);
		}else
			System.out.println("numero "+num1);
		
	}else {
		if(num1 > num2 ) {
			if(num1 >num3) {
			System.out.println("numero "+num1);
		}else {
			System.out.println("numero "+num3);
		}
			
		}else {
		if (num2 > num3) {
			System.out.println("numero "+num2);
		}else {
			System.out.println("numero "+num3);
			}
			}
		}	
	}
}
	