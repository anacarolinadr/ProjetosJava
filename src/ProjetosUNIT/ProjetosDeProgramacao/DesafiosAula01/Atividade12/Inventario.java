package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade12;

public class Inventario {
    private Produto inventario [];
    private int contador;
    private int tamanhoMaximo;

    public Inventario(int tamanhoMaximo) {
        this.inventario = new Produto[tamanhoMaximo];
        contador = 0;
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public Inventario(Produto[] inventario, int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.inventario = new Produto[tamanhoMaximo];
        if (inventario != null) {
            int limite = Math.min(inventario.length, tamanhoMaximo);
            for (int i = 0; i < limite; i++) {
                this.inventario[i] = inventario[i];
                this.contador++;
            }
        }
    }

    public boolean adicionarProduto(Produto produto) {
        if (contador < inventario.length) {
            inventario[contador] = produto;
            contador++;
            return true;
        } else {
            System.out.println("Inventário cheio, será necessário crescer espaço no inventário.");
            return false;
        }
    }

    public boolean removerProduto(String nome) {
        for (int i = 0; i < contador; i++) {
            if (inventario[i].getNome() == nome) {
                for (int j = i; j < contador - 1; j++) {
                    inventario[j] = inventario[j + 1];
                }
                inventario[contador - 1] = null;
                contador--;
                return true;
            }
        }
        System.out.println("Produto: " + nome + " não encontrado.");
        return false;
    }

    public void avaliarEstoque(){
        if (contador < 10) {
            System.out.println("Inventário baixo, será necessário aumentar o estoque");
        } else {
            System.out.println("Inventário com quantidade ideal");
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos atuais no Inventário:");
        for (int i = 0; i < contador; i++) {
            Produto p = inventario[i];
            System.out.println("- Nome: " + p.getNome() + ", valor: " + p.getValor());
        }
    }
}
