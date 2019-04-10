package TrabalhoExtra;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantas palavras deseja ordenar");
        int n = entrada.nextInt();

        String vetor[] = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println(i + 1 + " palavra");
            vetor[i] = entrada.next();
        }
        
        bubbleSort(vetor);
        for(int i = 0; i < n; i++){
            System.out.print(vetor[i] + "   ");
        }

    }

    public static void bubbleSort(String vetor[]) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    String aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
