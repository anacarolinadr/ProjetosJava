package ProjetosUNIT.DesafiosAula02.Atividade03;

public class Main {
    public static void main(String[] args) {
        ConjuntoMaca conjuntoMaca1 = new ConjuntoMaca(15);
        ConjuntoMaca conjuntoMaca2 = new ConjuntoMaca(6);

        System.out.println("Valor da compra: " + conjuntoMaca1.calcularValorFinal());
        System.out.println("Valor da compra: " + conjuntoMaca2.calcularValorFinal());
    }
}
