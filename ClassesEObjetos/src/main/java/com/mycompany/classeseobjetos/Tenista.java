package com.mycompany.classeseobjetos;

public class Tenista extends Atleta{
    public Tenista(String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
    }

    @Override
    public String jogar() {
        return "SOH RAQUETADA";
    }
}
