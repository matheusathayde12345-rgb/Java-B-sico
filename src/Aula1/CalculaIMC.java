package Aula1;

import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        /*
Cálculo do IMC

Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve:
Ler o nome, peso (em kg) e altura (em metros)
Calcular o IMC usando a fórmula: IMC = peso / (altura²)
Exibir o nome da pessoa e seu IMC
Entrada: Nome (String), peso (double), altura (double) Saída: Mensagem com nome e IMC
 */

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scanner2.nextLine();

        System.out.println("Digite seu peso: ");
        Double peso = scanner2.nextDouble();

        System.out.println("Digite sua altura: ");
        Double altura = scanner2.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println("Olá, " + nome + " seu IMC é de " + imc);
    }
}
