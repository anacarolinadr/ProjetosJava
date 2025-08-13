package ProjetosUNIT.EstruturaDeDados.DesafiosAula02.Atividade01;

public class Main {
    static int potencia(int k, int n){
        if (n == 0){
            return 1;
        }
        else {
            return k * potencia(k, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(potencia(4, 3));
    }
}
