import java.util.Scanner;

public class Atividade01_Questao07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int A, B;
		
		System.out.println("Escreva um valor para A:");
		A = entrada.nextInt();
		
		System.out.println("Escreva um valor para B:");
		B = entrada.nextInt();
		
		if(A < 10) {
			System.out.println("numero nao valido");
			
		}else if(A>10 || A + B == 20) {
			System.out.println("numeros validos");
		}
		
		entrada.close();
	}

}
