import java.util.Locale;
import java.util.Scanner;

public class imc_pesoideal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        double altura, peso;

        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        teclado.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite seu sexo (f ou m): ");
        String Sexo = teclado.nextLine();

        double PesoIdealM = 52 + (0.75 * (altura - 152.4));
        double PesoIdealF = 52 + (0.67 * (altura - 152.4));

        if (Sexo.equals("f")) {
            System.out.println("Seu peso ideal é " + PesoIdealF);
        } else if (Sexo.equals("m")) {
            System.out.println("Seu peso ideal é " + PesoIdealM);
        }

        teclado.close();

        if (imc < 18.5) {
            System.out.printf("Seu IMC é %.2f Abaixo do peso %n", imc);
        } else if (imc >= 18.5 && imc < 25) {
            System.out.printf("Seu IMC é %.2f Peso normal %n", imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("Seu IMC é %.2f Sobrepeso %n", imc);
        } else if (imc >= 30 && imc < 40) {
            System.out.printf("Seu IMC é %.2f Obesidade NV1 %n", imc);
        } else {
            System.out.printf("Seu IMC é %.2f Obesidade Grave %n", imc);
        }

    }
}
