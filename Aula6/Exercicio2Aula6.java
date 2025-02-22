package Aula6;

public class Exercicio2Aula6 {
    // O método deve criar uma variável booleana chamada entrarComNovosAlunos e atribuir o valor true.
    // O método deve criar um laço de repetição que se repita enquanto entrarComNovosAlunos for true.
    // O método deve pedir para o operador digitar o nome, idade e nota do aluno.
    // O método deve imprimir o nome, idade, nota e status do aluno.
    // O método deve perguntar se o operador deseja entrar com novos alunos.
    // Caso o valor seja não ou nao, a variável entrarComNovosAlunos deve receber o valor false.
    // Caso o valor seja sim ou sim, o laço de repetição deve continuar.
    public static void main(String[] args) {
        // Variável booleana (falso ou verdadeiro)
        boolean entrarComNovosAlunos = true;

        // Estrutura de repetição (enquanto)
        while (entrarComNovosAlunos) {
            Estudante estudante = new Estudante();

            System.out.println("Digite o nome do aluno:");
            estudante.setNome(System.console().readLine());

            System.out.println("Digite a idade do aluno:");
            estudante.setIdade(Integer.parseInt(System.console().readLine()));

            System.out.println("Digite a nota do aluno:");
            estudante.setNota(Double.parseDouble(System.console().readLine()));

            estudante.imprimir();

            System.out.println("Deseja entrar com novos alunos? (sim/não)");
            String resposta = System.console().readLine();

            if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                entrarComNovosAlunos = false;
            }
        }
    }
}
