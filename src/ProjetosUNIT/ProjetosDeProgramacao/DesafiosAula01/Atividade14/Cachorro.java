package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade14;

public class Cachorro extends AnimalEstimacao{
    private String brinquedoFavorito;
    private int conversaoHumana = 7;

    public Cachorro(String nome, String especie, int idade, String brinquedoFavorito) {
        super(nome, especie, idade);
        this.brinquedoFavorito = brinquedoFavorito;
    }

    @Override
    public double calcularIdade() {
        return idade * conversaoHumana;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("O cachorro " + nome + " faz parte da espécie " + especie + " e tem " + idade + " anos");
        System.out.println("Ele adora pular e passear");
    }

    public void brincar() {
        System.out.println(nome + " está brincando com " + brinquedoFavorito.toLowerCase() + "!");
    }

    public String getBrinquedoFavorito() {
        return brinquedoFavorito;
    }

    public void setBrinquedoFavorito(String brinquedoFavorito) {
        this.brinquedoFavorito = brinquedoFavorito;
    }
}
