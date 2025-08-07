//Escrever um programa para criar uma classe chamada "Inventário" com uma coleção de
//produtos e métodos para adicionar e remover produtos e verificar se há estoque baixo.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade12;

public class Main {
    public static void main(String[] args) {
        Produto bola = new Produto("Bola de Futebol", 30);
        Produto boneca = new Produto("Boneca Barbie", 100);
        Produto livroColorir = new Produto("Bobbie Goods", 40);

        Inventario inventario = new Inventario(15);
        inventario.adicionarProduto(bola);
        inventario.adicionarProduto(boneca);
        inventario.adicionarProduto(livroColorir);
        inventario.avaliarEstoque();
        inventario.listarProdutos();
        inventario.removerProduto(bola.getNome());
        inventario.listarProdutos();

    }
}
