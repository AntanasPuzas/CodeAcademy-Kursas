package com.company;

public class HttpErrorPair<K, V extends HttpCode> implements Comparable<HttpErrorPair<K, V>>{
    private K k;
    private V v;

    public HttpErrorPair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public int compareTo(HttpErrorPair<K, V> o) {
        return this.getV().errorLevels.getValue() - o.getV().errorLevels.getValue();
    }

    @Override
    public String toString() {
        return "HttpErrorPair{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
