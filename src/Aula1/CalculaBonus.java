package Aula1;

import java.util.Scanner;

public class CalculaBonus {
    public static void main (String[] args) {

        /*
Salário com Bônus

Um funcionário recebe um salário e um bônus. Escreva um programa que:
Leia o nome do funcionário
Leia o salário base
Leia a porcentagem do bônus
Calcule o valor do bônus (salário × porcentagem / 100)
Calcule o salário final (salário + bônus)
Exiba o nome, salário base, valor do bônus e salário final
Entrada: Nome, salário base, porcentagem de bônus Saída: Detalhamento do cálculo
*/

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String nome = scanner3.nextLine();

        System.out.println("Digite seu salário base: ");
        double salariobase = scanner3.nextDouble();

        System.out.println("Qual a porcentagem de bonus? ");
        double porcentagem = scanner3.nextDouble();

        double bonus = (salariobase * porcentagem) / 100;

        double salariofinal = salariobase + bonus;

        System.out.println("Seu bonus é de R$" + bonus + " reais, com valor final de: R$" + salariofinal);




    }

}

