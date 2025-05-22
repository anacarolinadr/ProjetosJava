package DesafioSistemaEntrega;

//Crie um sistema de entregas utilizando POO em Java, onde diferentes tipos de itens — como
//documentos, pacotes e alimentos — possam ser entregues.
//Implemente uma interface Entregavel com o método entregar() e um enum StatusEntrega
//com os estados PREPARANDO, A_CAMINHO e ENTREGUE. Cada classe deve implementar Entregavel,
//conter atributos próprios e uma forma específica de realizar a entrega.
//Por fim, demonstre o uso de polimorfismo criando objetos de cada tipo e chamando o método entregar() para todos.

public interface Entregavel {
    void entregar();
}
