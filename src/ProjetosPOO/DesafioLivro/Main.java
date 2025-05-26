package ProjetosPOO.DesafioLivro;

public class Main {
    public static void main(String[] args) {
        Autor robert = new Autor("Robert C. Martin", "robert@gmail.com");
        Livro livro1984 = new Livro("1984", robert, 75);
        livro1984.mostrarInformacoes();
    }
}
