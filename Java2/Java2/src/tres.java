import java.util.Scanner;

public class tres {

public static void main (String[]args) throws Exception {

// Saber se um número e posivo ou negativo e par ou impar  

Scanner teclado = new Scanner(System.in);
int n1;

System.out.println(" Digite um número ");
n1 = teclado.nextInt();

if(n1%2 ==0){
System.out.println(" O número e par ");
}else{
    System.out.println("O número e impar");
} 

if (n1>=0) {
    System.out.println( "O número e positivo ");
       }
       else if (n1<= -1){
        System.out.println(" O número e negativo ");
       }


}}