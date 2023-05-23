public class Aeroporto implements Observer{
    @Override
    public void alteravel(PrevisaoTempo instante) {
        if(instante.getChanceDeChuva() > 70 && instante.getVelocidadeVento() < 30){
            System.out.println("REZA PRA NÃO CAIR");
        }
        else if(instante.getVelocidadeVento() > 60){
            System.out.println("VENTO FORTE");
        }
    }
}
