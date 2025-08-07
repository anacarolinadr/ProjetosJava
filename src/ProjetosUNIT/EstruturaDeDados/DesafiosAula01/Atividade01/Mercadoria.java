package ProjetosUNIT.EstruturaDeDados.DesafiosAula01.Atividade01;

public class Mercadoria {
    public String nome;
    public double valor;
    public int id;

    public Mercadoria(String nome, double valor, int id) {
        this.nome = nome;
        this.valor = valor;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
