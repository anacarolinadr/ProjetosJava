package ProjetosUNIT.DesafiosAula01.Atividade14;

public class Passaro extends AnimalEstimacao{
    private double envergadura;
    private int conversaoHumana = 8;

    public Passaro(String nome, String especie, int idade, double envergadura) {
        super(nome, especie, idade);
        this.envergadura = envergadura;
    }

    public Passaro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public double calcularIdade() {
        return idade * conversaoHumana;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("O passáro " + nome + " faz parte da espécie " + especie.toLowerCase() + " e tem " + idade + " anos");
        System.out.println("A envergadura dele tem " + envergadura + "cm");
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }
}
