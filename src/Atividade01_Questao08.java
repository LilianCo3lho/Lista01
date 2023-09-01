import java.util.Scanner;

public class Atividade01_Questao08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite um numero para A:");
		A = entrada.nextInt();
		
		System.out.println("Digite um numero para B:");
		B = entrada.nextInt();
		
		if(A>10) {
			System.out.println("Numero Valido");
		}
		if(A+B==20) {
			System.out.println("Numero Valido");
		}else {
			System.out.println("Numero nao valido");
		}
		
		entrada.close();
	}
}
