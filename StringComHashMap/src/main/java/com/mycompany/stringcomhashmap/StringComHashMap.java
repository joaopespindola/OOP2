package com.mycompany.stringcomhashmap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class StringComHashMap {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        //INICIALIZANDO O HASHMAP!!!
        HashMap<Character, Integer> charRepete = new HashMap<>();

        System.out.println("Digite uma String");
        String palavra = ler.nextLine();

        for (int i=0; i < palavra.length(); i++) {
            char cast = palavra.charAt(i);

            if (charRepete.containsKey(cast)){
                charRepete.put(cast, (charRepete.get(cast)+1));
            }
            else{
                charRepete.put(cast, 1);
            }
        }

        System.out.println("" + charRepete);
    }
}
