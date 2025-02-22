package Aula5;

// Nessa classe precisamos que no método main sejam criados dois alunos diferentes,
// para introduzirmos o conceito de array de objetos.
public class Exercicio2Aula5 {
    public static void main(String[] args) {
        // Crie um array de objetos da classe Aluno.
        Aluno[] alunos = new Aluno[2];

        // Crie um objeto da classe Aluno.
        Aluno aluno1 = new Aluno();

        // Altere o nome, idade e nota do aluno.
        aluno1.setNome("João");
        aluno1.setIdade(20);
        aluno1.setNota(7.5);

        // Adicione o aluno ao array de alunos na primeira posição (as posições começam em zero).
        alunos[0] = aluno1;

        // Crie um objeto da classe Aluno.
        Aluno aluno2 = new Aluno();

        // Altere o nome, idade e nota do aluno.
        aluno2.setNome("Maria");
        aluno2.setIdade(22);
        aluno2.setNota(8.0);

        // Adicione o aluno ao array de alunos.
        alunos[1] = aluno2;

       
        // Imprima o nome, idade e nota dos alunos.        

        System.out.println("Nome: " + alunos[0].getNome());
        System.out.println("Idade: " + alunos[0].getIdade());
        System.out.println("Nota: " + alunos[0].getNota());
        System.out.println("------------------------------");
        System.out.println("Nome: " + alunos[1].getNome());
        System.out.println("Idade: " + alunos[1].getIdade());
        System.out.println("Nota: " + alunos[1].getNota());
    }
}
