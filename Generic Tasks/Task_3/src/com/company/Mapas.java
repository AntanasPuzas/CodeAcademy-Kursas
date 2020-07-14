package com.company;

import java.util.ArrayList;

public class Mapas <K, V> {
    ArrayList<Pora> sarasasPoru = new ArrayList<>();

    public Mapas(ArrayList<Pora> sarasasPoru) {
        this.sarasasPoru = sarasasPoru;
    }

    public Mapas() {}

    public ArrayList<Pora> getSarasasPoru() {
        return sarasasPoru;
    }

    public void setSarasasPoru(ArrayList<Pora> sarasasPoru) {
        this.sarasasPoru = sarasasPoru;
    }

    public <K, V> void ideti(K key, V value) {
        Pora pora = new Pora(key, value);
        sarasasPoru.add(pora);
    }

    public <K, V> V gauti(K key) {
        for (Pora pora : sarasasPoru) {
            if (key.equals(pora.getK())) {
                return (V) pora.getV();
            }
        }
        return null;
    }
}

