package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

public class FuncionarioComissionado extends Funcionario{
    private Departamento departamento;
    private double valorVenda;

    public FuncionarioComissionado(String nome, String cpf, String dataNascimento, int matricula, Departamento departamento, double valorVenda) {
        super(nome, cpf, dataNascimento, matricula);
        this.departamento = departamento;
        this.valorVenda = valorVenda;
    }

    @Override
    public double calcularSalario() {
        return departamento.calcularComissao(valorVenda);
    }
}
