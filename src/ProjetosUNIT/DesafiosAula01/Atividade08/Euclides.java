package ProjetosUNIT.DesafiosAula01.Atividade08;

public class Euclides {
    public double num1;
    public double num2;
    public double mdc;

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
