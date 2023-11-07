import java.util.Scanner;

public class starWars {

private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		inicio();	
	
	}

	public static void inicio(){
		System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
				+ "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n"
				+ "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"
				+ "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"
				+ "está construyendo para destruirla. (Presiona Intro para continuar)");
			teclado.nextLine();
			nivel1();
	}
	
	public static void nivel1() {
	int s1=(int) (1 + Math.random() * (10 - 1 + 1));
	int s2=(int) (20 + Math.random() * (30 - 20 + 1));
	int sumatorio=0;
	int dato=0;
		System.out.println("*******NIVEL 1 ******");
		System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
				+ "sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el\n"
				+ "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
				+ "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
				+ "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
				+ "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
				+ "¿Qué debe introducir?");
		
			System.out.println("El número de sistemas es: "+s1);
			System.out.println("El número del sector  es: "+s2);
			
			for (int i = s1; i <= s2; i++) { //sumamos desde s1 hasta s2
				sumatorio+=i;
			}
			System.out.println("Tú respuesta es: ");
			dato=teclado.nextInt();
			
			if (dato==sumatorio||dato==0) { //"dato ==0" espara no hacer la operacion
				nivel2();
			} else {
				perder();
			}
			
	}
	
	
	public static void nivel2() {
		int r1=(int) (1 + Math.random() * (7 - 1 + 1));
		int r2=(int) (8 + Math.random() * (12 - 8 + 1));
		int multiplicar=0;
		int dato=0;
		System.out.println("*******NIVEL 2 ******");
		System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
				+ "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
				+ "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n"
				+ "agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados\n"
				+ "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh…\n"
				+ "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para\n"
				+ "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n"
				+ "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n"
				+ "manual del piloto que estaba en la guantera y da con la página correcta. El código\n"
				+ "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
				+ "¿Cuál es el código?");
		
			System.out.println("El número del agente es: "+r1);
			System.out.println("El número de la nave es: "+r2);
		
			for (int i = r1; i <= r2; i++) { //multiplicar desde s1 hasta s2
				multiplicar+=i;
			}
			System.out.println("Tú respuesta es: ");
			dato=teclado.nextInt();
		
			if (dato==multiplicar||dato==0) { //"dato ==0" es para no hacer la operacion
				nivel3();
			} else {
				perder();
			}
		
	}
	
	static public void nivel3() {
		int numero=(int) (50 + Math.random() * (100 - 50 + 1));
		int factorial=1;
		int resultado=0;
		int aux=0;
		System.out.println("*******NIVEL 3 ******");
		System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n"
				+ "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
				+ "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se\n"
				+ "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
				+ "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
				+ "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n"
				+ "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n"
				+ "(redondeando N hacia abajo), donde N es el no de niveles”.\n"
				+ "¿Cual es el nivel correcto?");
	
			
			int cantidad=numero/10;
			
		for (int i = 1; i <= cantidad; ++i) {
			factorial=factorial*i;
			    }
		 System.out.println("El númeroo de nivel es: "+cantidad);
		 System.out.println("Su factorial es: ");
		 System.out.println(factorial);
		 resultado=teclado.nextInt();
		 
		 
		

		if (resultado==factorial||resultado==0) { //"dato ==0" esp ara no hacer la operacion
			nivel4();
		} else {
			perder();
		}
		
		
	}
	
	public static void nivel4() {
		
		int primo = (int) (10 + Math.random() * (100 - 10 + 1));
		int resultado=0;
		int afirmacion=1;
		
			System.out.println("*******NIVEL 4 ******");
			System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
					+ "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
					+ "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
					+ "verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es\n"
					+ "introduce un 0.");
		
			 // El 0, 1 y 4 no son primos
			  if (primo == 0 || primo == 1 || primo == 4) {
			    afirmacion=0;
			  }
			  for (int x = 2; x < primo / 2; x++) {
			    // Si es divisible por cualquiera de estos números, no
			    // es primo
			    if (primo % x == 0)
			      afirmacion=0;
			  }
			 
			System.out.println("Numero de Puerta "+primo);
			System.out.println("Si es primo marca 1 si no marca 0");
			resultado=teclado.nextInt();
			
			if (resultado==1 && afirmacion==1) { //"dato ==0" es para no hacer la operacion
				nivel5();
			} else if(resultado==0 && afirmacion==0){
				nivel5();
			}else {
				perder();
			}
	}
	
	public static void nivel5() {
		int multiplicacion1=(int) (5 + Math.random() * (10 - 5 + 1));
		int multiplicacion2=(int) (5 + Math.random() * (10 - 5 + 1));
		int total=0;
		int resultado=0;
		
		System.out.println("*******NIVEL 5 ******");
		System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
				+ "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
				+ "explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n"
				+ "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
				+ "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
				+ "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
				+ "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");
		
		int cantidad=multiplicacion1;
		
		for (int i = 1; i <= cantidad; ++i) {
			multiplicacion1=multiplicacion1*i;
			    }
		int cantidad1=multiplicacion2;	
		for (int i = 1; i <=cantidad1 ; i++) {
			multiplicacion2=multiplicacion2+1;
		}
		
		total=multiplicacion1+multiplicacion2;
		
		System.out.println("Los Minutos son: "+multiplicacion1);
		System.out.println("Los Segundos son: "+multiplicacion2);
		System.out.println(" ");
		System.out.println("El resultado es: ");
		resultado=teclado.nextInt();
		
		if (resultado==total||resultado==0) { //"dato ==0" esp ara no hacer la operacion
			ganar();
		} else {
			perder();
		}
	}
	 public static void ganar() {
		 System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"
		 		+ "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
		 		+ "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
		 		+ "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
		 		+ "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
		 		+ "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
		 		+ "imperio.\n"
		 		+ "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
	
		 fin();
	 }
	public static void fin() {
		System.out.println(" ");
		System.out.println("Gracias por jugar :D");
	}
	
	public static void perder() {
		System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
				+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
		fin();
	}
}
