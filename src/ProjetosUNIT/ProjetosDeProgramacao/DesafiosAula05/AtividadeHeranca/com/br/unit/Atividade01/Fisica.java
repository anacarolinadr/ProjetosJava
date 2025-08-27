package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadeHeranca.com.br.unit.Atividade01;

public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String nome, String endereco, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
