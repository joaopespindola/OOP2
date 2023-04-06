public class AlfaRomeoFabrica implements FabricaCarro{
    @Override
    public Carro criaCarro() {
        return new AlfaRomeoCarro();
    }

    @Override
    public Motor criaMotor() {
        return new AlfaRomeoMotor();
    }

    @Override
    public Acessorio criaAcessorios() {
        return new AlfaRomeoAcessorio();
    }
}
