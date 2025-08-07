package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

public class FuncionarioAssalariado extends Funcionario{
    private Cargo cargo;

    public FuncionarioAssalariado(String nome, String cpf, String dataNascimento, int matricula, Cargo cargo) {
        super(nome, cpf, dataNascimento, matricula);
        this.cargo = cargo;
    }

    @Override
    public double calcularSalario() {
        return cargo.calcularValor();
    }
}
