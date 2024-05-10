// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 10/05/2023
// Nome do programa: 3) multiplo dizer se um número e multiplo do outro 

import java.util.Scanner;

public class multiplo {
public static void main(String []args){

Scanner teclado = new Scanner(System.in);

System.out.println(" Digite um número ");
int n1 = teclado.nextInt();

System.out.println(" Digite outro número ");
int n2 = teclado.nextInt();

if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.printf(" Esses números São múltiplos porque %d / %d = %d ", n1, n2,n1);
        } else {
            System.out.println(" Esses números não são múltiplos");
        }

    }}