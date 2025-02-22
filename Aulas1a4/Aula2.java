package Aulas1a4;

/*
 * Aula 2 - Introdução ao Java
 * Nesse exemplo vamos aprender sobre variáveis e tipos de dados.
 * Variáveis são espaços de memória que armazenam valores.
 * Tipos de dados são a forma como os valores são interpretados.
 * Java é uma linguagem fortemente tipada, ou seja, as variáveis devem ser declaradas com um tipo de dado.
 * Os tipos de dados primitivos são: int, float, double, char, boolean.
 * O tipo de dado String é uma classe, mas é muito utilizado como um tipo de dado primitivo.
 * O operador + é utilizado para concatenar strings.
 * O operador + é utilizado para somar números.
 */
public class Aula2 {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        int idade = 35;
        String nome = "Syllas";

        System.out.println("A idade do " + nome + " é " + idade + " anos.");

        int idadeFutura = idade + 10;
        System.out.println("Daqui a 10 anos o " + nome + " terá " + idadeFutura + " anos.");
    }
}
