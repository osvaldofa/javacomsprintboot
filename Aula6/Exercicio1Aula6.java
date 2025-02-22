package Aula6;

public class Exercicio1Aula6 {

    // O método deve pedir para o operador digitar o nome, idade e nota do aluno.
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do aluno:");
        estudante.setNome(System.console().readLine());

        System.out.println("Digite a idade do aluno:");
        estudante.setIdade(Integer.parseInt(System.console().readLine()));

        System.out.println("Digite a nota do aluno:");
        estudante.setNota(Double.parseDouble(System.console().readLine()));

        estudante.imprimir();
    }
}
