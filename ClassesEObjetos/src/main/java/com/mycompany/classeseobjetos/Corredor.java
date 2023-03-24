package com.mycompany.classeseobjetos;

public class Corredor extends Atleta{
    public Corredor(String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
    }

    @Override
    public String jogar() {
        return "CORRA!";
    }
}
