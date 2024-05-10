// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 10/05/2023
// Nome do programa: maior1 Usúario digita um valor e mostrar o maior  

import java.util.Scanner;

public class maior1 {
    public static void main(String []args){

Scanner teclado = new Scanner(System.in);        

 
int n1, n2;

System.out.print(" Digite o primeiro número ");
n1 = teclado.nextInt(); 

System.out.print(" Digite o segundo número ");
n2 = teclado.nextInt();

if(n1>n2) {
    System.out.printf(" O maior número e o primeiro " + n1 );

    }else if (n2>n1) {
        System.out.printf(" O maior número e o segundo " +  n2);
    }

    }}