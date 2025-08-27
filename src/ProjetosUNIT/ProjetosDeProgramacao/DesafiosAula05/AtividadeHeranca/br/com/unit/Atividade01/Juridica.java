package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadeHeranca.br.com.unit.Atividade01;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    public Juridica(String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String inscricaoMunicipal) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Inscrição Municipal: " + inscricaoMunicipal);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
}
