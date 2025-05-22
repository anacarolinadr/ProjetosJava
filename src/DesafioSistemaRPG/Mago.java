package DesafioSistemaRPG;

public class Mago extends Personagem{

    public Mago(String nome, int nivel, double vida) {
        super(nome, nivel, vida);
    }

    @Override
    public TipoDano getTipoDano() {
        return TipoDano.MAGICO;
    }

    @Override
    public void atacar() {
        System.out.println("Mago " + getNome() + " ataca de forma magica");
    }
}
