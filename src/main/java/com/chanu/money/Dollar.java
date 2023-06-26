package com.chanu.money;

public class Dollar extends Money{
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


}
