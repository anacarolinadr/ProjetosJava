package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade07;

public enum Cargo {
    ASSISTENTE(1),
    SUPERVISOR(2);

    private final int qtdSalarioMinimo;
    private static double salarioMinimo = 1320.00;

    Cargo(int qtdSalarioMinimo) {
        this.qtdSalarioMinimo = qtdSalarioMinimo;
    }

    public double calcularValor() {
        return qtdSalarioMinimo * salarioMinimo;
    }

    public static void setSalarioMinimo(double novoSalarioMinimo) {
        if (novoSalarioMinimo > 0) {
            salarioMinimo = novoSalarioMinimo;
            System.out.printf("Salário mínimo atualizado para: R$ %.2f\n", salarioMinimo);
        }
    }

    public int getQtdSalarioMinimo() {
        return qtdSalarioMinimo;
    }

    public static double getSalarioMinimo() {
        return salarioMinimo;
    }
}

