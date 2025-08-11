package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade10;

public class ColecaoBiblioteca {
    private Livro [] colecao;
    private int contador;
    private int tamanhoMaximo;

    public ColecaoBiblioteca(int tamanhoMaximo) {
        this.colecao = new Livro[tamanhoMaximo];
        contador = 0;
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public ColecaoBiblioteca(Livro[] colecao, int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.colecao = new Livro[tamanhoMaximo];
        if (colecao != null) {
            int limite = Math.min(colecao.length, tamanhoMaximo);
            for (int i = 0; i < limite; i++) {
                this.colecao[i] = colecao[i];
                this.contador++;
            }
        }
    }

    public boolean adicionarLivro(Livro livro) {
        if (contador < colecao.length) {
            colecao[contador] = livro;
            contador++;
            return true;
        } else {
            System.out.println("Coleção cheia.");
            return false;
        }
    }

    public boolean removerLivro(int isbn) {
        for (int i = 0; i < contador; i++) {
            if (colecao[i].getISBN() == isbn) {
                for (int j = i; j < contador - 1; j++) {
                    colecao[j] = colecao[j + 1];
                }
                colecao[contador - 1] = null;
                contador--;
                return true;
            }
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        return false;
    }

    public void listarLivros() {
        System.out.println("Livros na coleção:");
        for (int i = 0; i < contador; i++) {
            Livro l = colecao[i];
            System.out.println("- " + l.getTitulo() + " de " + l.getAutor() + " (ISBN: " + l.getISBN() + ")");
        }
    }
}
