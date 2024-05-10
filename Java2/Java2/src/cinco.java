import java.util.Scanner;
/* Nome do Aluno: Fulano de Tal
. RA: 32312961
. Nome do Programa: Conceito de notas o aluno digita uma nota e o programa vai dizer a situação bom, regular ou ruim
. Data: 09/04/2023
*/ 
public class cinco {
public static void main (String[]args) throws Exception {

Scanner teclado = new Scanner(System.in);

int nota;
System.out.println(" Digite sua nota ");
nota = teclado.nextInt();

if (nota >= 0 && nota <= 49){
System.out.println(" Insuficiente");
}

else if (nota >= 50 && nota <= 64) {
    System.out.println(" Regular ");
}

else if (nota >= 65 && nota <= 84) {
    System.out.println(" Bom ");
}

else if(nota >= 85 && nota <= 100) {
    System.out.println("Ótimo");
}

}}