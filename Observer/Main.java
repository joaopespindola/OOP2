import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        PrevisaoTempo pr = new PrevisaoTempo();
        Jornal NYT = new Jornal();
        Aeroporto BSB = new Aeroporto();
        Agricultor Tiao = new Agricultor();
        while(true){
            System.out.println("ESCOLHA A OPCAO");
            System.out.println("1.PREVER O TEMPO");
            System.out.println("2.ADD OBSERVADORES");
            System.out.println("3.REMOVER OBSERVADORES");
            System.out.println("4.SAIR");

            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    pr.predict();
                    break;
                case 2:
                    pr.adicionarObservador(NYT);
                    break;
                case 3:
                    pr.removerObservador(NYT);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("DIGITE OUTRO VALOR");
                    break;
            }

        }


    }
}