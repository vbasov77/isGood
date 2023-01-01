package org.example;

public class BeginsWith implements IsGood{

    public String item;
    public String str;

    public BeginsWith(String item) {
        this.item = item;
        this.str = "abcd";
    }

    @Override
    public boolean isGood(Object item) {
        if(this.item.equals(this.str)){
            return true;
        }
        return false;
    }
}
