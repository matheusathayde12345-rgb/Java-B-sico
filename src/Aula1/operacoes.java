package Aula1;

public class operacoes {
    public static void main(String[]args) {
        int a = 10;
        int b = 5;

        int soma = a + b;
        System.out.println("Resultado é " + soma);

        int subtracao = a - b;
        System.out.println("Resultado da subtração é " + subtracao);

        int multiplicacao = a * b;
        System.out.println("Resultado da multiplicação é " +multiplicacao);

        int divisao = a / b;
        System.out.println("Resultado da divisão é " + divisao);

        //concatenação de strings
        String nome1 = "Matheus";
        String nome2 = "Athayde";

                String nomeCompleto = nome1 + nome2;
        System.out.println("Nome Completo: " +nomeCompleto);


    }
}
