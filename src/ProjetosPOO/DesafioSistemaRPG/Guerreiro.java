package ProjetosPOO.DesafioSistemaRPG;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int nivel, double vida) {
        super(nome, nivel, vida);
    }

    @Override
    public TipoDano getTipoDano() {
        return TipoDano.FISICO;
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro " + getNome() + " ataca de forma fisica");
    }
}
