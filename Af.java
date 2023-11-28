package atividade;

public class Af {

	public void metodoUm() {
        System.out.println("Este é o método Um.");
    }

    public void metodoDois() {
        System.out.println("Este é o método Dois.");

        // Chamada do método Um dentro do método Dois
        metodoUm();
    }
}
