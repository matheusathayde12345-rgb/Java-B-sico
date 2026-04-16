package Aula2;

public class EstrCondicionais {

    public static void main(String[] args) {

        int idade = 18;

        if (idade < 12) {
            System.out.println("Você é uma Criança");
        }
        else if ( idade < 18) {
            System.out.println("Você é um adolescente");
        }
        else {
            System.out.println("Você é um adulto");
        }
        //operador &&

        boolean carteira = true;
        boolean documento = true;

        if (carteira && documento && idade >=18) {
            System.out.println("Está habilitado para digirir");
        }
        else {
            System.out.println("Você não pode dirigir");
        }

        //operador || (OR)
        boolean temCarro = false;
        boolean temMoto = false;

        if (temMoto || temCarro) {
            System.out.println("Liberado para rodar");
        }
        else {
            System.out.println("Impossibilitado de rodar");
        }


    }
}
