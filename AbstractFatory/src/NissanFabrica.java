import java.sql.SQLOutput;

public class NissanFabrica implements FabricaCarro{
    public NissanFabrica() {
    }

    @Override
    public Carro criaCarro() {
        return new NissanCarro();
    }

    @Override
    public Motor criaMotor() {
        return new NissanMotor();
    }

    @Override
    public Acessorio criaAcessorios() {
        return new NissanAcessorio();
    }
}
