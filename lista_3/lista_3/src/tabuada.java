/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 21) tabuada : Mostrar a tabuada até o número digitado 
* Data: 22/04/23
*/


import java.util.Scanner;

public class tabuada  {
public static void main (String[]args){
Scanner teclado = new Scanner(System.in);
int numero;

System.out.println(" Digite um número ");
numero = teclado.nextInt();

    int[][] matriz = new int[10][10];
    int i, j;
    for (i = 0; i < numero; i++) { // i * X 
     for (j = 0; j < 10; j++) { // X * j
    matriz[i][j] = (i+1) * (j+1);
    int ii = i +1;
    System.out.println(" Tabuada de " + ii + "  "  + matriz[i][j]);
     }
    }


}}