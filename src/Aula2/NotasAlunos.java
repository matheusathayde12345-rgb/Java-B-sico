package Aula2;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args){

        /*
Classificação de Notas

Faça um programa que leia uma nota (0 a 10) de um aluno e classifique-a conforme:
9-10: Excelente
7-8.9: Bom
5-6.9: Satisfatório
0-4.9: Insuficiente
Entrada: Uma nota em decimal Saída: Classificação da nota
 */
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite a nota");
        Double notas = scanner1.nextDouble();

        if (notas <= 4){
            System.out.println("Insuficiente");
        }
        else if (notas <= 6) {
            System.out.println("Satisfatório");
        }
        else if (notas <= 8 ) {
            System.out.println("Bom");
        }
        else if (notas > 10) {
            System.out.println("Nota inválida");
        }
        else {
            System.out.println("Excelente");
        }
    }
}
