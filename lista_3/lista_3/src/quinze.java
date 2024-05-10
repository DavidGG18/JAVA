// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 20/05/2023
// Nome do programa: 15) quinze : matriz 10 por 10 com todas posições = 0

public class quinze {
public static void main(String[]args) {

int [][]matrizz = new int [10][10];
  // I é igual a linha  e  J é igual a coluna
         /* linha*/ for (int i = 0; i < 10; i++) {
         /* Coluna */   for (int j = 0; j < 10; j++) {
            matrizz[i][j] = 0;
        }
    }


    System.out.println("Matriz preenchida com zeros:");
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.print(matrizz[i][j] + " ");
        }
        System.out.println();
    }



}}
