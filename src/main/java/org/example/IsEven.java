package org.example;

public class IsEven implements IsGood{

    public int item;

    public IsEven(int item) {
        this.item = item;
    }

    @Override
    public boolean isGood(Object item) {
        if(this.item % 2 == 0){
            return true;
        }
        return false;
    }
}
