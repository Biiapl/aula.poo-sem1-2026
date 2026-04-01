package Composição;

public class TestaComposicao {

    public static void main(String[] args){
        Empresa em1 = new Empresa(1,"Banco Master", "12345");
        em1.addFuncionario(10, "Fulano", "456", "MKT");

    }

}
