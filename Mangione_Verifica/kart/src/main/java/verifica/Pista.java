package verifica;

public class Pista {

    private int postiMaxPista = 4;

    public Pista() {
        this.postiMaxPista = postiMaxPista;
    }

    public synchronized void entraInPista() {
        while(postiMaxPista<1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        postiMaxPista--;
    }

    public synchronized void esciDallaPista(){
        postiMaxPista++;
        notifyAll();
    }
}
