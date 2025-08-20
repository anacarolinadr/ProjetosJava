package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade03;

public class Hospede {
    private String nome;
    private String cpf;

    public Hospede(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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
}
