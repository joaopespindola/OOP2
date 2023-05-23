public class Agricultor implements Observer{
    @Override
    public void alteravel(PrevisaoTempo instante) {
        if(instante.getChanceDeChuva() < 10){
            System.out.println("LIGANDO OS IRRIGADORES");
        }
    }
}
