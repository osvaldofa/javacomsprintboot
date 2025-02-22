package Aulas1a4;
import java.util.Scanner;

/*
 * Nesse exemplo vamos aprender sobre estruturas condicionais.
 * A estrutura condicional if é utilizada para tomar decisões.
 * A estrutura condicional if-else é utilizada para tomar decisões alternativas.
 */
public class Aula4 {    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de matemática: ");
        int nota = scanner.nextInt();

        // Se a nota for menor que 6, imprime "Reprovado",
        // caso contrário, imprime "Aprovado".
        if (nota < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        scanner.close();        
    }
}
