package Aula1;

import java.util.Scanner;

public class ConceitoScanner {

    public static void main(String[]args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner1.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner1.nextInt();

        System.out.println("Olá " + nome + "," + " Parabéns pelos seus " + idade + " anos");

    }
}
