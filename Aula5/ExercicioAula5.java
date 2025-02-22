package Aula5;

public class ExercicioAula5 {
    public static void main(String[] args) {
        // Crie um objeto da classe Aluno.
        Aluno aluno = new Aluno();

        // Altere o nome, idade e nota do aluno.
        aluno.setNome("João");
        aluno.setIdade(20);
        aluno.setNota(7.5);

        // Obtenha o nome, idade e nota do aluno.
        String nome = aluno.getNome();
        int idade = aluno.getIdade();
        double nota = aluno.getNota();

        // Imprima o nome, idade e nota do aluno.
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }
}
