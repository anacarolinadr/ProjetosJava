package ProjetosPOO.DesafioSistemaRPG;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome, int nivel, double vida) {
        super(nome, nivel, vida);
    }

    @Override
    public TipoDano getTipoDano() {
        return TipoDano.DISTACIA;
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro " + getNome() + " ataca a distancia");
    }
}
