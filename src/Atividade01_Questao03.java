import java.util.Scanner;
//Ana Lilian Sousa Coelho - 556697
public class Atividade01_Questao03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);               //criei um objeto scanner para ler oq o usuario digitar.
		int A, B;                                               //declarei duas variaveis int.

		System.out.println("Informe um valor inteiro para A:"); //pedi ao usuario que digite um numero inteiro para A.
		A = entrada.nextInt();                                  //A vai armazenar esse numero.

		System.out.println("Informe um valor inteiro para B:"); //pedi ao usuario que digite um numero inteiro para A.
		B = entrada.nextInt();                                  //B vai armazenar esse numero.

		if (A==10) {                                            //Se A e igual a 10
			System.out.println("A == 10");                      //Imprime "A == 10"
		}
		if (A+B==20) {                                          //Se A mais B for 20
			System.out.println("A + B == 20");                  //Imprime "A + B == 20"
		}
		if (B==10) {                                            //Se B for igual a 10
			System.out.println("B == 10");                      //Imprime "B == 10"
		}                                                       //Isso permite as 3 impressoes sem intervir uma na outra
		
		entrada.close();                                        //fechar o objeto escanner para parar a leitura da entrada.
	}

}
