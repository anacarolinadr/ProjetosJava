package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade01;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(5, 22.5);
        MountainBike mountainBike = new MountainBike(18, 30.0, "Dupla");
        Ciclismo ciclismo = new Ciclismo(12, 40.5, 25);

        System.out.println(bicicleta.exibirDados());
        System.out.println(mountainBike.exibirDados());
        System.out.println(ciclismo.exibirDados());
    }
}

