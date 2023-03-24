package com.mycompany.classeseobjetos;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Atleta implements Comparable<Atleta>{
    //"Comparable <Atleta>" para especificar qual será a classe do Objeto
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String sexo;

    public Atleta(String nome, int idade, double altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Atleta o) {
        return this.nome.compareTo(o.getNome());
    }
    
    //classe Date é uma classe abstrata, logo, devemos ter metodos estaticos para utiliza-la
    public static Date calcularProximaOlimpiada(){
        //pega a data atual
        LocalDate dataAtual = LocalDate.now();
        //objeto com a data da prox olimpiadas
        LocalDate dataProxOlimpiada = LocalDate.of(2024, 7, 26);
        //classe periodo para calcular a diferenca entre duas datas usando o metodo "between"
        Period periodo = Period.between(dataAtual, dataProxOlimpiada);
        int tempoRestante = (periodo.getDays())+(periodo.getMonths()*30)+(periodo.getYears()*365);
        System.out.println("DAQUI " + tempoRestante + " DIAS ACONTECERA A PROXIMA OLIMPIADA");
        Date proxOlimpiada = new Date(2024,7,26);
        return proxOlimpiada;
    }
    
    public String aquecer(int aquecimento){
        return "AQUECENDO";
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public abstract String jogar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

