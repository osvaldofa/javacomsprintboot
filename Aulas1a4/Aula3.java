package Aulas1a4;
import java.util.Scanner;

/*
 * Nesse exemplo vamos aprender sobre variáveis e entrada de dados.
 * A classe Scanner é utilizada para ler dados do teclado.
 * O método nextInt() é utilizado para ler um número inteiro. 
 * O método next() é utilizado para ler uma string.
 * O método close() é utilizado para fechar o scanner.
 */
public class Aula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}
