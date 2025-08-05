package ProjetosUNIT.DesafiosAula01.Atividade01;

public class ContagemDias {
    public int anos;
    public int meses;
    public int dias;

    public ContagemDias(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public void mostrarContagem() {
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Você tem aproximadamente " + totalDias + " dias!");
    }
}
