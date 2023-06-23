package com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io;

public class Rapper {
    Integer id = 1;
    String nome = "Young MayLay";

    String topSong = "Grand Theft Auto Theme Song";


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTopSong() {
        return topSong;
    }

    public void setTopSong(String topSong) {
        this.topSong = topSong;
    }
}

