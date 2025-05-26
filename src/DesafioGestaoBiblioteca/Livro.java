package DesafioGestaoBiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String emprestarLivro(){
        if (disponivel) {
            setDisponivel(false);
            return "Livro emprestado!";
        }
        return "Livro não está disponivel no momento";
    }

    public String devolverLivro(){
        if (disponivel) {
            return "Não há livro para devolver";
        }
        setDisponivel(true);
        return "Devolução concluída";
    }

    public void exibirInformacoes(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Está disponível: " + (isDisponivel() ? "Sim" : "Não"));
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
