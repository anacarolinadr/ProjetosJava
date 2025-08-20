package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade02;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private double salario;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj, double salario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.salario = salario;
        this.funcionarios = new ArrayList<>();
    }

    public boolean adiconaFunc(Funcionario funcionario) {
        for (Funcionario func : funcionarios) {
            if (func.getCpf().equals(funcionario.getCpf())) {
                return false;
            }
        }
        return funcionarios.add(funcionario);
    }

    public void listarFuncs(){
        for (Funcionario func : funcionarios) {
            System.out.println("Nome do Funcionario: " + func.getNome());
            System.out.println("CPF: " + func.getCpf());
            System.out.println("Salario: " + getSalario() + "\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
