package ProjetosPOO.DesafioTriangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um lado do triangulo: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triangulo: ");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite o ultimo lado do triangulo: ");
        double ladoC = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        double perimetro = triangulo.calcularPerimetro();
        double area = triangulo.calcularArea();

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

        scanner.close();
    }
}