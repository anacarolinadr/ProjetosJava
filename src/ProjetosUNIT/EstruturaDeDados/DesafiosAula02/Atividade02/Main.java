package ProjetosUNIT.EstruturaDeDados.DesafiosAula02.Atividade02;

public class Main {
    static int acharDigitos(int n){
        if (n < 10) {
            return 1;
        }
        else {
            return 1 + acharDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("O número tem " + acharDigitos(250) + " dígitos");
    }
}
