
import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados

        System.out.println(" Digite a descrição do artefato  ");
        String descricao = teclado.nextLine();

        System.out.println(" Digite o número do tipo do artefato ");
        int tipo = teclado.nextInt();

        System.out.println(" Digite o percentual de carbono do artefato ");
        int percentual = teclado.nextInt();

        String periodo = "";
        String tipoo = "";
        String dr = "";

        // Processamento de dados

        // IF para Descobrir a ERA do objeto de acordo com o percentual de carbono

        if (percentual == 100) {
            periodo = "Idade Moderna";
        } else if (percentual == 50) {
            periodo = "Idade Média";
        }

        else if (percentual == 25) {
            periodo = "Idade do Bronze";
        }

        else if (percentual == 10) {
            periodo = "Idade do ferro";
        }

        else if (percentual >= 1 && percentual <= 9) {
            periodo = "Pré-História";
        } else {
            periodo = "Período desconhecido";
        }

        // IF para descobrir o tipo do artefato

        if (tipo == 1) {
            tipoo = "Arma ou tecnologia similar de metal";
        } else if (tipo == 2) {
            tipoo = "Ferramentas ou utensílios domésticos";
        } else if (tipo == 3) {
            tipoo = "Artefato desconhecido (Isu)";
        } else {
            tipoo = "objeto não identificador";
        }

        // IF para descobrir o nome do responsavel pela pesquisa

        if (periodo == "Idade Moderna" && tipo == 1) {
            dr = "Doutora Kassandra";
        } else if (periodo == "Idade Moderna" && tipo == 2) {
            dr = "Doutor Edward";
        } else if (periodo == "Idade Moderna" && tipo == 3) {
            dr = "Doutor Cesare Borgia";
        } else if (periodo == "Idade Média" && tipo == 1) {
            dr = "Doutor Kenway";
        } else if (periodo == "Idade Média" && tipo == 2) {
            dr = "Doutor Ezio";
        } else if (periodo == "Idade Média" && tipo == 3) {
            dr = "Doutor Rodrigo";
        } else if (periodo == "Idade do Bronze" && tipo == 1) {
            dr = "Doutor Alexios";
        } else if (periodo == "Idade do Bronze" && tipo == 2) {
            dr = "Doutor Altair";
        } else if (periodo == "Idade do Bronze" && tipo == 3) {
            dr = "Doutor Cormac";
        } else if (periodo == "Idade do ferro" && tipo == 1) {
            dr = "Doutor Alexios";
        } else if (periodo == "Idade do ferro" && tipo == 2) {
            dr = "Doutor Eivor ";
        } else if (periodo == "Idade do ferro" && tipo == 3) {
            dr = "Doutor Berg";
        } else if (periodo == "Pré-História" && tipo == 1) {
            dr = "Doutor Arno";
        } else if (periodo == "Pré-História" && tipo == 2) {
            dr = "Doutor Elise";
        } else if (periodo == "Pré-História" && tipo == 3) {
            dr = "Doutor Bardock";
        }

        else {
            dr = "Pesquisador não identificado  ";
        }

        // Saida de dados

        System.out.printf(
                " A descrição do artefato é : %s \n O período do artefato é de : %s \n Tipo do artefato  : %s \n nome do pesquisador responsavel : %s \n",
                descricao, periodo, tipoo, dr);
        teclado.close();

    }
}