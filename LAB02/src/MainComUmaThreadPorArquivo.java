public class MainComUmaThreadPorArquivo {
    public static void main (String[] args){
        long startTime = System.currentTimeMillis();
        long aux = 0;
        ParalelizacaoComUmaThreadPorArquivo paralelizacaoComUmaThreadPorArquivo = new ParalelizacaoComUmaThreadPorArquivo();
        for(int i = 1; i <= 10; i++){
            //CRIANDO UMA THREAD PARA CADA ARQUIVO
            new Thread(paralelizacaoComUmaThreadPorArquivo);
            aux += paralelizacaoComUmaThreadPorArquivo.run(i);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Total de Linhas: " + aux + " em " + (finalTime - startTime) + " milisegundos");
    }
}
