package DesafioGestaoEscolar;

public class Funcionario extends Pessoa{
    private String funcao;

    public Funcionario(String nome, int idade, String funcao) {
        super(nome, idade);
        this.funcao = funcao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Função na escola: " + funcao);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
