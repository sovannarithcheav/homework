package com.sovannarith.work1.currency$converter;

public class Usd extends CurrencyConverter {

    @Override
    protected Double calculate() {
        return amount * exchangeRate;
    }

    @Override
    public void printOutput() {
        String outPut = "US Dollar to Cambodian Riel Conversion : \n" + amount + " USD = " + calculate() + " Riels";
        System.out.println(outPut);
    }
}
