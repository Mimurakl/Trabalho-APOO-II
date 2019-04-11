
package TrabalhoExtra;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantas palavras deseja ordenar");
        int n = entrada.nextInt();

        String vetor[] = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println(i + 1 + " palavra");
            vetor[i] = entrada.next();
        }

        mergeSort(vetor, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + "   ");
        }
        

    }
    
public static void mergeSort(String []vetor,int inicio, int fim) {
        
        if(inicio == fim){
            return;
        }	
        
        int meio = (inicio + fim)/2;
        
        mergeSort(vetor, inicio, meio);
        mergeSort(vetor, meio+1, fim);
        
        combinacao(vetor, inicio, meio, fim);
    }
   
    public static void combinacao(String[] vetor, int inicio, int meio, int fim){
      
        String []vetorAux = new String[vetor.length];
        for (int i = inicio; i <= fim; i++) {
	vetorAux[i] = vetor[i];
        }
        
        int e = inicio;
        int d = meio + 1;
        int k = inicio;
        
        while(e <= meio && d <= fim){
            if(vetorAux[e].compareTo(vetorAux[d]) < 0){
                vetor[k] = vetorAux[e];
                k+=1;
                e+=1;
                
            }
            else{
                vetor[k] = vetorAux[d];
                k++;
                d++;
            }
        }
        
        while(e <= meio){
            vetor[k] = vetorAux[e];
            e++;
            k++;
        }
        
        while(d <= fim){
            vetor[k] = vetorAux[d];
            d++;
            k++;
        }
    }
        
    
}
