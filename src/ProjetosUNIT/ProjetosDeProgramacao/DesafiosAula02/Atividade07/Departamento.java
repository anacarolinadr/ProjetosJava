package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

public enum Departamento {
    VESTUARIO(5),
    CALCADOS(7);

    private final int porcentagemComissao;

    Departamento(int porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public double calcularComissao(double valorVenda) {
        return valorVenda * (porcentagemComissao / 100.0);
    }

    public int getPorcentagemComissao() {
        return porcentagemComissao;
    }
}
