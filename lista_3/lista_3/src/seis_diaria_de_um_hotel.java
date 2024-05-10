// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 19/05/2023
// Nome do programa: 7)  Calcular_a_diaria_de_um_hotel

import java.util.Scanner;

public class seis_diaria_de_um_hotel {

public static void main(String[]args) throws Exception {
Scanner teclado = new Scanner(System.in);

int diaria;
double valor;

Double diariamenor15 = 68.00; 
Double diariaigual15 = 66.00;
Double diariamaior15 = 65.50;

/* 
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
*/

System.out.println(" Digite quantos dias que você ficou no hotel ");
diaria = teclado.nextInt();


if (diaria <15){

    System.out.printf(" O valor total da sua estadia no hotel é de R$ %.2f ", diariamenor15);
}

else if ( diaria == 15 ) {
    System.out.printf(" O valor total da sua estadia no hotel  é de R$ %.2f", diariaigual15);
} 
else if ( diaria >= 16 ) {
    System.out.printf(" O valor total da sua estadia no hotel  é de R$ %.2f", diariamaior15);
}else {
    System.out.printf(" Erro 404 ");
}

}}