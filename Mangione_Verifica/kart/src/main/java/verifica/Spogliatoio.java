package verifica;

public class Spogliatoio {
    
    private int postiMaxSpogliatoio = 2;

    public Spogliatoio(){
        this.postiMaxSpogliatoio=postiMaxSpogliatoio;
    }

    public synchronized void entraSpogliatoio(){
        while(postiMaxSpogliatoio < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        postiMaxSpogliatoio--;
    }

    public synchronized void esciSpogliatoio(){
        postiMaxSpogliatoio++;
        notifyAll();
    }
}
