package supermercadoSistema;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda() {
        itens = new ArrayList<>();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(int id, int qtd, Produto p) {
        itens.add(new ItemVenda(id, qtd, p));
    }

    @Override
    public String toString() {
        return "Venda para " + cliente + "\nItens: " + itens;
    }
}
