package com.mycompany.mostrarnumerodousuario;

import javax.swing.JOptionPane;

public class mostrarnumerodousuario {

    public static void main(String[] args) {
   int numero;
    
   Scanner teclado = new Scanner(System.in);
   System.out.println("DIGITE UM NUMERO "); // System.out.println(" Mostra mensagem "); 
   numero = teclado.nextInt(); // teclado.nextInt(); = ler variavel digitado pelo usuário
   System.out.println(" O número digitado foi ",numero);
                   
    }
}
