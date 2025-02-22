package Aula5;

public class Exercicio3Aula5 {
    public static void main(String[] args) {
        // Crie um array de objetos da classe Aluno.
        Estudante[] alunos = new Estudante[2];

        // Crie um objeto da classe Aluno.
        Estudante aluno1 = new Estudante();

        // Altere o nome, idade e nota do aluno.
        aluno1.setNome("João");
        aluno1.setIdade(20);
        aluno1.setNota(7.5);

        // Adicione o aluno ao array de alunos na primeira posição (as posições começam em zero).
        alunos[0] = aluno1;

        // Crie um objeto da classe Aluno.
        Estudante aluno2 = new Estudante();

        // Altere o nome, idade e nota do aluno.
        aluno2.setNome("Maria");
        aluno2.setIdade(22);
        aluno2.setNota(8.0);

        // Adicione o aluno ao array de alunos.
        alunos[1] = aluno2;

       
        // Imprima o nome, idade e nota dos alunos.
        alunos[0].imprimir();        
        System.out.println("------------------------------");
        alunos[1].imprimir();
    }
}
