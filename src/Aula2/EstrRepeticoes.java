package Aula2;

import java.util.ArrayList;

public class EstrRepeticoes {
    public static void main (String[] args) {

        //for
        for (int i = 0; i <= 5; i++) {
            System.out.println("Contagem " +i);
        }

        //while

        int j = 0;
        while (j <= 5) {
            System.out.println("Contagem " +j);
            j++;
        }

        //do while
        int k = 0;
        do {
            System.out.println("Contagem " + k);
            k++;
        } while (k < 5);

        //arraylist
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Thiago");
        nomes.add("João");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }
    }
}
