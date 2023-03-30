public class MainSemThread {
    public static void main (String[] args){
        long startTime = System.currentTimeMillis();
        long aux = 0;
        ParalelizacaoSemThread paralelizacaoSemThread = new ParalelizacaoSemThread();
        for(int i = 1; i <= 10; i++){
            aux += paralelizacaoSemThread.run(i);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Total de Linhas: " + aux + " em " + (finalTime - startTime) + " milisegundos");
    }
    /*
        SPECS PC: i3 10100F
                  GTX 1050TI
                  16GB RAM
                  SSD

        SEI QUE COM O USO DAS THREADS, A VELOCIDADE DEVERIA SER REDUZIDA, ENTRETANTO, O MEU PROGRAMA
        NÃO ESTÁ SE COMPORTANDO DE TAL FORMA, ESTOU RECEBENDO OS MESMOS RESULTADOS COM THREAD E SEM THREAD.
     */
}
