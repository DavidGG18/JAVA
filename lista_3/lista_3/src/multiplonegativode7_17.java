/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 17) multiplonegativode7_17 programa que imprima os múltiplos negativos de 7,
superiores a -1000. do while 
* Data: 20/05/23
*/

public class multiplonegativode7_17 {
public static void main(String[]args){
    int numero = -7;

    do {
        System.out.println(numero);
        numero -= 7;
    } while (numero > -1000);
}
}