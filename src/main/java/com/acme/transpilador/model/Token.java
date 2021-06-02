package com.acme.transpilador.model;

public class Token {

    private String tokenVisualg;
    private String tokenJava;
    private int qtdVisualg;
    private int qtdJava;
    private int qtdPHP;

    public Token() {
    }

    public Token(String tokenVisualg, String tokenJava, int qtdVisualg, int qtdJava, int qtdPHP) {
        this.tokenVisualg = tokenVisualg;
        this.tokenJava = tokenJava;
        this.qtdVisualg = qtdVisualg;
        this.qtdJava = qtdJava;
        this.qtdPHP = qtdPHP;
    }

    public String getTokenVisualg() {
        return tokenVisualg;
    }

    public void setTokenVisualg(String tokenVisualg) {
        this.tokenVisualg = tokenVisualg;
    }

    public String getTokenJava() {
        return tokenJava;
    }

    public void setTokenJava(String tokenJava) {
        this.tokenJava = tokenJava;
    }

    public int getQtdVisualg() {
        return qtdVisualg;
    }

    public void setQtdVisualg(int qtdVisualg) {
        this.qtdVisualg = qtdVisualg;
    }

    public int getQtdJava() {
        return qtdJava;
    }

    public void setQtdJava(int qtdJava) {
        this.qtdJava = qtdJava;
    }

    public int getQtdPHP() {
        return qtdPHP;
    }

    public void setQtdPHP(int qtdPHP) {
        this.qtdPHP = qtdPHP;
    }

}
