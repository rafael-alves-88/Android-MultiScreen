package com.example.rm40300.androidmultitelas;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String nome;
    private String versao;

    public Item() {

    }

    public Item(String nome, String versao) {
        this.nome = nome;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public String toString() {
        return nome;
    }

    public static List<Item> getItens() {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("KitKat", "Versão 4.4"));
        itens.add(new Item("Lollipop", "Versão 5.0"));
        itens.add(new Item("Marshmallow", "Versão 6.0"));

        return itens;
    }
}
