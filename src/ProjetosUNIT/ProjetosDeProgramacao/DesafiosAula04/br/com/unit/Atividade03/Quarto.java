package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade03;

public class Quarto {
    private String nome;
    private Tipo tipo;
    private boolean ocupado;

    public Quarto(String nome, Tipo tipo, boolean ocupado) {
        this.nome = nome;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
