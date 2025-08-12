package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade04;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void exibirDados(){
        if (universidade != null) {
            System.out.println(nome + " estuda na " + universidade.getNome());
        } else {
            System.out.println(nome + " não está matriculado em nenhuma Universidade");
        }
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
