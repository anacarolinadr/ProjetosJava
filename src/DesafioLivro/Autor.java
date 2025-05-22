package DesafioLivro;

// Crie duas classes: Autor com os atributos nome e email, e Livro com titulo, autor (do tipo Autor) e preco.
// Implemente um método para mostrar as informações completas do livro, incluindo os dados do autor.

public class Autor {
    private String nome;
    private String email;

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
