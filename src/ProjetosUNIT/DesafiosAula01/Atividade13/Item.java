package ProjetosUNIT.DesafiosAula01.Atividade13;

public class Item {
    public String nome;
    public double valor;
    public double classificacao;

    public Item(String nome, double valor, double classificacao) {
        this.nome = nome;
        this.valor = valor;
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
}
