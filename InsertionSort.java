package TrabalhoExtra;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantas palavras deseja ordenar");
        int n = entrada.nextInt();

        String vetor[] = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println(i + 1 + " palavra");
            vetor[i] = entrada.next();
        }

        insertionSort(vetor);
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + "   ");
        }

    }

    public static void insertionSort(String vetor[]) {

        {
            String aux;
            for (int i = 1; i < vetor.length; i++) {
                aux = vetor[i];
                int j = 0;
                for (j = i; j > 0; j--) {
                    if (aux.compareTo(vetor[j - 1]) < 0) {
                        vetor[j] = vetor[j - 1];
                    } else {
                        break;
                    }
                }
                vetor[j] = aux;
            }
        }
    }

}
