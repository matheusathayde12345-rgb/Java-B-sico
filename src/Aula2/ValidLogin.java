package Aula2;

import java.util.Scanner;

public class ValidLogin {
    public static void main (String[] args){

        /*
Validação de Login

Crie um programa que simule um login. O programa deve:
Ler um nome de usuário e uma senha
Verificar se o usuário é "admin" E a senha é "1234"
Se ambos estiverem corretos, exiba "Login realizado!"
Caso contrário, exiba "Usuário ou senha incorretos"
Entrada: Usuário e senha Saída: Mensagem de sucesso ou erro
 */

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite seu login");
        String user = scanner1.nextLine();

        System.out.println("Digite sua senha");
        String senha = scanner1.nextLine();


        if (user.equals("admin") && senha.equals("1234")){
            System.out.println("Login realizado com sucesso");
        }
        else {
            System.out.println("Usuário ou senha incorretos");
        }


    }
}
