import java.util.Scanner;


public class quatro {
    public static void main (String[]args) throws Exception{

Scanner teclado = new Scanner(System.in);
String nome, sobrenome, cidade;
int idade;
String resposta;

System.out.println(" Digite seu 1º nome ");
nome = teclado.next();

System.out.println(" Digite seu sobrenome ");
sobrenome = teclado.next();

System.out.println(" Digite a cidade em que você nasceu ");
cidade = teclado.next();

System.out.println(" Digite sua idade ");
idade = teclado.nextInt();

System.out.println(" Você quer ver seus dados completos digite s ou n ");
resposta = teclado.next();

/*
System.out.println (" Digite 1 ou 2");
int ressposta = teclado.nextInt();
*/
if (resposta == "Sim" ) {
System.out.printf("Seu dados são nome %s \n", nome);
System.out.printf("Seus dados sãa sobrenome %s \n", sobrenome);
System.out.printf("Seus dados são %s \n" , cidade);
System.out.printf("Seus dados são %s \n", idade);

}

if (resposta == "Não") {
    System.out.printf("Seu dados são nome %s \n", nome);
    System.out.printf("Seus dados são idade %s \n", idade);

}else {
System.out.println(" Digitação errada, tente novamente ");
}


// %s - String 
// %.2f - Double 
// %d inteiros 
// %n - quebra de linha

}}