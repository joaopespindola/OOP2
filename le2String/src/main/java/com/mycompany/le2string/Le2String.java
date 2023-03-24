package com.mycompany.le2string;
import java.util.Scanner;

public class Le2String {

    public static void main(String[] args) {
        
        String primeira, segunda, fimprimeira;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("DIGITE A PRIMEIRA STRING");
        primeira = ler.next();
        
        System.out.println("DIGITE A SEGUNDA STRING");
        segunda = ler.next();
        
        //o método substring da classe string retorna uma parte específica de uma determinada String.
        fimprimeira = primeira.substring(1, primeira.length());
        
        //compareTo e compareToIgnoreCase retornam a quantidade de diferenças 
        //quando o retorno for igual a zero significa que não há diferenças entre a String.
        if(fimprimeira.compareToIgnoreCase(segunda) == 0){
            System.out.println("O FIM DA PRIMEIRA ÉH IGUAL A SEGUNDA");
        }
        else{
            System.out.println("O FIM DA PRIMEIRA NAO ÉH IGUAL A SEGUNDA");
        }
    } 
}
