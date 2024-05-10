// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 10/05/2023
// Nome do programa: 6) nota 


import java.util.Scanner;

public class nota {
public static void main(String []args){

Scanner teclado =  new Scanner(System.in);

System.out.println(" Digite sua nota ");
Double Nota = teclado.nextDouble();


if(Nota == 0 && Nota <=49) {
System.out.println(" Seu conceito é Insuficiente ");
}

else if (Nota >= 50 && Nota <64) {
    System.out.println(" Seu conceito é Regular ");
}
 
else if (Nota >= 65  && Nota <84) {
    System.out.println(" Seu conseito é bom ");
}
else if (Nota >= 85 && Nota <=100) {
    System.out.println(" Seu conceito é Ótimo ");
}

}}