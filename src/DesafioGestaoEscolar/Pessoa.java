package DesafioGestaoEscolar;

//Desenvolva um sistema de gestão escolar com uma classe abstrata Pessoa contendo os atributos nome e idade.
//Crie as subclasses Aluno, Professor e Funcionario, cada uma implementando o método exibirInformacoes() de forma polimórfica.
//Adicione um método exclusivo para Aluno chamado verificarDescontoMensalidade() para calcular possíveis descontos.

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.println("Informações Pessoais");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
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
