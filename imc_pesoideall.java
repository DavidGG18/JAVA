import java.util.Locale;
import java.util.Scanner;

public class imc_pesoideall {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        double altura, peso;

        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        teclado.nextLine();

        System.out.print("Digite seu sexo (f ou m): ");
        String Sexo = teclado.nextLine();

        double PesoIdealM = 52 + (0.75 * (altura - 152.4));
        double PesoIdealF = 52 + (0.67 * (altura - 152.4));

        double imc = peso / (altura * altura);

        if (Sexo.equals("f")) {
            System.out.printf("Seu IMC é %.2f Peso ideal é %.2f%n", imc, PesoIdealF);
        } else if (Sexo.equals("m")) {
            System.out.printf("Seu IMC é %.2f Peso ideal é %.2f%n", imc, PesoIdealM);
        }

        teclado.close();

        // Resto do código para calcular e imprimir a classificação.
    }
}