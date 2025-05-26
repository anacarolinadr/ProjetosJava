package ProjetosPOO.DesafioGestaoBiblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Percy Jackson", "Rick", 2005);
        Livro livro2 = new Livro("Harry Potter ", "JK", 1997);

        livro1.emprestarLivro();

        livro1.exibirInformacoes();
        System.out.println("-----------");
        livro2.exibirInformacoes();

        livro1.devolverLivro();
        livro2.emprestarLivro();

        System.out.println("-----------");
        livro1.exibirInformacoes();
        System.out.println("-----------");
        livro2.exibirInformacoes();
    }
}
