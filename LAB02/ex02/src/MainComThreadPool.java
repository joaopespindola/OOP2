import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainComThreadPool {
    public static void main (String[] args){
        long startTime = System.currentTimeMillis();
        ParalelizacaoComThreadPool paralelizacaoComThreadPool = new ParalelizacaoComThreadPool();
        //NÚMERO DE THREADS FIXADO PARA TESTE COM 10 ARQUIVOS
        ExecutorService executorService = Executors.newFixedThreadPool(9);
        long aux = 0;
        for(int i = 1; i <= 10; i++){
            aux += paralelizacaoComThreadPool.run(i);
            executorService.execute(paralelizacaoComThreadPool);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Total de Linhas: " + aux + " em " + (finalTime - startTime) + " milisegundos");
        executorService.shutdown();
    }
}
