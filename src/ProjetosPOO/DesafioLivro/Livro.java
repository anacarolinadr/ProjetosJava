package ProjetosPOO.DesafioLivro;

public class Livro {
    private String titulo;
    private Autor autor;
    private double preco;

    public Livro(String titulo, Autor autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        setPreco(preco);
    }

    public void mostrarInformacoes(){
        System.out.println("Livro: " + titulo);
        System.out.println("Autor da obra: " + autor.getNome());
        System.out.println("Email para contato do autor: "+ autor.getEmail());
        System.out.println("Preço do livro: R$"+ preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido");
            return;
        }
        this.preco = preco;
    }
}
