package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade08;

public class Main {
    public static void main(String[] args) {

        System.out.println("TechTok");
        LojaVirtual techtok = new LojaVirtual();

        Produto p1 = new Produto("iphone 15",1, "Celular Apple", 5000.00, 10);
        Produto p2 = new Produto("TV Samsung",2, "TV da marca Samsung", 7000.00, 12);
        techtok.adicionarProduto(p1);
        techtok.adicionarProduto(p2);

        System.out.println("Produtos disponíveis na loja:");
        techtok.listarProdutos();

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem(new ItemCarrinho(p1, 1));
        carrinhoCompras.adicionarItem(new ItemCarrinho(p2, 2));
        carrinhoCompras.exibirItens();
        carrinhoCompras.calcularValorTotal();
    }
}
