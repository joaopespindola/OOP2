public class Jornal implements Observer{
    @Override
    public void alteravel(PrevisaoTempo instante) {
        if(instante.getTemperatura() > 35){
            System.out.println("TÁ CALOR! \uD83E\uDD75");
        }
        if(instante.getTemperatura() < 10){
            System.out.println("TÁ FRIO! \uD83E\uDD76");
        }
        if(instante.getVelocidadeVento() > 40){
            System.out.println("TÁ VENTO!");
        }
        if(instante.getChanceDeChuva() > 50){
            System.out.println("TIRA AS ROUPAS DO ARAME PQ VAI CHOVER!");
        }
        if(instante.getChanceDeChuva() < 30){
            System.out.println("BEBA ÁGUA!");
        }
    }
}
