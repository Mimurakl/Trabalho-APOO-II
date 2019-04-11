package TrabalhoExtra;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantas palavras deseja ordenar");
        int n = entrada.nextInt();

        String vetor[] = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println(i + 1 + " palavra");
            vetor[i] = entrada.next();
        }

        selectionSort(vetor);
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + "   ");
        }

    }

    public static void selectionSort(String vetor[]) {

        for (int j = 0; j < vetor.length - 1; j++) {

            int menor = j;
            for (int i = j + 1; i < vetor.length; i++) {
                if (vetor[i].compareTo(vetor[menor]) < 0) {
                    menor = i;
                }
            }

            String aux = vetor[j];
            vetor[j] = vetor[menor];
            vetor[menor] = aux;
        }
    }

}
