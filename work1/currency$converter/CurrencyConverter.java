package com.sovannarith.work1.currency$converter;

public abstract class CurrencyConverter {

    protected Double amount;
    protected Double exchangeRate;

    protected abstract Double calculate();

    public abstract void printOutput();

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
