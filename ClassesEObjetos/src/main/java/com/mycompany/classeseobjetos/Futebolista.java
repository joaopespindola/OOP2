package com.mycompany.classeseobjetos;

public class Futebolista extends Atleta{
    public Futebolista(String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
    }   
        
    @Override
    public String jogar() {
        return "É O FUTE";
    }
}
