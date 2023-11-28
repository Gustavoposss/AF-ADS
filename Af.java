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

    public static void main(String[] args) {
        // Criar uma instância da classe
        MinhaClasse minhaInstancia = new MinhaClasse();

        // Chamar o método Dois
        minhaInstancia.metodoDois();
    }
}
