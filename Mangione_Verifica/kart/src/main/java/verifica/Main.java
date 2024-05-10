package verifica;

public class Main {
    public static void main(String[] args) {

        Spogliatoio spogliatoio = new Spogliatoio();
        Pista pista = new Pista();

        for (int i = 0; i < 8; i++) {
            Piloti p = new Piloti(i, spogliatoio, pista);
            p.start();
        }
    }
}