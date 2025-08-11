package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade08;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<ItemCarrinho> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }

    public void removerItem(ItemCarrinho item) {
        itens.remove(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (ItemCarrinho item : itens) {
            valorTotal += item.getProduto().getPreco() * item.getQtdCarrinho();
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio");
            return;
        }
        for (ItemCarrinho item : itens) {
            System.out.println("Item no carrinho: " + item.getProduto().getNome());
            System.out.println("Valor do item: " + item.getProduto().getPreco());
            System.out.println("Quantidade no carrinho: " + item.getQtdCarrinho());
            System.out.println("Preço a pagar: " + item.getProduto().getPreco() * item.getQtdCarrinho());
        }
        System.out.printf("Total: " + calcularValorTotal());
    }

    public boolean isEmpty() {
        return itens.isEmpty();
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }
}