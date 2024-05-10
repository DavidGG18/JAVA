/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 18) Fatorial de um número digitado pelo usuário  
* Data: 20/05/23
*/

import java.util.Scanner;

public class fatorial_18 {
public static void main(String[]args){
    
Scanner teclado = new Scanner (System.in);
int fatorial = 1;
int contador = 1;
int numero;

System.out.println(" Digite um número ");
numero = teclado.nextInt();

while (contador <= numero) {
    fatorial *= contador;
    contador++;
    
}
System.out.printf(" O fatoria de %d é %d " ,numero, fatorial);

}
}