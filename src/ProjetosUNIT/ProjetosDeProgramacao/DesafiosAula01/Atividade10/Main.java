//Escrever um programa para criar uma classe chamada "Livro" com atributos para título,
//autor e ISBN, e métodos para adicionar e remover livros de uma coleção.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade10;

public class Main {
    public static void main(String[] args) {
        Livro livro1984 = new Livro("1984", "George Orwell", 1234);
        Livro livroPjo = new Livro("PJO", "Rick", 5678);
        Livro livroJava = new Livro("Java", "ProfJava", 9101);
        ColecaoBiblioteca colecaoBiblioteca = new ColecaoBiblioteca(2);

        colecaoBiblioteca.adicionarLivro(livro1984);
        colecaoBiblioteca.adicionarLivro(livroPjo);
        colecaoBiblioteca.adicionarLivro(livroJava);
        colecaoBiblioteca.listarLivros();
        colecaoBiblioteca.removerLivro(1234);
        colecaoBiblioteca.listarLivros();
    }
}
