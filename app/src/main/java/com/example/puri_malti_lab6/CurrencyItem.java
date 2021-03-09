package com.example.puri_malti_lab6;

public class CurrencyItem {

    private String base;
    private double value;

    public CurrencyItem(String base, double value) {
        this.base = base;
        this.value=value;
    }

    public String getBase () { return this.base; }

    public double getValue() {
        return value;
    }

}
