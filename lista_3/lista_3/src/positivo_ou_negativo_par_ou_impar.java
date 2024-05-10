// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 10/05/2023
/*  Nome do programa: 4) positivo_ou_negativo_par_ou_impar Usúario digita 1 valor e mostra
 se ele é positivo ou negativo e par ou impar  */ 

import java.util.Scanner;

public class positivo_ou_negativo_par_ou_impar {

public static void main (String[]args){

Scanner teclado = new Scanner (System.in);

System.out.println(" Digite o 1º número ");
int n1 = teclado.nextInt();

if(n1%2==0){
    System.out.println(" Esse número é par ");
}else{
    System.out.println(" Esse número é impar ");

}

if (n1 >=0 ) {
System.out.println(" O número e positivo");    
}

else if(n1 <0) {
    System.out.println(" O número e negativo ");
    }
 


}}