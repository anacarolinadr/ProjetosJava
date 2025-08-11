package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

import java.util.Arrays;

public class BethStore {
    private Funcionario[] funcionarios;
    private int quantidadeFuncionarios;
    private static final int CAPACIDADE_INICIAL = 10;

    public BethStore() {
        this.funcionarios = new Funcionario[CAPACIDADE_INICIAL];
        this.quantidadeFuncionarios = 0;
    }

    public BethStore(int capacidadeInicial) {
        this.funcionarios = new Funcionario[capacidadeInicial];
        this.quantidadeFuncionarios = 0;
    }

    public void contratarFuncionario(Funcionario funcionario) {
        if (quantidadeFuncionarios >= funcionarios.length) {
            expandirArray();
        }

        funcionarios[quantidadeFuncionarios] = funcionario;
        quantidadeFuncionarios++;
        System.out.println("Funcionario " + funcionario.getNome() + " contratado, matricula: " + funcionario.getMatricula());
    }

    public boolean demitirFuncionario(int matricula) {
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (funcionarios[i].getMatricula() == matricula) {
                String nomeDemitido = funcionarios[i].getNome();
                for (int j = i; j < quantidadeFuncionarios - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                funcionarios[quantidadeFuncionarios - 1] = null;
                quantidadeFuncionarios--;
                System.out.println("Funcionario " + nomeDemitido + " foi demitido");
                return true;
            }
        }
        System.out.println("Não foi encontrada a matricula");;
        return false;
    }

    public double calcularFolhaPagamentoTotal() {
        double total = 0.0;
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            total += funcionarios[i].calcularSalario();
        }
        return total;
    }

    public void listarFuncionarios() {
        if (quantidadeFuncionarios == 0) {
            System.out.println("Nenhum funcionario cadastrado na loja");
            return;
        }

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            Funcionario f = funcionarios[i];
            String tipo = getTipoFuncionario(f);
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Nome: " + f.getNome());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("Tipo: " + tipo);
            System.out.println("Salário: R$ " + String.format("%.2f", f.calcularSalario()));
            System.out.println("-------------");
        }

        System.out.println("Total de funcionários: " + quantidadeFuncionarios);
        System.out.println("Folha de pagamento: R$ " + String.format("%.2f", calcularFolhaPagamentoTotal()));
    }

    private void expandirArray() {
        int novaCapacidade = funcionarios.length * 2;
        funcionarios = Arrays.copyOf(funcionarios, novaCapacidade);
    }

    private String getTipoFuncionario(Funcionario funcionario) {
        if (funcionario instanceof FuncionarioAssalariado) {
            return "Assalariado";
        } else if (funcionario instanceof FuncionarioComissionado) {
            return "Comissionado";
        } else if (funcionario instanceof FuncionarioHorista) {
            return "Horista";
        }
        return "Desconhecido";
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public int getCapacidadeMaxima() {
        return funcionarios.length;
    }

    public Funcionario[] getFuncionarios() {
        return Arrays.copyOf(funcionarios, quantidadeFuncionarios);
    }
}