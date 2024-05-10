public class imc {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        
System.out.print(" Digite seu peso: ");
double peso = input.nextDouble();

System.out.print(" Digite sua altura: ");
double altura = input.nextDouble();

double bmi = peso / (altura * altura);

System.out.printf("Your BMI is %.2f\n", bmi);

if (bmi < 18.5) {
    System.out.println("Underpeso");
} else if (bmi < 25) {
    System.out.println("Normal peso");
} else if (bmi < 30) {
    System.out.println("sobrepeso");
} else {
    System.out.println("Obese");
}
}
}