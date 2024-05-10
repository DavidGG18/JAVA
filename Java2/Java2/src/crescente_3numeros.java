import java.util.Scanner;

public class crescente_3numeros {
    public static void main(String[]args) throws Exception {

Scanner teclado = new Scanner(System.in);
int n1,n2,n3;

System.out.println(" Digite o 1º número ");
n1 = teclado.nextInt();

System.out.println(" Digite o 2º número ");
n2 = teclado.nextInt();

System.out.println(" Digite o 3º numero");
n3 = teclado.nextInt();

if (n1 <= n2 && n2 <= n3) {
    System.out.println(n1 + " " + n2 + " " + n3);
} else if (n1 <= n3 && n3 <= n2) {
    System.out.println(n1 + " " + n3 + " " + n2);
} else if (n2 <= n1 && n1 <= n3) {
    System.out.println(n2 + " " + n1 + " " + n3);
} else if (n2 <= n3 && n3 <= n1) {
    System.out.println(n2 + " " + n3 + " " + n1);
} else if (n3 <= n1 && n1 <= n2) {
    System.out.println(n3 + " " + n1 + " " + n2);
} else {
    System.out.println(n3 + " " + n2 + " " + n1);
}

    }
}
