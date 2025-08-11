package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade08;

public class Euclides {
    private double num1;
    private double num2;

    public Euclides(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double acharMDC() {
        double a = num1;
        double b = num2;
        double resto;

        while (true) {
            resto = a % b;
            if (resto == 0) {
                return b;
            }
            a = b;
            b = resto;
        }
    }
}
