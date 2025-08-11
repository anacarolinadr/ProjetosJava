package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade08;

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private List<Produto> produtos;
    private String nome = "TechTok";

    public LojaVirtual() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
            System.out.println("Produto '" + produto.getNome() + "' adicionado");
        } else {
            System.out.println("Produto inválido");
        }
    }

    public boolean removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto '" + produto.getNome() + "' removido");
            return true;
        } else {
            System.out.println("Produto não encontrado");
            return false;
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto disponível na loja " + nome);
            return;
        }
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
        }
        System.out.println("Total de produtos: " + produtos.size());
    }

    public boolean isEmpty() {
        return produtos.isEmpty();
    }

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
