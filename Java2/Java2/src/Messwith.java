import java.util.Scanner;

public class Messwith {

    public static void main(String[]args) throws  Exception {
        Scanner teclado = new Scanner (System.in);
        
        int mes;
System.out.println(" Digite um número de 1 a 12 pra saber o mês e a estação do ano ");
mes = teclado.nextInt();

        switch (mes) {
        case 1: System.out.println(" Mês Janeiro estação Verão");
        break;
        case 2: System.out.println(" Mês Fevereiro estação Verão");
        break;
        case 3: System.out.println(" Mês Março estação Verão ");
        break;
        case 4: System.out.println(" Mês Abril estação Outono ");
        break;
        case 5: System.out.println(" Mês Maio estação Outono ");
        break;
        case 6: System.out.println(" Mês Junho estação Outono ");
        break;
        case 7: System.out.println(" Mês Julho estação Inverno ");
        break;
        case 8: System.out.println(" Mês Agosto estação Inverno ");
        break;
        case 9: System.out.println(" Mês Setembro estação Inverno ");
        break;
        case 10: System.out.println(" Mês Outubro estação Primavera ");
        break;
        case 11: System.out.println(" Mês Novembro estação Primavera ");
        break;
        case 12: System.out.println(" Mês Dezembro estação Primavera ");
        break;
        
        /*
        Outono : De 21 de março a 21 de junho.
        Inverno: De 21 de junho a 23 de setembro.
        Primavera : De 23 de setembro a 21 de dezembro.
        Verão : De 21 de dezembro a 21 de março. 
        */
        

        default: System.out.println(" Esse mês não existe");         
        }

        
}}