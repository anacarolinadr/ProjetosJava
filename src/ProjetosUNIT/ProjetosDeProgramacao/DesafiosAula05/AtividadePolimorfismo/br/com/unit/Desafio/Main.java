package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Desafio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        ArrayList<Telegrama> telegramas = new ArrayList<>();
        ArrayList<Email> emails = new ArrayList<>();

        System.out.println("Cartas");
        Carta carta1 = new Carta(1);
        carta1.setAutor("Ana Passos");
        carta1.setEndereco("Rua das Flores, 123");
        carta1.setFormaEnvio("Sedex");
        cartas.add(carta1);

        Carta carta2 = new Carta(2);
        carta2.setAutor("Julia Andrade");
        carta2.setEndereco("Av. Principal, 456");
        carta2.setFormaEnvio("Correio Tradicional");
        cartas.add(carta2);

        for (Carta carta : cartas) {
            carta.imprimir();
            carta.editar();
            carta.anexar();
            System.out.println();
        }

        System.out.println("Telegramas");
        Telegrama telegrama1 = new Telegrama(3);
        telegrama1.setAutor("Eric Mariano");
        telegrama1.setQuantidadeCaractere("150");
        telegrama1.setValorTelegrama(25.50);
        telegramas.add(telegrama1);

        Telegrama telegrama2 = new Telegrama(4);
        telegrama2.setAutor("Andre Ricardo");
        telegrama2.setQuantidadeCaractere("200");
        telegrama2.setValorTelegrama(35.00);
        telegramas.add(telegrama2);

        for (Telegrama telegrama : telegramas) {
            telegrama.imprimir();
            telegrama.editar();
            telegrama.pagar();
            System.out.println();
        }

        System.out.println("Emails");
        Email email1 = new Email(5);
        email1.setAutor("Rose Caroline");
        email1.setServidorEmail("gmail.com");
        email1.setEmailDestino("destino1@email.com");
        emails.add(email1);

        Email email2 = new Email(6);
        email2.setAutor("Regina Celia");
        email2.setServidorEmail("hotmail.com");
        email2.setEmailDestino("destino2@email.com");
        emails.add(email2);

        for (Email email : emails) {
            email.imprimir();
            email.editar();
            email.enviar();
            System.out.println();
        }

        Carta carta3 = new Carta(7);
        carta3.setAutor("Ana Passos");
        carta1.verificarAutor(carta3);
        carta1.verificarAutor(carta2);
    }
}
