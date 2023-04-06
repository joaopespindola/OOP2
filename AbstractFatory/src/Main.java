public class Main {
    public static void main(String[] args) {
        NissanFabrica nissan = new NissanFabrica();
        AlfaRomeoFabrica alfa = new AlfaRomeoFabrica();
        ToyotaFabrica toyota = new ToyotaFabrica();

        Carro carroToyota = toyota.criaCarro();
        Carro carroAlfa = alfa.criaCarro();
        Carro carroNissan = nissan.criaCarro();

        carroToyota.nomeCarro();
        carroAlfa.nomeCarro();
        carroNissan.nomeCarro();
    }
}