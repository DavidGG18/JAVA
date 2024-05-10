import java.util.Scanner;

public class mostrar {
    public static void main(String[] args) throws Exception {
        System.out.println(" Digite um número ");
        int numero;
               Scanner input = new Scanner (System.in); // Java ler o valor digitado
               input = new Scanner(System.in);
               numero = input.nextInt();
               System.out.println(" O número digitado foi "+numero);
    }
}
