package verifica;

public class Piloti extends Thread {

    private Spogliatoio s;
    private Pista p;
    private int maxGiri = 0;

    public Piloti(int nome, Spogliatoio s, Pista p) {
        this.s = s;
        this.p = p;
        this.maxGiri = maxGiri;
    }

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        try {
            s.entraSpogliatoio();
            System.out.println("Il pilota " + nome + " e' entrato nello spogliatoio a cambiarsi");
            Thread.sleep((int) (Math.random() * 2000) + 3000);
            s.esciSpogliatoio();
            System.out.println("Il pilota " + nome + " ha smesso di cambiarsi");
            p.entraInPista();
            System.out.println("Il pilota " + nome + " e' entrato in pista");
            while (maxGiri < 5) {
                maxGiri++;
                Thread.sleep((int)(Math.random()*1000)+1000);
                System.out.println("Il pilota " + nome + " ha concluto il suo " + maxGiri + " giro");
            }
            p.esciDallaPista();
            System.out.println("Il pilota " + nome + " ha finito i suoi giri ed e' andato a cambiarsi");
            s.entraSpogliatoio();
            System.out.println("Il pilota " + nome + " e' entrato nello spogliatoio e si sta cambiando");
            Thread.sleep((int) (Math.random() * 2000) + 3000);
            s.esciSpogliatoio();
            System.out.println("Il pilota " + nome + " ha smesso di cambiarsi e sta tornando a casa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
