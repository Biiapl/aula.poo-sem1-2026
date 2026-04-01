package supermercadoSistema;

public class TestaVenda {
    public static void main(String[] args) {
        // Criando produtos
        Produto arroz = new Produto(1, "Arroz", 25.90);
        Produto feijao = new Produto(2, "Feijão", 12.50);

        // Criando cliente
        Cliente cliente = new Cliente(1, "Bianca");

        // Criando venda
        Venda venda = new Venda();
        venda.setCliente(cliente);

        // Adicionando itens
        venda.adicionarItem(1, 2, arroz);   // 2 pacotes de arroz
        venda.adicionarItem(2, 1, feijao);  // 1 pacote de feijão

        // Exibindo venda
        System.out.println(venda);
    }
}

