package ProjetosUNIT.DesafiosAula02.Atividade06;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 19, 1.6, 50);
        Pessoa pessoa2 = new Pessoa("Luis", 19, 1.5, 80);

        pessoa1.exibirClassificacao();
        pessoa2.exibirClassificacao();
    }
}
