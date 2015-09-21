package com.marcosdeveloper.appandroid.model;

public class Carro {

    private int id;
    private String marca;
    private String modelo;
    private double motor;
    private int ano;
    private double cavalo;
    private float etanol;
    private float gasolina;
    private double revisao;
    private double seguro;
    private double preco;

    public Carro() {
    }

    public Carro(int id, String marca, String modelo, double motor, int ano, double cavalo, float etanol, float gasolina, double revisao, double seguro, double preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
        this.cavalo = cavalo;
        this.etanol = etanol;
        this.gasolina = gasolina;
        this.revisao = revisao;
        this.seguro = seguro;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCavalo() {
        return cavalo;
    }

    public void setCavalo(double cavalo) {
        this.cavalo = cavalo;
    }

    public float getEtanol() {
        return etanol;
    }

    public void setEtanol(float etanol) {
        this.etanol = etanol;
    }

    public float getGasolina() {
        return gasolina;
    }

    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }

    public double getRevisao() {
        return revisao;
    }

    public void setRevisao(double revisao) {
        this.revisao = revisao;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String row(){
        return marca + " " + modelo + " " + motor+ " " + ano;
    }
}
