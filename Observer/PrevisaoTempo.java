import java.util.ArrayList;
import java.util.Random;

//ESSE É O MEU OBJETO OBSERVÁVEL!!
public class PrevisaoTempo implements Obversable{
    private double temperatura;
    private int umidade;
    private int chanceDeChuva;
    private int velocidadeVento;
    Random random = new Random();
    ArrayList<Observer> observadores = new ArrayList<Observer>();

    @Override
    public void update() {
        try {
            Thread.sleep(10000);
            temperatura = random.nextInt(45);
            umidade = random.nextInt(100);
            chanceDeChuva = random.nextInt(100);
            velocidadeVento = random.nextInt(80);
        } catch (Exception e) {
            System.out.println("FALHA NA PREVISÃO DO TEMPO");
        }
    }

    @Override
    public String toString() {
        return "PrevisaoTempo{" +
                "temperatura=" + temperatura +
                ", umidade=" + umidade +
                ", chanceDeChuva=" + chanceDeChuva +
                ", velocidadeVento=" + velocidadeVento +
                '}';
    }

    public void predict(){
        //LOOP INFINITO
        while(true){

            update();
            System.out.println("" + this.toString());

            for(int i = 0; i < observadores.size(); i++){
                Observer ob = observadores.get(i);
                ob.alteravel(this);
            }
        }
    }

    public void removerObservador(Observer ob) {
        observadores.remove(ob);
    }

    public void adicionarObservador(Observer ob) {
        observadores.add(ob);

    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public int getChanceDeChuva() {
        return chanceDeChuva;
    }

    public int getVelocidadeVento() {
        return velocidadeVento;
    }
}
