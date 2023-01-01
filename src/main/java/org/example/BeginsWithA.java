package org.example;

public class BeginsWithA implements IsGood{

    public String item;

    public BeginsWithA(String item) {
        this.item = item;
    }

    @Override
    public boolean isGood(Object item) {
        String str = String.valueOf(this.item.charAt(0));
        if(str.equals("A")){
            return true;
        }
        return false;
    }
}
