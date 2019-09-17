package com.sovannarith.work1.currency$converter;

public class Riel extends CurrencyConverter {

    @Override
    protected Double calculate() {
        return amount / exchangeRate;
    }

    @Override
    public void printOutput() {
        String outPut = "Cambodian Riel to US Dollar Conversion : \n" + amount + " USD = " + calculate() + " Riels";
        System.out.println(outPut);
    }
}
