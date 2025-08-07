package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade01;

public class Conversao {
    public double qtdGaloes;

    public Conversao(double qtdGaloes) {
        this.qtdGaloes = qtdGaloes;
    }

    public double conversaoGaloesLitros(){
        return qtdGaloes * 3.7854;
    }

    public double getQtdGaloes() {
        return qtdGaloes;
    }

    public void setQtdGaloes(double qtdGaloes) {
        this.qtdGaloes = qtdGaloes;
    }
}
