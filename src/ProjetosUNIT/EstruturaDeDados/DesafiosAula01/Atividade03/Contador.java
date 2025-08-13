package ProjetosUNIT.EstruturaDeDados.DesafiosAula01.Atividade03;

public class Contador {

    public void exibirValores(){
        for (int i = 0; i <= 10; i++) {
            System.out.print("( " + i + ", ");
            for (int j = i; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println(")");
        }
    }
}
