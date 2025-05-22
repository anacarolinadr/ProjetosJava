package DesafioSistemaEntrega;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Ana", "Eric", 24);
        Pacote pacote = new Pacote(500, "Rua das Flores", true);
        Alimento alimento = new Alimento("Tomate", 10, "Restaurante");

        System.out.println("Status documento: " + documento.getStatusEntrega());
        System.out.println("Status pacote: " + pacote.getStatusEntrega());
        System.out.println("Status alimento: " + alimento.getStatusEntrega());

        documento.entregar();
        pacote.entregar();
        alimento.entregar();

        System.out.println("Status documento: " + documento.getStatusEntrega());
        System.out.println("Status pacote: " + pacote.getStatusEntrega());
        System.out.println("Status alimento: " + alimento.getStatusEntrega());
    }
}
