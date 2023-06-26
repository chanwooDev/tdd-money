package com.chanu.money;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    Franc times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
