package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade08;

public class ItemCarrinho {
    private Produto produto;
    private int qtdCarrinho;

    public ItemCarrinho(Produto produto, int qtdCarrinho) {
        this.produto = produto;
        this.qtdCarrinho = qtdCarrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdCarrinho() {
        return qtdCarrinho;
    }

    public void setQtdCarrinho(int qtdCarrinho) {
        this.qtdCarrinho = qtdCarrinho;
    }
}
