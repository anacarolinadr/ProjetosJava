package ProjetosPOO.DesafioSistemaRPG;

//Implemente uma classe abstrata Personagem com os atributos nome, nivel e vida.
//Crie as subclasses Guerreiro, Mago e Arqueiro, cada uma com características específicas.
//Defina uma interface Atacavel com o método atacar(), que será implementado por todas as subclasses.
//Utilize um enum para representar os tipos de dano possíveis: FISICO, MAGICO e DISTANCIA.

public abstract class Personagem implements Atacavel{
    private String nome;
    private int nivel;
    private double vida;

    public Personagem(String nome, int nivel, double vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public abstract TipoDano getTipoDano();

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Tipo de dano: " + getTipoDano());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
