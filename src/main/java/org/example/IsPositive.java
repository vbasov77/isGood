package org.example;

public class IsPositive implements IsGood {

    public int item;

    public IsPositive(int item) {
        this.item = item;
    }

    @Override
    public boolean isGood(Object item) {
        if(this.item > 0){
            return true;
        }
        return false;
    }
}
