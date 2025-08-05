package ProjetosUNIT.DesafiosAula01.Atividade04;

public class Salario {
    public double salario;

    public Salario(double salario) {
        this.salario = salario;
    }

    public double calcularSalariosMinimos(){
        double salariosMinimos = salario / 1320;
        return salariosMinimos;
    }
}
