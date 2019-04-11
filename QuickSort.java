package TrabalhoExtra;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantas palavras deseja ordenar");
        int n = entrada.nextInt();

        String vetor[] = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println(i + 1 + " palavra");
            vetor[i] = entrada.next();
        }

        quickSort(vetor, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + "   ");
        }

    }

    private static void quickSort(String[] vetor, int inicio, int fim) {

        int i = inicio;

        int j = fim;

        if (j - i >= 1) {

            String pivo = vetor[i];

            while (j > i) {

                while (vetor[i].compareTo(pivo) <= 0 && i < fim && j > i) {
                    i++;
                }

                while (vetor[j].compareTo(pivo) >= 0 && j > inicio && j >= i) {
                    j--;
                }

                if (j > i) {
                    trocar(vetor, i, j);
                }
            }

            trocar(vetor, inicio, j);

            quickSort(vetor, inicio, j - 1);

            quickSort(vetor, j + 1, fim);
        }
    }

    private static void trocar(String[] a, int i, int j) {
        String aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

}
