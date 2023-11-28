package atividade;

public class Af {

	 public void metodoUm() {
        System.out.println("Este é o método Um.");
    }

    public void metodoDois() {
        System.out.println("Este é o método Dois.");

        
        metodoUm();
    }

    public static void main(String[] args) {
       
        MinhaClasse minhaInstancia = new MinhaClasse();

       
        minhaInstancia.metodoDois();
    }
}
