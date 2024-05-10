// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 10/05/2023
// Nome do programa: crescente Usúario digita 3 valor e mostra em ordem crescente  

import java.util.Scanner;
public class crescente {
public static void main(String []args){

Scanner teclado = new Scanner(System.in);

System.out.print(" Digite o 1º número " );
int n1 = teclado.nextInt();

System.out.print(" Digite o 2º número " );
int n2 = teclado.nextInt();

System.out.print(" Digite o 3º número " );
int n3 = teclado.nextInt();


if (n1 <= n2 && n2 <= n3) {
    System.out.println(" Ordem crescente " + n1 + " " + n2 + " " + n3);
} else if (n1 <= n3 && n3 <= n2) {
    System.out.println  (" Ordem crescente " + n1 + " " + n3 + " " + n2);
} else if (n2 <= n1 && n1 <= n3) {
    System.out.println( " Ordem crescente " + n2 + " " + n1 + " " + n3);
} else if (n2 <= n3 && n3 <= n1) {
    System.out.println( " Ordem crescente " + n2 + " " + n3 + " " + n1);
} else if (n3 <= n1 && n1 <= n2) {
    System.out.println( " Ordem crescente " + n3 + " " + n1 + " " + n2);
} else {
    System.out.println( " Ordem crescente " + n3 + " " + n2 + " " + n1);
}


}}