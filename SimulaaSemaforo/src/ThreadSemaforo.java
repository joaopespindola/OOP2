public class ThreadSemaforo implements Runnable{
    public CorSemaforo getCor() {
        return cor;
    }

    private CorSemaforo cor;
    //todo atributo booleano começa sendo false
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERMELHO;
        //criando uma thread, passando a instância da
        //própria classe Runnable e dando o start para começar o Run
        new Thread(this).start();
    }

    @Override
    public void run() {

        while(!parar){
            try{
                switch (this.cor) {
                    case VERMELHO:

                        Thread.sleep(2000);
                }
                switch (this.cor) {
                    case AMARELO:

                        Thread.sleep(400);
                }
                switch (this.cor) {
                    case VERDE:

                        Thread.sleep(1500);
                }
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //synchronized para que apenas uma thread possa acessar o método por vez
    private synchronized void mudarCor(){
        switch(this.cor){
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            //default para direcionar o programa no caso de ser digitado um valor inválido
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaMudanca(){
        while(!this.corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }
    public synchronized void desliga(){
        this.parar = true;
    }
}

