import java.util.Scanner;

public class Atividade01_Questao20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);               
		int A, B;                                               
		
		System.out.println("Informe um valor inteiro para A:"); 
		A = entrada.nextInt();                                 

		System.out.println("Informe um valor inteiro para B:"); 
		B = entrada.nextInt();                            
		
		if(A>10 || A + B == 20) {
			System.out.println("numeros validos");
		}else {
			System.out.println("numero nao valido");
		}
		
		System.out.println("Sejam bem-vindos a disciplina de Tecnicas de Programaçao.");
		
		entrada.close();
	}

}