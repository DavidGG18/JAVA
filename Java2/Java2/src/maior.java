import java.util.Scanner;

// Ler dois numeros e informar o maior

public class maior {

public static void main(String[]args) throws  Exception {
Scanner teclado = new Scanner (System.in);

int n1, n2;

System.out.println(" Digite número 1 ");
n1 = teclado.nextInt();

System.out.println(" Digite o 2º número");
n2 = teclado.nextInt();

if (n1 > n2) {
System.out.println(" O maior número é o " + n1);
}else if (n2 > n1) {
    System.out.println (" O maior número é o " + n2);
}else { 
    System.out.println (" Os número são iguais " );
}
// um igual = e atribui  um valor
// 2 iguais em if == e para o programa analisar  
}
}