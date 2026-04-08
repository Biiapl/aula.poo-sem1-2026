public class Chekout {
    public static void main (String[] args){
        //variavel do tipo interface
        Pagamento seletor;
        //cliente escolheu Pix

        seletor = new  Pix("(16)99455-0171");
        seletor.autorizar(150.0); //polimorfismo
        seletor.exibirComprovante();

        //cliente mudou de ideia e escolheu cartao
        seletor = new CartaoCredito("1010101010101010");
        seletor.autorizar(150.0);
        seletor.exibirComprovante(); //polimorfismo
    }
}
