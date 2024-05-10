package Sigel;

import java.time.LocalDate;

// Criando a classe cliente
public class Cliente extends pessoa{


    //Atributos 

private LocalDate datadenascimento;
Endereco enderecoCliente;

public Cliente() {

    enderecoCliente = new Endereco();
    codigo = 0;
}



// get cpf mostrar cpf
String getcpf(){
    return cpf;
} 

// set cpf colocar valor c em cpf
void setcpf(String c){
    if(c != null){
    cpf = c;
}


}}