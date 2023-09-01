import java.util.Scanner;
//Ana Lilian Sousa Coelho - 556697
public class Atividade01_Questao06 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);               //criei um objeto scanner para ler oq o usuario digitar.
		int A, B;                                               //declarei duas variaveis int.

		System.out.println("Informe um valor inteiro para A:"); //pedi ao usuario que digite um valor inteiro para A.
		A = entrada.nextInt();                                  //A vai armazenar esse numero.

		System.out.println("Informe um valor inteiro para B:"); //pedi ao usuario que digite um numero inteiro para A.
		B = entrada.nextInt();                                  //B vai armazenar esse numero.

		if (A>10) {												//Se A eh maior 10
			System.out.println("A > 10.");						//entra no if e imprime "A > 10"
		}else {													//Caso nao
			System.out.println("A <= 10.");						//Imprime "A<=10"
		}
		if(A + B == 20) {										//Se A mais B eh igual a 20
			System.out.println("A + B == 20");					//entra no if e imprime "A + B == 20" 
		}else {													//Caso nao
			System.out.println("A + B != 20");					//Imprime "A + B != 20"
		}
		entrada.close();                                        //fechar o objeto escanner para parar a leitura da entrada.
	}

}
