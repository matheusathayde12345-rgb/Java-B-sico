package Aula3;

public class Funcoes {
    public static void main (String[] args) {
        int a = 5;
        int b = 5;

        int soma = a + b;

        System.out.println("O resultado é " + somar (a, b) );
    }

    public static int somar(int num1, int num2) {
        int resultado = num1 + num2;
        return  resultado;

    }
}
