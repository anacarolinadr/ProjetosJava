package ProjetosPOO.DesafioSistemaRPG;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Percy Jackson", 13, 100);
        Mago mago = new Mago("Harry Potter", 11, 100);
        Arqueiro arqueiro = new Arqueiro("Katniss Everdeen", 17, 100);

        guerreiro.mostrarInfo();
        guerreiro.atacar();

        mago.mostrarInfo();
        mago.atacar();

        arqueiro.mostrarInfo();
        arqueiro.atacar();
    }
}
