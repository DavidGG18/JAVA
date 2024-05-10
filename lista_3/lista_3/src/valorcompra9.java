// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 19/05/2023
// Nome do programa: 9) valorcompra9

import java.util.Scanner;

public class valorcompra9 {
public static void main(String[]args) throws Exception {

Scanner teclado = new Scanner(System.in);

Double compra;
String Tipo;
int Tipoo;

System.out.println(" Digite o valor da sua compra ");
compra = teclado.nextDouble();

System.out.println( " Digite o Tipoo de pagamento ");
Tipo = teclado.next();
Tipoo = teclado.nextInt();

/*
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
*/


double Vista = compra * 0.10; 
double prazo30 = compra * 0.05;
double prazo90 = compra - (compra *0.05);
double cartaodebito = compra * 0.08;
double cartaocredito = compra * 0.07; 

if (Tipoo == 1){
System.out.printf(" O valor da compra vai ser de ", Vista);
}

else if (Tipoo == 2 ){
System.out.printf(" O valor do produto com prazo de 30 dias e com desconto de 5% é de %.2f ", prazo30);
}

else if (Tipoo == 3 ){
System.out.printf(" O valor do produto com prazo de 60 dias é  de %.2f ", compra);

}

else if (Tipoo == 4){
    System.out.printf(" O valor do produto com o prazo de 90 dias e de %.2f ", prazo90);
}
else if ( Tipoo == 5){
System.out.printf(" O valor do produto pago com cartão de debito é igual %.2f ", cartaodebito);
}

else if (Tipoo == 6){
System.out.printf(" O valor do produto pago com cartão de credito é de %.2f ", cartaocredito);
}



}}