// Nome do Aluno : David Gabriel Fonseca Simôes
// Ra: 32312961
// Data: 10/05/2023
// Nome do programa: 5) mostrar_dados

import java.util.Scanner;

public class mostrar_dados {
public static void main(String[]args){
Scanner teclado = new Scanner(System.in);

System.out.println(" Digite seu nome ");
String nome = teclado.next();

System.out.println( " Digite seu sobrenome " );
String sobrenome = teclado.next();

System.out.println( " Digite sua cidade de nascimento ");
String cidade = teclado.next();

System.out.println(" Digite sua idade ");
int idade = teclado.nextInt();

System.out.println(" Você deseja ver seus dados completos digite 1 ou 2 ");
int respostar = teclado.nextInt();

if(respostar== 1){
    System.out.printf( " Seus dados são Nome: %s Sobrenome: %s Cidade: %s, Idade: %d " , nome, sobrenome,cidade, idade);
}
else if(respostar == 2){
    System.out.printf(" Seus dados são Nome: %s Idade: %d  ",nome, idade);
}


}}