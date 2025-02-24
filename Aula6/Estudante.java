package Aula6;

public class Estudante {
    // Atributos para armazenar o nome, idade e nota do aluno.
    private String nome;
    private int idade;
    private double nota;

    // Métodos para alterar e obter o nome, idade e nota do aluno.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);

        System.out.println("Status: " + getSituacaoAluno());
    }

    private String getSituacaoAluno(){
        if (nota >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
