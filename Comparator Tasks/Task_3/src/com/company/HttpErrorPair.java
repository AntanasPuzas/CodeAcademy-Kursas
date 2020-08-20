package com.company;

import com.company.httpCodes.HttpCode;

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
        return o.getV().getErrorLevels().getValue() - this.getV().getErrorLevels().getValue();
    }

    @Override
    public String toString() {
        return "HttpErrorPair{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
