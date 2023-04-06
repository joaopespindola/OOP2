public class ToyotaFabrica implements FabricaCarro{
    @Override
    public Carro criaCarro() {
        return new ToyotaCarro();
    }

    @Override
    public Motor criaMotor() {
        return new ToyotaMotor();
    }

    @Override
    public Acessorio criaAcessorios() {
        return new ToyotaAcessorio();
    }
}
