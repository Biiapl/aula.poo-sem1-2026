public class Pix implements Pagamento{
    private String chavePix;
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }
    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando QR code para a chave " + this.chavePix);

    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponivel no App do banco");

    }
}
