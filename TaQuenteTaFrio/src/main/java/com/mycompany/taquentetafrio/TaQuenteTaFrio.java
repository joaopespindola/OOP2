package com.mycompany.taquentetafrio;
import java.util.Random;
import java.util.Scanner;

public class TaQuenteTaFrio {

    public static void main(String[] args) {
        
        int x, numChutado;
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        x = gerador.nextInt(101);

        do {
            System.out.println("CHUTE UM NUMERO");
            numChutado = ler.nextInt();
            if(numChutado < x){
                System.out.println("NUMERO MUITO BAIXO");
            }
            else if(numChutado > x){
                System.out.println("NUMERO MUITO ALTO");
            }
        }while(numChutado != x);
        
        System.out.println("ADIVNHOU!!! PARABENS");
    }
}
