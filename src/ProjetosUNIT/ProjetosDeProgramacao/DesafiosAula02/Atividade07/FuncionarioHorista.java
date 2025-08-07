package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

public class FuncionarioHorista extends Funcionario{
    private int horasTrabalhadas;
    private static final double VALOR_HORA = 55.0;

    public FuncionarioHorista(String nome, String cpf, String dataNascimento, int matricula, int horasTrabalhadas) {
        super(nome, cpf, dataNascimento, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * VALOR_HORA;
    }
}
