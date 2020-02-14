package br.itau.com.modulo2revisao206.models;

public enum Bandeira {
    MASTERCARD("Mastercard"),
    VISA("Visa"),
    HYPERCARD("Hypercard");

    private String nome;

    private Bandeira(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
