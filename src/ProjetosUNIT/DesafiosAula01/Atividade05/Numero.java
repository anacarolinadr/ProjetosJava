package ProjetosUNIT.DesafiosAula01.Atividade05;

public class Numero {
    public double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public void acharAntecessorSucessor(){
        System.out.println("Antecessor: " + (this.numero - 1));
        System.out.println("Sucessor: " + (this.numero + 1));
    }
}
