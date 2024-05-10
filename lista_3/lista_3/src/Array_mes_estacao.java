// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 11/05/2023
/*  Nome do programa: 8) Usúario digita um número  de 1 a 12 e mostrar qual mês ele corresponde e a estação 
Usando switch case */

import java.util.Scanner;

public class Array_mes_estacao {
public static void main (String []args) {

Scanner teclado = new Scanner(System.in);

System.out.println(" Digite um número de 1 a 12 para saber o mês e a estação dele");
int numero = teclado.nextInt();

switch(numero){

case 1: System.out.println(" Mês Janeiro estação Verão ");
break;

case 2: System.out.println(" Mês Fevereiro Verão");
break;

case 3: System.out.println(" Mês Março estação Verão ");
break;
case 4: System.out.println(" Mês Abril estação Outono ");
break;
case 5: System.out.println(" Mês Maio estação Outono ");
break;
case 6: System.out.println(" Mês Junho estação Outono ");
break;
case 7: System.out.println(" Mês Julho estação Inverno ");
break;
case 8: System.out.println(" Mês Agosto estação Inverno ");
break;
case 9: System.out.println(" Mês Setembro estação Inverno ");
break;
case 10: System.out.println(" Mês Outubro estação Primavera ");
break;
case 11: System.out.println(" Mês Novembro estação Primavera ");
break;
case 12: System.out.println(" Mês Dezembro estação Primavera ");
break;

default: System.out.println(" Número incorreto ");
}

    }}