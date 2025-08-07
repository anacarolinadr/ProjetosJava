package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade14;

public class AnimalEstimacao {
    protected String nome;
    protected String especie;
    protected int idade;

    public AnimalEstimacao(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public double calcularIdade() {
        int conversaoHumana = 1;
        return idade * conversaoHumana;
    }

    public void exibirDetalhes(){
        System.out.println("O animal " + nome + " faz parte da espécie " + especie.toLowerCase() + " e tem " + idade + " anos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
