package DesafioTriangulo;

// Desenvolva uma classe Triangulo com os atributos ladoA, ladoB e ladoC.
// Implemente métodos para calcular o perímetro (calcularPerimetro),
// a área (calcularArea usando a fórmula de Heron) e validar se os lados formam um triângulo válido.

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (validarTriangulo()){
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            System.out.println("Triângulo inválido! Confirme os valores.");
        }
    }

    public boolean validarTriangulo(){
        return ((ladoA + ladoB) > ladoC &&
                (ladoA + ladoC) > ladoB &&
                (ladoC + ladoB) > ladoA);
    }

    public double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }

    public double calcularArea(){
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    // Adicionei os getters e setters apenas pela estrutura da POO
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
}
