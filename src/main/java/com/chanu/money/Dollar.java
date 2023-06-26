package com.chanu.money;

public class Dollar {
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }
}
