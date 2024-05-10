// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 19/05/2023
// Nome do programa: 14)vetor50posi0  Um vetor de 50 posições preenchidos com 0 
public class vetor50posi0{
public static void main(String[] args) {
    // Cria um vetor de tamanho 50
    int[] vetor = new int[50];

    // Preenche o vetor com o valor zero
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = 0;
    }

    // Imprime o vetor preenchido
    System.out.println("Vetor preenchido com zeros:");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
}
}