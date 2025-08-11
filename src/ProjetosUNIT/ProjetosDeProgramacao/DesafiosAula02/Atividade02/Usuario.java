package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade02;

public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.println("O usuário " + this.nome + " tem " + this.idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
