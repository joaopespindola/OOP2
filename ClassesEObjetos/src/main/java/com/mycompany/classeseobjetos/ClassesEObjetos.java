package com.mycompany.classeseobjetos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;


public class ClassesEObjetos {

    public static void main(String[] args) {

        Atleta[] vetorAtletas = new Atleta[3];
        vetorAtletas[0] = new Futebolista("Usain_Bolt", 19, 1.74, "Masculino");
        vetorAtletas[1] = new Tenista("Rafael_Nadal", 31, 1.91, "Masculino");
        vetorAtletas[2] = new Corredor("Joao_Felix", 22, 1.87, "Masculino");
        

        ArrayList<Atleta> listaAtletas = new ArrayList<Atleta>();
        Futebolista Romario = new Futebolista("Adalberto", 42, 1.85, "Masculindo");
        Tenista Nadal = new Tenista("Romario", 42, 1.85, "Masculindo");
        Corredor PA = new Corredor("Paulo_André", 24, 1.90, "Masculino");
        listaAtletas.add(Romario);
        listaAtletas.add(Nadal);
        listaAtletas.add(PA);
        
        Collections.sort(listaAtletas);
        Arrays.sort(vetorAtletas);
        
        for(int i = 0; i < vetorAtletas.length; i++){
            System.out.println("Nome: " + vetorAtletas[i].getNome() + " " + vetorAtletas[i].aquecer(30) + " " + vetorAtletas[i].jogar());
        }
        
        for(Atleta atleta : listaAtletas){
            System.out.println("Nome: " + atleta.getNome() + " " + atleta.aquecer(30) + " " + atleta.jogar());
        }
        vetorAtletas[0].calcularProximaOlimpiada();
    
    }
}